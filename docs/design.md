# Kaynakta belirtilen tasarım sınırları

Kaynak: [özgün proje önerisi](project-source.md). Bu belge tasarım sınırlarının kısa özetidir; gerekçeler ve uyarılar kaynak dosyasında korunur. Yeni mimari karar üretmez.

- Aynı uygulamanın iki Spring Boot sürümü, aynı sunucuda aynı PostgreSQL'i kullanır; iki ayrı mikroservis değildir.
- Veri erişimi açık SQL ile JdbcClient; şema değişiklikleri Flyway üzerinden.
- Geçiş sürümü iki temsili aynı transaction içinde yazar.
- Eski sürüm çalışırken eski e-posta sütunu okuma kaynağıdır.
- Eski sürüm kapandıktan sonra bütün kayıtlar yeniden uzlaştırılıp eşitlik doğrulanmadan yeni temsil okuma kaynağı olmaz. Yalnız yüksek ID'leri taramak sonradan güncellenen eski kayıtları kaçırabilir.
- Geri dönüş hakkı sürerken eski sütun güncel tutulur. Sütunun kaldırılması, onu okuyan/yazan süreç kalmadığı kanıtına bağlıdır.
- Taşıma tekrar çalıştırılabilir olmalıdır.

Sürüm artefaktlarının düzeni, uygulama içi katmanlar, taşıma ilerleme kaydı, eşzamanlılık politikası, uzlaştırma ölçümü ve geçiş/geri dönüş aşamalarının ayrıntıları kullanıcı kararı bekler. Başlangıç uygulamasında bu davranışlar henüz yoktur.
