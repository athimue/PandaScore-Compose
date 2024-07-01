package score.data.network.api

import retrofit2.Response
import retrofit2.http.GET
import score.data.network.dto.MatchDto

interface PandaScoreApi {
  @GET("/matches/running")
  suspend fun getRunningMatches(): Response<List<MatchDto>>

  companion object {
    const val PANDASCORE_API = "https://api.pandascore.co"
  }
}
