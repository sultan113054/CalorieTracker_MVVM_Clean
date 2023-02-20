
plugins {
    id("com.android.library")
    id("kotlin-android")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")

}

apply {
    from("$rootDir/base-module.gradle")
}


android {

    namespace = "com.application.tracker.tracker_data"
}
dependencies {
    implementation(project(Modules.core))
    implementation(project(Modules.trackerDomain))

    implementation(Retrofit.okHttp)
    implementation(Retrofit.retrofit)
    implementation(Retrofit.okHttpLoggingInterceptor)
    implementation(Retrofit.moshiConverter)

    implementation(Room.roomRuntime)
    annotationProcessor(Room.roomCompiler)
    kapt(Room.roomCompiler)

}