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

    implementation(project(Modules.uiKit))
    implementation(project(Modules.commons))
}