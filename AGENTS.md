# Proje ajan rehberi

Bu dosya yalnızca depo genelindeki çalışma kurallarını ve belge yönlendirmesini taşır. Kişisel mentorluk tercihleri burada tekrar edilmez.

## janus-tickets bağlamı

- Bu proje, `backend-portfoy-proje-onerileri.md` içindeki Ana proje 1'dir. Depoya aktarılmış kapsamın kaynağı `docs/project.md` içindedir.
- Kaynakta açıkça belirtilmeyen kapsam, başarı ölçütü veya mimari kararı üretme; eksik olanı kullanıcıya sor. Açık konuları kabul edilmiş hedef gibi kullanma.
- Kullanıcı kabul etmeden `docs/decisions/` altında yeni ADR yazma. `0000-template.md` yalnız boş şablondur.

## Başlangıç ve seçici okuma

- Etkin işi kullanıcının güncel isteği belirler. `docs/work.md` yalnız ilgili göreve devam ederken bağlam sağlar; eski bir "sonraki adım" yeni isteği gölgelemez.
- Proje bağlamı gerektiren yeni bir görevde önce `docs/work.md` dosyasını oku; durumunu Git, ilgili kod ve testlerle doğrula.
- Amaç, kapsam veya başarı ölçütü için `docs/project.md`; dış davranış, veri ve hata garantileri için yalnız ilgili `docs/contracts/` dosyasını aç.
- Bileşen sınırları değişiyorsa `docs/design.md`; test yaklaşımı değişiyorsa `docs/verification.md`; kalıcı bir karar etkileniyorsa ilgili **kabul edilmiş** ADR'yi oku.
- Çalıştırma ve doğrulama komutları için `README.md` dosyasına bak. Komutlar hâlâ şablon yer tutucusuysa çalışır komut varsayma; gerçek proje dosyalarından doğrula ve README'yi tamamla. Küçük, yerel bir düzeltmede bütün belgeleri okuma; ilgili kodu ve testi incele.

## Kaynakların anlamı

- Onaylanmış hedef: `docs/project.md`, `docs/design.md`, `docs/verification.md` ve sözleşmelerin **kullanıcıca kabul edilmiş kısımları** ile kabul edilmiş ADR'ler. Dosya varlığı veya taslak durum tek başına karar değildir.
- Bugünkü davranışın kanıtı: kod, yapılandırma, migration'lar ve testler. Belgeler bunların yerine geçmez.
- `docs/work.md` geçici devir notudur; gerçekliği doğrulanmadan kesin bilgi sayma.
- Hedef ile kod veya kabul edilmiş belgeler birbiriyle çelişirse farkı görünür kıl; sessizce taraf seçme. Kullanıcının güncel isteğiyle değişen kritik bir kararı ilgili belgeye geçir.

## Çalışma sınırı

- Veri/API sözleşmesi, hata veya geri dönüş garantisi, mimari sınır, test stratejisi ve başarı ölçütü değişikliklerinde nihai kararı kullanıcı verir; açıkça devredilmişse gerekçeyle seç.
- Rutin ve kolay geri alınabilir ayrıntılarda ilerle. Kod değişikliğini ilgili testlerle doğrula.
- Yalnız etkilenen belgeleri güncelle. `docs/work.md` dosyasını anlamlı görev sınırlarında kısa bir durum özetiyle **yeniden yaz**; sohbet günlüğüne veya kod envanterine dönüştürme.
- Secret, kişisel veri, ham test günlüğü veya uydurulmuş doğrulama sonucu belgelere yazma.
