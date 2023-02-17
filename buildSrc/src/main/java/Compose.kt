object Compose {
    const val composeVersion = "1.3.3"
    const val materialVersion = "1.3.1"
    const val composeCompilerVersion = "1.4.2"
    const val material = "androidx.compose.material:material:${materialVersion}"
    const val ui = "androidx.compose.ui:ui:$composeVersion"
    const val uiTool = "androidx.compose.ui:ui-tooling:1.3.2"
    const val uiToolingPreview = "androidx.compose.ui:ui-tooling-preview:1.3.2"
    const val runtime = "androidx.compose.runtime:runtime:$composeVersion"
    const val compiler = "androidx.compose.compiler:compiler:$composeCompilerVersion"

    private const val navigationVersion = "2.5.3"
    const val navigation = "androidx.navigation:navigation-compose:$navigationVersion"

    private const val hiltNavigationComposeVersion = "1.0.0"
    const val hiltNavigationCompose = "androidx.hilt:hilt-navigation-compose:$hiltNavigationComposeVersion"

    private const val activityComposeVersion = "1.6.1"
    const val activityCompose = "androidx.activity:activity-compose:$activityComposeVersion"

    private const val lifecycleVersion = "2.5.1"
    const val viewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:$lifecycleVersion"
}
