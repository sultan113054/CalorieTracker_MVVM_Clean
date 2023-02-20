
plugins {
    id("com.android.library")
    id("kotlin-android")
    id("org.jetbrains.kotlin.android")
}
apply {
    from("$rootDir/compose-module.gradle")
}
android {

    namespace = "com.application.core_ui"
}
dependencies {

}