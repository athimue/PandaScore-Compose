package com.mathieu.score

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.mathieu.score.navigation.MainNavigation
import com.mathieu.score.ui.theme.PandaScoreComposeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      PandaScoreComposeTheme {
        MainNavigation()
      }
    }
  }
}