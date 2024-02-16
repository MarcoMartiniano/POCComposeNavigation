plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    id("kotlin-parcelize")
}

apply("${rootProject.projectDir}/android-common.gradle")


dependencies {
    implementation(Koin.koinCompose)
    implementation(project(Modules.feature_home))
    implementation(project(Modules.navigationModule))
}