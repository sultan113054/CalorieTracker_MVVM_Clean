package com.application.navigation

import androidx.navigation.NavController
import com.application.core.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate) {
    this.navigate(event.route)
}