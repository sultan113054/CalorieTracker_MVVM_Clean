plugins {
    id("com.android.library")
    id("kotlin-android")
}
apply {
    from("$rootDir/compose-module.gradle")
}
android {

    namespace = "com.application.onboarding.onboarding_presentation"
}
dependencies {
    "implementation"(project(Modules.core))
    "implementation"(project(Modules.coreUi))
    "implementation"(project(Modules.onboardingDomain))
}