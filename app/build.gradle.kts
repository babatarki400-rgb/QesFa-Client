plugins {
    id("com.android.application")
}

android {
    namespace = "com.qesfa.client"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.qesfa.client"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
}
