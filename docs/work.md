# Devam eden iş

**Güncelleme:** 2026-09-30
**Aşama:** Proje #1 kurulum doğrulaması.

- **Durum:** Kullanıcının yeni tercihi Java 25 LTS; Temurin 25.0.4.1 kuruldu. Spring Boot 4.1.1, PostgreSQL 18.6 ve Maven Wrapper hazır. Kullanıcı GitHub reposunu oluşturdu: https://github.com/otahacakirci/janus-tickets.
- **Değişen alanlar:** README/bağlam belgeleri; Maven/Java başlangıcı; PostgreSQL Compose; Testcontainers bağlantı kontrolü; GitHub Actions.
- **Son kanıt:** Java 25.0.4.1 ile `clean verify` başarılı: 1 test, 0 hata, 0 atlama. Compose PostgreSQL 18.6 sağlıklı; SELECT 1 ve paketlenmiş uygulamanın veritabanı bağlantısı/Flyway başlangıcı doğrulandı. 5432 mevcut bir süreç tarafından kullanıldığı için yerel kontrolde 15432 kullanıldı; README alternatif portu açıklar. Bu kontrolün uygulama/container/volume kaynakları temizlendi.
- **Bekleyen kontrol:** İlk dosyaların GitHub'a aktarılması, CI çalıştırması ve zorunlu merge kontrolü.
- **Açık kararlar:** project.md içindeki API/veri sözleşmesi, sürüm düzeni, taşıma/uzlaştırma ve deney ölçütleri. Yeni ADR yok.
- **Sıradaki adım:** GitHub CI/merge kontrolünü doğrula. Ardından API/veri sözleşmesini kullanıcıyla netleştir.
