plugins {
    id("com.android.library")
    id("kotlin-android")
}
apply {
    from("$rootDir/base-module.gradle")
}
android {

    namespace = "com.application.onboarding.onboarding_domain"
}
dependencies {
    "implementation"(project(Modules.core))
}