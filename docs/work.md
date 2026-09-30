# Devam eden iş

**Güncelleme:** 2026-09-30
**Aşama:** Proje #1 kaynak bağlamı tamamlandı; gereksinim/veri sözleşmesi kararı bekliyor.

- **Durum:** Kullanıcının yeni tercihi Java 25 LTS; Temurin 25.0.4.1 kuruldu. Spring Boot 4.1.1, PostgreSQL 18.6 ve Maven Wrapper hazır. Kullanıcı GitHub reposunu oluşturdu: https://github.com/otahacakirci/janus-tickets.
- **Değişen alanlar:** docs/project-source.md kaynak bağlamını içerir; AGENTS ilk kapsam okuması/sonraki seçici okumayı tarif eder. README, project/design/verification bu belgeye yönlendirir; sonraki kullanıcı tercihleri project.md içinde ayrı kalır. Kullanıcının isteğiyle repo dışı belge atıfları/yerel dosya bağlantıları kaldırıldı; teknik açıklamalar ve dış mühendislik kaynakları korundu. Bu belge güncellemesi yerel commit kapsamındadır; uzak depoya gönderim yapılmadı.
- **Son kanıt:** Proje #1 bölümünün metni ve bağlantıları bu düzenlemede değişmedi. Dokuz Markdown belgesindeki 15 repo içi bağlantı geçerli; kaldırılan dosyaya atıf veya repo dışına çıkan dosya bağlantısı yok. Maven/CI Java 25 ve Compose/Testcontainers PostgreSQL 18.6 ayarları tutarlı. Yalnız belgeler değişti; uygulama testleri yeniden çalıştırılmadı.
- **Kurulum kanıtı:** Önceki Java 25.0.4.1 `clean verify` başarılı: 1 test, 0 hata, 0 atlama. Compose/PostgreSQL ve uygulama başlangıcı doğrulandı; 5432 dolu olduğundan yerel kontrolde 15432 kullanıldı, test kaynakları temizlendi.
- **GitHub:** İlk kurulum main dalına gönderildi. [CI 36705466005](https://github.com/otahacakirci/janus-tickets/actions/runs/36705466005) başarılı. Main dalında zorunlu `verify` kontrolü yöneticiye de uygulanır; başarısız kontrol merge'i engeller.
- **Açık kararlar:** project.md içindeki API/veri sözleşmesi, sürüm düzeni, taşıma/uzlaştırma ve deney ölçütleri. Yeni ADR yok.
- **Sıradaki adım:** API/veri sözleşmesini kullanıcıyla netleştir. Kurulum testi yalnız başlangıç/bağlantıyı kanıtlar; karma sürüm ve uzlaştırma testleri henüz yok.
