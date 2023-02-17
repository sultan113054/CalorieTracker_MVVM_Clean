plugins {
    id("com.android.library")
    id("kotlin-android")
}
apply {
    from("$rootDir/compose-module.gradle")
}


android {
    namespace = "com.application.tracker.tracker_presentation"
}
dependencies {
    "implementation"(project(Modules.core))
    "implementation"(project(Modules.trackerDomain))

    "implementation"(Coil.coilCompose)
}