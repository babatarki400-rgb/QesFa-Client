# QesFa Client (Android)

İlk sürüm: koyu/neon-yeşil launcher arayüzü, Ana Sayfa/Modlar/Ayarlar ekranları ve kurulu Minecraft Bedrock uygulamasını açan PLAY butonu.

## Gereksinimler
- Android Studio güncel sürüm
- Android SDK Platform 35
- JDK 17
- Android telefon veya emülatör (gerçek Minecraft açma testi için Minecraft Bedrock kurulu olmalı)

## Çalıştırma
1. ZIP'i aç.
2. Android Studio > Open ile `QesFaClient` klasörünü aç.
3. Gradle senkronizasyonunun bitmesini bekle.
4. USB hata ayıklama açık Android cihazını bağla veya emülatör seç.
5. Run (▶) tuşuna bas.

## APK oluşturma
Android Studio: **Build > Build Bundle(s) / APK(s) > Build APK(s)**.
APK genellikle `app/build/outputs/apk/debug/app-debug.apk` konumunda oluşur.

## Şu anki sınırlar
- Bu proje gerçek Minecraft oyun motorunu içermez; telefonda kurulu resmi Minecraft Bedrock uygulamasını açmayı dener.
- Mod ekranları şu anda arayüz örneğidir; otomatik mod indirme/kurma henüz uygulanmadı.
- Android'de Bedrock için Java Edition modları/Fabric/Forge kullanılamaz. Paketler Minecraft Bedrock ile uyumlu olmalıdır.
- 1.21.x bir sürüm ailesidir; gerçek oyun sürümünü bu uygulama doğrulamaz.
