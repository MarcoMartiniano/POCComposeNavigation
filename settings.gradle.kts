pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "POCComposeNavigation"
include(":app")
include(":core")
include(":core:di")
include(":core:navigation")
include(":core:uikit")
include(":data")
include(":domain")
include(":features")
include(":features:main")
include(":features:home")
include(":features:encyclopedia")
include(":features:favorites")
include(":features:quiz")
