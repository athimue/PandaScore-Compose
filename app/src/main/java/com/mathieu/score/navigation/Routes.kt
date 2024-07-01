package com.mathieu.score.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class Routes {

  @Serializable
  object Home
}