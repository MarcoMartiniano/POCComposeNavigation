plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    id("kotlin-parcelize")
}

apply("${rootProject.projectDir}/android-common.gradle")

//android {
//    namespace = ("com.example.poccomposenavigation.quiz")
//}

dependencies {
    implementation(Compose.composeMaterial)
    implementation(Compose.composeNavigation)

    implementation(Koin.koinCompose)

}