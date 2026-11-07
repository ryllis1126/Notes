plugins {
    id("com.android.application")
}

android {
    namespace = "net.micode.notes"
    compileSdk = 33
    useLibrary("org.apache.http.legacy")

    defaultConfig {
        applicationId = "net.micode.notes"
        minSdk = 14
        targetSdk = 28
        versionCode = 1
        versionName = "0.1"
    }

    sourceSets {
        getByName("main") {
            manifest.srcFile("../../AndroidManifest.xml")
            java.setSrcDirs(listOf("../../src"))
            res.setSrcDirs(listOf("../../res"))
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}