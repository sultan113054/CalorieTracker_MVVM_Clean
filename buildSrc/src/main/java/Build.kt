object Build {
    private const val androidGradlePluginVersion = "7.3.1"
    const val androidGradlePlugin = "com.android.application:$androidGradlePluginVersion"
    const val libraryGradlePlugin = "com.android.library:${androidGradlePluginVersion}"

    const val kotlinGradlePlugin = "org.jetbrains.kotlin.android:${Kotlin.version}"

    const val jvmGradlePluginVersion = "1.7.20"
    const val jvmGradlePlugin = "org.jetbrains.kotlin.jvm:${Kotlin.version}"

    private const val hiltAndroidGradlePluginVersion = "2.44"
    const val hiltAndroidGradlePlugin = "com.google.dagger.hilt.android:$hiltAndroidGradlePluginVersion"
}