package com.mathieu.score.domain.repository

import com.mathieu.score.domain.model.Match

interface MatchRepository {
  suspend fun getRunningMatches(): List<Match>
}