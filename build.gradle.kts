plugins {
    base
}

allprojects {
    group = "com.ynap.iosandnative"
    version = "0.1.0"

    buildscript {
        repositories {
            jcenter()
            maven("https://dl.bintray.com/kotlin/kotlin-dev/")
        }
    }

    repositories {
        jcenter()
        maven("https://dl.bintray.com/kotlin/kotlin-dev/")
    }
}
