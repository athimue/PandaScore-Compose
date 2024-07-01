package com.mathieu.score.domain.usecase

import com.mathieu.score.domain.repository.MatchRepository
import javax.inject.Inject

class GetRunningMatchesUseCase

    @Inject
    constructor(
        private val matchRepository: MatchRepository,
    ) {
        suspend operator fun invoke() = matchRepository.getRunningMatches()
    }
