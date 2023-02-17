
plugins {
    id (Build.androidGradlePlugin) version Build.androidGradlePluginVersion apply false
    id (Build.libraryGradlePlugin) version Build.androidGradlePluginVersion apply false
    id (Build.kotlinGradlePlugin) version Kotlin.version apply false
    id (Hilt.hiltAndroid) version Hilt.version apply false
}