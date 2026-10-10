# 📱 دليل الإعداد الكامل - EL.POP Android App

## ✅ جميع الإعدادات في ملف واحد

---

## 📋 جدول المحتويات
1. [المتطلبات الأساسية](#المتطلبات-الأساسية)
2. [خطوات التثبيت](#خطوات-التثبيت)
3. [بناء APK](#بناء-apk)
4. [تثبيت على الهاتف](#تثبيت-على-الهاتف)
5. [استكشاف الأخطاء](#استكشاف-الأخطاء)

---

## 🔧 المتطلبات الأساسية

### للجميع:
- ✅ Java 17 أو أحدث
- ✅ 4 GB RAM على الأقل
- ✅ 2 GB مساحة تخزين
- ✅ اتصال إنترنت

### معلومات المشروع:
```
اسم التطبيق: EL.POP
معرّف التطبيق: com.elpop.studio
إصدار التطبيق: 1.0.0
الحد الأدنى Android: 5.0 (API 23)
الهدف: Android 14 (API 34)
```

---

## 🛠️ خطوات التثبيت

### الخطوة 1: تثبيت Java

#### على Windows:
```bash
# تحميل من:
https://www.oracle.com/java/technologies/downloads/#java17

# تحقق من التثبيت:
java -version
javac -version
```

#### على macOS:
```bash
# باستخدام Homebrew
brew install openjdk@17

# تحقق:
java -version
```

#### على Linux:
```bash
# Ubuntu/Debian
sudo apt update
sudo apt install openjdk-17-jdk

# تحقق:
java -version
```

---

### الخطوة 2: تثبيت Android Studio

1. **انزّل من:** https://developer.android.com/studio
2. **شغّل المثبّت واتبع الخطوات**
3. **ثبّت Android SDK:**
   - افتح Android Studio
   - File → Settings → Appearance & Behavior → System Settings → Android SDK
   - ثبّت:
     - Android 14 (API 34)
     - Android SDK Build-tools 34.0.0
     - Android SDK Platform-tools

---

### الخطوة 3: نسخ المشروع

#### الطريقة الأولى (Git):
```bash
# فتح Terminal/CMD
git clone https://github.com/amelpop1122-web/EL-POP-Android-App.git
cd EL-POP-Android-App
```

#### الطريقة الثانية (ZIP):
1. اذهب إلى: https://github.com/amelpop1122-web/EL-POP-Android-App
2. اضغط Code → Download ZIP
3. فك الضغط في مجلد على جهازك

---

### الخطوة 4: فتح في Android Studio

1. افتح Android Studio
2. اختر **File → Open**
3. اختر مجلد المشروع
4. اضغط **OK**
5. **انتظر حتى ينتهي التحميل** (قد يستغرق 5-10 دقائق)
   - ستظهر رسائل حول Gradle Sync
   - اتركها تنتهي تماماً
6. قد تظهر رسالة "Install missing SDK" - اضغط **Install**

---

## 🎯 بناء APK

### الطريقة الأولى: عبر Android Studio (الأسهل)

#### خطوات بسيطة:

```
1. انتظر حتى تنتهي عملية Sync
2. من القائمة العلوية: Build
3. اختر: Build Bundle(s) / APK(s)
4. اختر: Build APK(s)
5. انتظر حتى تنتهي العملية
6. ستظهر رسالة بموقع الملف
```

#### موقع الملف النهائي:
```
app/build/outputs/apk/debug/app-debug.apk
```

---

### الطريقة الثانية: عبر Terminal (سريعة)

#### على Windows (Command Prompt):
```bash
# انتقل لمجلد المشروع
cd C:\Users\YourName\EL-POP-Android-App

# بناء Debug APK
gradlew.bat assembleDebug

# أو بناء Release APK (أفضل)
gradlew.bat assembleRelease
```

#### على macOS/Linux:
```bash
# انتقل لمجلد المشروع
cd ~/EL-POP-Android-App

# بناء Debug APK
./gradlew assembleDebug

# أو بناء Release APK (أفضل)
./gradlew assembleRelease
```

#### النتيجة:
```
Debug: app/build/outputs/apk/debug/app-debug.apk
Release: app/build/outputs/apk/release/app-release.apk
```

---

### الطريقة الثالثة: بناء سريع جداً

```bash
# نسخ هذا الأمر فقط
./gradlew assembleDebug --parallel
```

---

## 📲 تثبيت على الهاتف

### الطريقة الأولى: عبر Android Studio

```
1. وصّل الهاتف بـ USB
2. فعّل USB Debugging على الهاتف
3. من Android Studio: Run → Run 'app'
4. اختر جهازك
5. سيتم التثبيت والتشغيل تلقائياً
```

### الطريقة الثانية: عبر ADB (سطر الأوامر)

#### على Windows:
```bash
# تأكد من وجود ADB
where adb

# ثبّت التطبيق
adb install app\build\outputs\apk\debug\app-debug.apk
```

#### على macOS/Linux:
```bash
# تأكد من وجود ADB
which adb

# ثبّت التطبيق
adb install app/build/outputs/apk/debug/app-debug.apk
```

### الطريقة الثالثة: نقل يدوي

1. ابحث عن ملف `app-debug.apk`
2. انسخه على الهاتف
3. افتح ملف المدير على الهاتف
4. اضغط على الملف
5. اختر **تثبيت**

---

## 🔐 تفعيل USB Debugging على الهاتف

### خطوات تفعيل Developer Mode:

1. افتح الإعدادات
2. اذهب لـ: Settings → About Phone
3. ابحث عن "Build Number" أو "رقم الإصدار"
4. اضغط عليه 7 مرات متتالية
5. ستظهر رسالة "Developer Mode Enabled"
6. عد للخطوة 2 وافتح Developer Options
7. فعّل "USB Debugging"

---

## 🐛 استكشاف الأخطاء

### المشكلة: "Gradle sync failed"

**الحل:**
```bash
# فتح Terminal في مجلد المشروع
cd path/to/EL-POP-Android-App

# تنظيف وإعادة بناء
./gradlew clean
./gradlew sync
```

أو في Android Studio:
- File → Invalidate Caches → Invalidate and Restart

---

### المشكلة: "No connected devices"

**الحل:**
```bash
# تحقق من الأجهزة المتصلة
adb devices

# إذا لم يظهر الجهاز:
# 1. أعد التشغيل
# 2. جرّب USB مختلف
# 3. ثبّت Google USB Drivers
```

---

### المشكلة: "Build failed"

**الحل:**
```bash
# تنظيف شامل
./gradlew clean

# إعادة بناء
./gradlew assembleDebug -x test
```

---

### المشكلة: "لا يتعرف على Java"

**الحل - على Windows:**
```bash
# عيّن مسار Java يدوياً
set JAVA_HOME=C:\Program Files\Java\jdk-17

# ثم جرّب الأمر مرة أخرى
gradlew.bat assembleDebug
```

**الحل - على macOS/Linux:**
```bash
# عيّن مسار Java يدوياً
export JAVA_HOME=/usr/libexec/java_home -v 17

# ثم جرّب الأمر مرة أخرى
./gradlew assembleDebug
```

---

## 📊 معلومات البناء

### حجم الملف:
- Debug APK: ~5-8 MB
- Release APK: ~3-4 MB (محسّن)

### وقت البناء الأول:
- ~3-5 دقائق (يتحمّل الأدوات)
- البناء التالي: ~1-2 دقيقة

### مواصفات الجهاز المطلوبة للتشغيل:
```
Android: 5.0+ (API 23+)
RAM: 512 MB على الأقل
المساحة: 50 MB
```

---

## 🎨 الألوان المستخدمة

| الاسم | الكود | الاستخدام |
|------|------|----------|
| أساسي | #FF6B35 | الأزرار والعناوين |
| ثانوي | #004E89 | العناصر الإضافية |
| خلفية | #F5F7FA | الخلفية العام |

---

## 📱 بيانات التطبيق

```
اسم التطبيق: EL.POP
الحزمة: com.elpop.studio
الإصدار: 1.0.0
كود الإصدار: 1
الشعار: أيقونة برتقالي وأزرق
```

---

## 🚀 الخطوات السريعة (ملخص)

```bash
# 1. استنسخ المشروع
git clone https://github.com/amelpop1122-web/EL-POP-Android-App.git

# 2. انتقل للمجلد
cd EL-POP-Android-App

# 3. بناء APK
./gradlew assembleDebug

# 4. البحث عن الملف
# Windows: app\build\outputs\apk\debug\app-debug.apk
# macOS/Linux: app/build/outputs/apk/debug/app-debug.apk

# 5. تثبيت على الهاتف (اختياري)
adb install app/build/outputs/apk/debug/app-debug.apk
```

---

## 📞 الدعم والمساعدة

### روابط مهمة:
- 🔗 مستودع GitHub: https://github.com/amelpop1122-web/EL-POP-Android-App
- 📧 البريد: amelpop1122@gmail.com
- 🐛 الإبلاغ عن أخطاء: GitHub Issues

### الأسئلة الشائعة:
- **S: كم وقت البناء؟**
  - ج: 3-5 دقائق أول مرة، 1-2 دقيقة لاحقاً

- **S: هل أحتاج هاتف حقيقي؟**
  - ج: لا، يمكنك استخدام محاكي Android

- **S: ما الفرق بين Debug و Release؟**
  - ج: Release أصغر وأسرع، لكن Debug يسهل التصحيح

---

## ✨ نصائح وحيل

### لتسريع البناء:
```bash
# بناء متوازي
./gradlew assembleDebug --parallel

# تخطي الاختبارات
./gradlew assembleDebug -x test
```

### لتحسين الأداء:
```bash
# استخدام Daemon (عملية خلفية)
./gradlew assembleDebug --daemon
```

### لحذف الملفات القديمة:
```bash
# تنظيف شامل
./gradlew clean
```

---

## 🎁 ملف إعدادات gradle.properties

```properties
# تحسين الأداء
org.gradle.jvmargs=-Xmx2048m -Dfile.encoding=UTF-8
org.gradle.parallel=true
org.gradle.caching=true

# Kotlin
kotlin.code.style=official

# Android
android.nonTransitiveRClass=true
```

---

## 📝 الخطوات النهائية

بعد الحصول على APK:

1. ✅ تأكد من تثبيت التطبيق بنجاح
2. ✅ افتح التطبيق
3. ✅ جرّب تسجيل الدخول (أي بيانات تعمل)
4. ✅ تحقق من جميع الشاشات

---

## 🎉 تم!

لقد أنشأت نسخة كاملة من تطبيق EL.POP جاهزة للاستخدام!

**استمتع بالتطبيق! 🚀**

---

<div align=\"center\">
  <strong>تم إنشاء هذا الدليل بواسطة فريق EL.POP</strong>
  <br>
  <p>جميع الحقوق محفوظة © 2026</p>
</div>
