# janus-tickets

Aynı PostgreSQL'e yazan eski ve yeni Spring Boot sürümleri arasında güvenli veri modeli değişikliğini inceleyen küçük destek kaydı HTTP API'si. Portföy yol haritasındaki Ana proje 1.

## Kurulum

Java 25, Spring Boot 4.1.1, Maven Wrapper 3.9.16 ve PostgreSQL 18.6. Güncel kararlı sürümler 30 Eylül 2026'da doğrulandı ve tekrar üretilebilirlik için sabitlendi. Java 25 ve çalışan Linux container destekli Docker/Compose gereklidir; ayrı Maven kurulumu gerekmez.

Windows PowerShell:

```powershell
$env:JAVA_HOME = 'C:\Program Files\Eclipse Adoptium\jdk-25.0.4.101-hotspot'
$env:Path = "$env:JAVA_HOME\bin;$env:Path"
java -version
.\mvnw.cmd --version
```

Başka makinede JAVA_HOME değerini kendi JDK 25 kurulumuna göre değiştir.

## Yerel çalıştırma

```powershell
$env:POSTGRES_PASSWORD = '<yerel-gelistirme-parolan>'
docker compose up -d --wait
.\mvnw.cmd spring-boot:run
```

Parola aynı oturumda uygulamaya ve Compose'a aktarılır; repoya yazılmaz. PostgreSQL yalnız yerel makinenin 5432 portuna açılır. Uygulama bağlantısı gerektiğinde JANUS_DB_URL ve JANUS_DB_USER ortam değişkenleriyle değiştirilebilir.

5432 portu doluysa başlatmadan önce aynı oturumda alternatif port ve bağlantıyı ayarla:

```powershell
$env:JANUS_DB_PORT = '15432'
$env:JANUS_DB_URL = 'jdbc:postgresql://localhost:15432/janus_tickets'
```

```powershell
docker compose down
```

Bu komut veri volume'unu korur. Henüz HTTP endpoint'i veya iş şeması yok; veri/API sözleşmesi kararı bekleniyor.

## Doğrulama

```powershell
.\mvnw.cmd --batch-mode --no-transfer-progress verify
```

Linux/macOS ve CI:

```sh
bash ./mvnw --batch-mode --no-transfer-progress verify
```

Başlangıç testi Spring'i açıp geçici Testcontainers PostgreSQL 18.6 üzerinde SELECT 1 çalıştırır. Docker yoksa başarısız olur; sessizce atlanmaz. Karma sürüm uyumluluğu veya veri taşıma doğruluğunu henüz kanıtlamaz.

GitHub Actions her push ve pull request'te aynı doğrulamayı çalıştırır. Depo: [otahacakirci/janus-tickets](https://github.com/otahacakirci/janus-tickets). CI ve zorunlu merge kontrolünün doğrulama durumu [devir notunda](docs/work.md) tutulur.

## Proje bağlamı

- [Kapsam ve açık kararlar](docs/project.md)
- [Kaynakta belirtilen tasarım sınırları](docs/design.md)
- [Doğrulama](docs/verification.md)
- [Devam eden iş](docs/work.md)
- [Ajan rehberi](AGENTS.md)

Kod: src/main/java/dev/janus/tickets/. Testler: src/test/java/dev/janus/tickets/.
