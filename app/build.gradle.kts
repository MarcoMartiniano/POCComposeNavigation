plugins {
    id ("com.android.application")
    id ("org.jetbrains.kotlin.android")
}


apply("${rootProject.projectDir}/android-common.gradle")

android {
    defaultConfig.applicationId = "com.example.poccomposenavigation"
}

dependencies {

    implementation(AndroidCore.androidCore)
    implementation (Koin.koinCompose)
    implementation(Compose.composeNavigation)

    implementation(project(Modules.navigationModule))
    implementation(project(Modules.diModule))

    implementation(platform("androidx.compose:compose-bom:2023.08.00"))
    implementation("androidx.compose.material3:material3")

}