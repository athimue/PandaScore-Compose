package com.mathieu.score.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel


@Composable
fun HomeScreen(viewModel: HomeViewModel = hiltViewModel()) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Scores"
        )
        Spacer(modifier = Modifier.height(8.dp))
        viewModel.runningMatches?.let {
            LazyColumn(
                modifier = Modifier.fillMaxWidth()
            ) {
                items(it.count()) { pet ->
                    Row {
                        Text(text = it[pet].name)
                    }
                }
            }
        }
    }
}