object AndroidCore {
    private const val androidCoreVersion = "1.12.0"
    private const val appCompatVersion = "1.6.1"

    //    private const val constraintLayoutVersion = "2.0.4"
//    private const val legacySupportVersion = "1.0.0"
    const val androidCore = "androidx.core:core-ktx:$androidCoreVersion"
    const val appCompat = "androidx.appcompat:appcompat:$appCompatVersion"
//    const val legacy = "androidx.legacy:legacy-support-v4:$legacySupportVersion"
//    const val constraintLayout =
//        "androidx.constraintlayout:constraintlayout:$constraintLayoutVersion"
}

object Compose {
    private const val composeUiVersion = "1.6.1"
    private const val composeMaterialVersion = "1.6.1"
    private const val composeActivityVersion = "1.8.2"
    private const val composeNavigationVersion = "2.7.7"
    private const val composeRuntimeVersion = "1.6.1"
    const val composeUi = "androidx.compose.ui:ui:$composeUiVersion"
    const val composeMaterial = "androidx.compose.material:material:$composeMaterialVersion"
    const val composeActivity = "androidx.activity:activity-compose:$composeActivityVersion"
    const val composeNavigation = "androidx.navigation:navigation-compose:$composeNavigationVersion"
    const val composeRuntime = "androidx.compose.runtime:runtime:$composeRuntimeVersion"
}

object Koin {
    private const val koinVersion = "3.5.3"
    const val koinInsert = "io.insert-koin:koin-core:$koinVersion"

    //    const val koinAndroid = "io.insert-koin:koin-android:$koinVersion"
    const val koinCompose = "io.insert-koin:koin-androidx-compose:$koinVersion"
}


object Modules {
    const val diModule = ":core:di"
    const val uiKit = ":core:uikit"
    const val navigationModule = ":core:navigation"
    const val domainModule = ":domain"
    const val dataModule = ":data"
    const val commons = ":core:commons"
    const val feature_encyclopedia = ":features:encyclopedia"
    const val feature_favorites = ":features:favorites"
    const val feature_main = ":features:main"
    const val feature_quiz = ":features:quiz"
    const val feature_home = ":features:home"

}

//
//object Coroutines {
//    private const val coroutinesVersion = "1.7.3"
//    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion"
//}
//
object Retrofit {
    private const val gsonConvertGoogleVersion = "2.9.0"
    const val gsonConvertGoogle = "com.google.code.gson:gson:$gsonConvertGoogleVersion"
}
//
//object Security {
//    private const val cryptoVersion = "1.1.0-alpha03"
//    const val encryptedSharedPreferences = "androidx.security:security-crypto:$cryptoVersion"
//}