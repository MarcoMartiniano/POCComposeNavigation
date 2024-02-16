plugins {
    id ("com.android.application")
    id ("org.jetbrains.kotlin.android")
}


apply("${rootProject.projectDir}/android-common.gradle")

android {
    defaultConfig.applicationId = "com.example.poccomposenavigation"
}

dependencies {

//    implementation(project(Modules.uiKit))
//    implementation(project(Modules.navigationModule))
//    implementation(project(Modules.diModule))
//
//    implementation(AndroidCore.androidCore)
//    implementation(Compose.composeNavigation)
//
//    implementation (Compose.composeActivity)
//    implementation (Compose.composeUi)
//    implementation (Compose.composeMaterial)
//
//    implementation (Koin.koinCompose)


    implementation(AndroidCore.androidCore)


//    implementation("androidx.core:core-ktx:1.10.1")


    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation("androidx.activity:activity-compose:1.7.0")
    implementation(platform("androidx.compose:compose-bom:2023.08.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.08.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")

}