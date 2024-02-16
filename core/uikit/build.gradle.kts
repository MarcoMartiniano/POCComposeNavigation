plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    id("kotlin-parcelize")
}

apply("${rootProject.projectDir}/android-common.gradle")

android {
    namespace = ("com.example.poccomposenavigation.uikit")
}

dependencies {

    implementation(Compose.composeMaterial)
    implementation(Compose.composeNavigation)
}