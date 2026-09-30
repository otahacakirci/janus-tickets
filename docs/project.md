# janus-tickets — proje hedefi

**Kaynak:** backend-portfoy-proje-onerileri.md, “Ana proje 1 — Karma sürümde güvenli veri modeli değişikliği”; 30 Eylül 2026'daki dosya.
**Yetki:** Kullanıcı bu projeyi Proje #1 olarak seçti. Kapsam yalnız kaynakta açıkça yazılanların aktarımıdır; açık konular karar değildir.

## Sorun ve kapsam

Eski ve yeni uygulama sürümleri aynı veritabanına yazarken veri modelini değiştirmek; canlı okumayı, yeniden başlatılabilir taşımayı ve güvenli geri dönüşü göstermek.

- Küçük destek kaydı HTTP API'si; kısa açıklama ve başvuranın e-posta adresi.
- Eski model: tickets.requester_email. Yeni model: requesters tablosu ve tickets.requester_id ilişkisi.
- Tek sunucuda aynı PostgreSQL'e bağlanan eski ve yeni Spring Boot süreçleri. Aynı uygulamanın iki sürümüdür.
- Genişletilmiş şema, çift yazma, tekrar çalıştırılabilir taşıma, tam uzlaştırma ve geri dönüş deneyi.
- Java, Spring Boot MVC, Maven, PostgreSQL, Flyway, JdbcClient, JUnit, MockMvc, PostgreSQL Testcontainers, Docker Compose ve GitHub Actions.
- Kaynak Kafka eklenmemesini, Redis'in doğruluk kaynağı olmamasını belirtir. Kubernetes isteğe bağlıdır; kullanıcı bu deneyi henüz seçmedi.

## Kaynakta belirtilen başarı kanıtları

- Birkaç bin istekle eşzamanlı trafikte kayıtların her iki sürümden okunabilmesi.
- Taşıma kesilip yeniden başlatıldığında veri kaybı olmaması.
- Eski sürüme dönüşün hangi noktaya kadar güvenli olduğunun gösterilmesi.
- Her pull request'te Maven Wrapper derleme ve test; karma sürüm veya uzlaştırma testi başarısızsa CI'ın başarısız olması ve değişikliğin birleştirilmemesi.

Kesin istek/kayıt sayısı, trafik dağılımı, performans eşiği ve kapsam yüzdesi kaynakta yoktur; eklenmedi.

## Kullanıcı kararı bekleyenler

- HTTP işlemleri, yolları, girdi/çıktı şemaları, doğrulama ve hata yanıtları.
- E-posta eşitliği/normalizasyonu ve requesters paylaşım/benzersizlik kuralları.
- Eski/yeni sürüm artefaktlarının repoda temsil edilmesi ve geçiş/geri dönüş aşamalarının ayrıntıları.
- Taşımanın ilerleme kaydı, eşzamanlılık davranışı ve tutarsızlık ölçümü.
- Deneyin kesin veri/istek sayısı, hata enjeksiyonları ve ayrıntılı test kabul ölçütleri.

## Kullanıcının ek kurulum tercihi

30 Eylül 2026: Kullanıcı ilk Java 21 tercihini Java 25 LTS olarak değiştirdi; Spring Boot ve PostgreSQL'in en son sürümleri tercih edildi. Resmî kaynaklarda doğrulanan güncel kararlı sürümler Spring Boot 4.1.1 ve PostgreSQL 18.6 olarak sabitlendi.

İlham kaynakları: [GitLab karma sürüm uyumluluğu](https://docs.gitlab.com/development/multi_version_compatibility/), [kesintisiz migration](https://docs.gitlab.com/development/database/avoiding_downtime_in_migrations/).
