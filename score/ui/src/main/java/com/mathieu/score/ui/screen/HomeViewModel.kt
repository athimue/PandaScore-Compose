package com.mathieu.score.ui.screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mathieu.score.domain.model.Match
import com.mathieu.score.domain.usecase.GetRunningMatchesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel
@Inject
constructor(
    getRunningMatchesUseCase: GetRunningMatchesUseCase,
) : ViewModel() {

    var runningMatches by mutableStateOf<List<Match>?>(null)

    init {
        viewModelScope.launch {
            val result = getRunningMatchesUseCase()
            runningMatches = result
        }
    }
}
