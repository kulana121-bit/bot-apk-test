# bot-apk-test

Android project — Telegram coding agent (@OpenCodenexbot) ke template se
shuru hua. Minimal skeleton: ek plain `MainActivity`, koi AndroidX
dependency nahi.

## APK kaise milega

Har push pe **GitHub Actions** debug APK banata hai
(`.github/workflows/build-apk.yml`):

1. Is repo ka **Actions** tab kholo
2. Sabse upar wali (latest) run pe click karo
3. Neeche **Artifacts** me `app-debug-apk` download karo
4. Phone pe install karo (debug APK hai — "unknown sources" allow
   karna pad sakta hai)

Local build (PC ho to): `./gradlew assembleDebug`
APK yahan banta hai: `app/build/outputs/apk/debug/app-debug.apk`

## Setup

- Gradle 8.9 (wrapper), AGP 8.7.0, JDK 17
- compileSdk 34 · targetSdk 34 · minSdk 24
