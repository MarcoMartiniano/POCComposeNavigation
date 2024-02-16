plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    id("kotlin-parcelize")
}

apply("${rootProject.projectDir}/android-common.gradle")

dependencies {

    implementation(Compose.composeNavigation)
    implementation(Compose.composeMaterial)

    implementation(project(Modules.feature_quiz))
    implementation(project(Modules.feature_encyclopedia))
    implementation(project(Modules.feature_home))
    implementation(project(Modules.feature_favorites))
    implementation(project(Modules.uiKit))
}