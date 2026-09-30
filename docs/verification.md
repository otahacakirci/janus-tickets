# Doğrulama

Komutların tek kaynağı: [README](../README.md).

## Yol haritasındaki doğrulama hedefleri

| Davranış | Kaynakta istenen kanıt |
| --- | --- |
| Karma sürüm uyumluluğu | Eşzamanlı trafikte iki sürümden okuma |
| Taşımanın tekrar çalışması | Kesilme/yeniden başlatma sonrası veri kaybı olmaması |
| Uzlaştırma | Eski sürüm kapandıktan sonra bütün kayıtların iki temsili arasında eşitlik |
| Geri dönüş | Güvenli dönüş sınırının deneyle gösterilmesi |
| CI | Maven Wrapper derleme/test; karma sürüm veya uzlaştırma hatasında başarısız kontrol |

JUnit, MockMvc ve PostgreSQL Testcontainers kaynakta belirtilmiştir. Kesin senaryolar, veri miktarı ve diğer kabul eşikleri kullanıcı kararı bekler.

## Kurulum kontrolü

JanusTicketsApplicationTests, Spring bağlamının ve gerçek PostgreSQL 18.6 bağlantısının açılabildiğini SELECT 1 ile kontrol eder. İş davranışı veya karma sürüm kanıtı değildir. Docker gerektirir; Docker olmadığında atlanmaz.

Son çalıştırma sonucu [devir notunda](work.md) tutulur. GitHub üzerindeki çalıştırma ve zorunlu CI/merge kuralı, uzak repo oluşturulduğunda doğrulanmalıdır.
