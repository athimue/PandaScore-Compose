package com.mathieu.score.domain.model

data class Match(
    val id: Int,
    val name: String,
    val numberOfGames: Int,
    val originalScheduledAt: String,
    val serieId: Int,
    val slug: String,
    val status: String,
)

