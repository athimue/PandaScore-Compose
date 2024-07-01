package score.data.repository

import android.util.Log
import com.mathieu.score.domain.model.Match
import com.mathieu.score.domain.repository.MatchRepository
import score.data.network.api.PandaScoreApi
import javax.inject.Inject

class MatchRepositoryImpl @Inject constructor(
  private val pandaScoreApi: PandaScoreApi
) : MatchRepository {

  override suspend fun getRunningMatches(): List<Match> {
    val response = pandaScoreApi.getRunningMatches()
    Log.d("COUCOU", response.toString())
    return response.takeIf { it.isSuccessful }?.body()?.let {
      it.map { matchDto -> matchDto.toMatch() }
    } ?: listOf()
  }
}