# Proje ajan rehberi

Bu dosya yalnızca depo genelindeki çalışma kurallarını ve belge yönlendirmesini taşır. Kişisel mentorluk tercihleri burada tekrar edilmez.

## janus-tickets bağlamı

- Bu proje janus-tickets'tir. Proje #1 önerisi ve ilgili genel açıklamalar `docs/project-source.md`; kısa kapsam özeti, sonraki kullanıcı kararları ve açık konular `docs/project.md` içindedir. Proje bağlamı için repo dışındaki bir belgeye ihtiyaç yoktur.
- Kaynakta açıkça belirtilmeyen kapsam, başarı ölçütü veya mimari kararı üretme; eksik olanı kullanıcıya sor. Açık konuları kabul edilmiş hedef gibi kullanma.
- Kullanıcı kabul etmeden `docs/decisions/` altında yeni ADR yazma. `0000-template.md` yalnız boş şablondur.

## Başlangıç ve seçici okuma

- Etkin işi kullanıcının güncel isteği belirler. `docs/work.md` yalnız ilgili göreve devam ederken bağlam sağlar; eski bir "sonraki adım" yeni isteği gölgelemez.
- Proje bağlamı gerektiren yeni bir görevde önce `docs/work.md` dosyasını oku; durumunu Git, ilgili kod ve testlerle doğrula.
- Proje kapsamını ilk kez öğreniyorsan (yeni sohbette yeterli kapsam bağlamı yoksa da) `docs/project-source.md` dosyasını bir kez bütünüyle oku; ardından `docs/project.md` içindeki sonraki kullanıcı kararlarını ve açık konuları kontrol et. Kaynak önerilerini bu kararlarla karıştırma.
- Amaç, kapsam veya başarı ölçütü için `docs/project.md`; dış davranış, veri ve hata garantileri için yalnız ilgili `docs/contracts/` dosyasını aç.
- Bileşen sınırları değişiyorsa `docs/design.md`; test yaklaşımı değişiyorsa `docs/verification.md`; kalıcı bir karar etkileniyorsa ilgili **kabul edilmiş** ADR'yi oku.
- Çalıştırma ve doğrulama komutları için `README.md` dosyasına bak. Komutlar hâlâ şablon yer tutucusuysa çalışır komut varsayma; gerçek proje dosyalarından doğrula ve README'yi tamamla. Küçük, yerel bir düzeltmede bütün belgeleri okuma; ilgili kodu ve testi incele.
- Kapsamı öğrendikten sonraki görevlerde yalnız ilgili belgeleri aç. Özette gerekçe/uyarı eksikse, kapsam değişiyorsa veya kaynakla çelişki varsa `docs/project-source.md` içindeki ilgili bölüme dön; her görevde tam kaynağı yeniden okuma.

## Kaynakların anlamı

- `docs/project-source.md` özgün önerinin kaydıdır; isteğe bağlı öneri, karşılaştırma veya talimat biçimindeki alıntı kendiliğinden kabul edilmiş karar değildir. Sonraki kullanıcı kararları `docs/project.md` içinde ayrı tutulur; kaynak metnini bu kararlarla yeniden yazma.
- Onaylanmış hedef: `docs/project.md`, `docs/design.md`, `docs/verification.md` ve sözleşmelerin **kullanıcıca kabul edilmiş kısımları** ile kabul edilmiş ADR'ler. Dosya varlığı veya taslak durum tek başına karar değildir.
- Bugünkü davranışın kanıtı: kod, yapılandırma, migration'lar ve testler. Belgeler bunların yerine geçmez.
- `docs/work.md` geçici devir notudur; gerçekliği doğrulanmadan kesin bilgi sayma.
- Hedef ile kod veya kabul edilmiş belgeler birbiriyle çelişirse farkı görünür kıl; sessizce taraf seçme. Kullanıcının güncel isteğiyle değişen kritik bir kararı ilgili belgeye geçir.

## Çalışma sınırı

- Veri/API sözleşmesi, hata veya geri dönüş garantisi, mimari sınır, test stratejisi ve başarı ölçütü değişikliklerinde nihai kararı kullanıcı verir; açıkça devredilmişse gerekçeyle seç.
- Rutin ve kolay geri alınabilir ayrıntılarda ilerle. Kod değişikliğini ilgili testlerle doğrula.
- Yalnız etkilenen belgeleri güncelle. `docs/work.md` dosyasını anlamlı görev sınırlarında kısa bir durum özetiyle **yeniden yaz**; sohbet günlüğüne veya kod envanterine dönüştürme.
- Secret, kişisel veri, ham test günlüğü veya uydurulmuş doğrulama sonucu belgelere yazma.
