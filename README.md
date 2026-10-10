# EL.POP - Android Application

<div align="center">
  <img src="https://img.shields.io/badge/Android-14+-3DDC84?style=for-the-badge&logo=android" />
  <img src="https://img.shields.io/badge/Kotlin-1.9-7F52FF?style=for-the-badge&logo=kotlin" />
  <img src="https://img.shields.io/badge/License-MIT-blue?style=for-the-badge" />
</div>

---

## 📱 عن التطبيق

**EL.POP** هو تطبيق Android حديث وفعال مع واجهة رسومية جميلة وتجربة مستخدم سلسة.

### ✨ الميزات الرئيسية:

- 🔐 **شاشة تسجيل دخول متقدمة** مع التحقق من الصحة
- 📝 **شاشة إنشاء حساب جديد** مع تأكيد كلمة المرور
- 🎨 **تصميم Material 3** مع ألوان EL.POP المميزة
- 🌈 **ألوان درجات وتدرجات احترافية**
- 📱 **متجاوب مع جميع الأجهزة** (minSdk 23)
- ⚡ **أداء عالي وتحميل سريع**
- 🌍 **دعم الكتابة من اليمين لليسار (RTL)**

---

## 🛠️ المتطلبات

- **Android Studio** آخر إصدار
- **Android SDK 34+**
- **Gradle 8.0+**
- **Kotlin 1.9+**
- **Java 17+**

---

## 📥 الخطوات للتشغيل والبناء

### 1️⃣ استنساخ المستودع
```bash
git clone https://github.com/amelpop1122-web/EL-POP-Android-App.git
cd EL-POP-Android-App
```

### 2️⃣ فتح المشروع
1. افتح **Android Studio**
2. اختر **File → Open**
3. اختر مجلد المشروع
4. انتظر حتى تنتهي عملية المزامنة

### 3️⃣ تشغيل على محاكي أو جهاز
```bash
# تشغيل على محاكي
./gradlew installDebug

# أو من Android Studio
Run → Run 'app'
```

### 4️⃣ بناء ملف APK

#### للـ Debug:
```bash
./gradlew assembleDebug
```
سيكون الملف في: `app/build/outputs/apk/debug/app-debug.apk`

#### للـ Release (مُحسّن):
```bash
./gradlew assembleRelease
```
سيكون الملف في: `app/build/outputs/apk/release/app-release.apk`

---

## 📦 هيكل المشروع

```
EL-POP-Android-App/
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/com/elpop/studio/
│   │       │   └── ui/
│   │       │       ├── LoginActivity.kt
│   │       │       ├── RegisterActivity.kt
│   │       │       └── MainActivity.kt
│   │       └── res/
│   │           ├── layout/
│   │           │   ├── activity_login.xml
│   │           │   ├── activity_register.xml
│   │           │   └── activity_main.xml
│   │           ├── values/
│   │           │   ├── colors.xml
│   │           │   ├── strings.xml
│   │           │   └── themes.xml
│   │           └── drawable/
│   │               ├── gradient_background.xml
│   │               ├── ic_email.xml
│   │               ├── ic_password.xml
│   │               └── ic_back.xml
│   ├── build.gradle.kts
│   └── AndroidManifest.xml
├── build.gradle.kts
├── settings.gradle.kts
└── gradle.properties
```

---

## 🎨 نظام الألوان

| اللون | الكود | الاستخدام |
|-------|------|----------|
| الأساسي | `#FF6B35` | الأزرار والرؤوس |
| الثانوي | `#004E89` | العناصر الإضافية |
| الأبيض | `#FFFFFF` | الخلفية |
| النص الأساسي | `#1F2937` | النصوص الرئيسية |
| النص الثانوي | `#6B7280` | النصوص الفرعية |

---

## 📸 لقطات الشاشة

### شاشة تسجيل الدخول
- عنوان "EL.POP" مع شعار الماركة
- حقول إدخال البريد الإلكتروني وكلمة المرور
- زر تسجيل دخول مميز
- رابط لإنشاء حساب جديد

### شاشة إنشاء الحساب
- حقول إدخال: الاسم، البريد، كلمة المرور، التأكيد
- تحقق من صحة البيانات
- رسائل خطأ واضحة

### الشاشة الرئيسية
- ترحيب بالمستخدم
- زر تسجيل الخروج

---

## 🔧 المكتبات المستخدمة

```gradle
// AndroidX
androidx.core:core-ktx:1.12.0
androidx.appcompat:appcompat:1.7.0
androidx.constraintlayout:constraintlayout:2.1.4
androidx.activity:activity-ktx:1.8.2

// Material Design 3
com.google.android.material:material:1.12.0

// Testing
junit:junit:4.13.2
androidx.test.ext:junit:1.1.5
androidx.test.espresso:espresso-core:3.5.1
```

---

## 🚀 كيفية نشر على Google Play Store

1. **إنشاء وقعة رقمية:**
   ```bash
   ./gradlew signingReport
   ```

2. **بناء Release APK:**
   ```bash
   ./gradlew bundleRelease
   ```

3. **رفع إلى Google Play Console**

---

## 🐛 حل المشاكل الشائعة

### المشكلة: "Build Failed"
**الحل:**
```bash
./gradlew clean build
```

### المشكلة: "Gradle sync failed"
**الحل:**
1. أزل مجلد `.gradle` و `build`
2. أعد فتح المشروع
3. اختر **File → Sync Now**

### المشكلة: "No connected devices"
**الحل:**
1. فعّل Developer Options على الهاتف
2. فعّل USB Debugging
3. وصّل الهاتف عبر USB

---

## 📝 الترخيص

هذا المشروع مرخص تحت رخصة **MIT** - اطلع على ملف [LICENSE](LICENSE) للتفاصيل.

---

## 👨‍💻 المساهمة

المساهمات مرحب بها! يرجى:

1. عمل Fork للمشروع
2. إنشاء فرع للميزة (`git checkout -b feature/AmazingFeature`)
3. Commit التغييرات (`git commit -m 'Add AmazingFeature'`)
4. Push للفرع (`git push origin feature/AmazingFeature`)
5. فتح Pull Request

---

## 📞 التواصل

- **البريد الإلكتروني:** amelpop1122@gmail.com
- **GitHub:** [@amelpop1122-web](https://github.com/amelpop1122-web)
- **Twitter:** [@elpop_studio](https://twitter.com/elpop_studio)

---

## 🙏 شكر وتقدير

شكراً لاستخدامك تطبيق EL.POP! لا تنسَ إعطاؤنا ⭐ إذا أعجبك المشروع.

---

<div align="center">
  <strong>صُنع بـ ❤️ من قبل فريق EL.POP</strong>
</div>
