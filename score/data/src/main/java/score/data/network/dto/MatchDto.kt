package score.data.network.dto

import com.google.gson.annotations.SerializedName
import com.mathieu.score.domain.model.Match

data class MatchDto(
    @SerializedName("tournament_id") val tournamentId: Int,
    @SerializedName("status") val status: String,
    @SerializedName("videogame") val videogame: Videogame,
    @SerializedName("winner_id") val winnerId: Int?,
    @SerializedName("winner") val winner: Winner?,
    @SerializedName("modified_at") val modifiedAt: String,
    @SerializedName("id") val id: Int,
    @SerializedName("serie_id") val serieId: Int,
    @SerializedName("name") val name: String,
    @SerializedName("begin_at") val beginAt: String,
    @SerializedName("opponents") val opponents: List<Opponent>,
    @SerializedName("tournament") val tournament: Tournament,
    @SerializedName("results") val results: List<Result>,
    @SerializedName("league") val league: League,
    @SerializedName("serie") val serie: Serie,
    @SerializedName("end_at") val endAt: String?,
    @SerializedName("videogame_title") val videogameTitle: VideoGameTitle?,
    @SerializedName("match_type") val matchType: String,
    @SerializedName("number_of_games") val numberOfGames: Int,
    @SerializedName("games") val games: List<Game>,
    @SerializedName("forfeit") val forfeit: Boolean,
    @SerializedName("streams_list") val streamsList: List<Stream>,
    @SerializedName("slug") val slug: String,
    @SerializedName("scheduled_at") val scheduledAt: String,
    @SerializedName("league_id") val leagueId: Int,
    @SerializedName("rescheduled") val rescheduled: Boolean,
    @SerializedName("draw") val draw: Boolean,
    @SerializedName("videogame_version") val videogameVersion: String?,
    @SerializedName("original_scheduled_at") val originalScheduledAt: String,
    @SerializedName("detailed_stats") val detailedStats: Boolean,
    @SerializedName("game_advantage") val gameAdvantage: String?,
    @SerializedName("live") val live: Live,
    @SerializedName("winner_type") val winnerType: String
) {
    fun toMatch() = Match(
        id = id,
        name = name,
        numberOfGames = numberOfGames,
        originalScheduledAt = originalScheduledAt,
        serieId = serieId,
        slug = slug,
        status = status,
    )
}

data class Videogame(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("slug") val slug: String
)

data class Winner(
    @SerializedName("id") val id: Int?,
    @SerializedName("type") val type: String
)

data class Opponent(
    @SerializedName("opponent") val opponent: OpponentDetails,
    @SerializedName("type") val type: String
)

data class OpponentDetails(
    @SerializedName("acronym") val acronym: String?,
    @SerializedName("id") val id: Int,
    @SerializedName("image_url") val imageUrl: String?,
    @SerializedName("location") val location: String,
    @SerializedName("modified_at") val modifiedAt: String,
    @SerializedName("name") val name: String,
    @SerializedName("slug") val slug: String
)

data class Tournament(
    @SerializedName("begin_at") val beginAt: String,
    @SerializedName("detailed_stats") val detailedStats: Boolean,
    @SerializedName("end_at") val endAt: String?,
    @SerializedName("has_bracket") val hasBracket: Boolean,
    @SerializedName("id") val id: Int,
    @SerializedName("league_id") val leagueId: Int,
    @SerializedName("live_supported") val liveSupported: Boolean,
    @SerializedName("modified_at") val modifiedAt: String,
    @SerializedName("name") val name: String,
    @SerializedName("prizepool") val prizepool: String?,
    @SerializedName("serie_id") val serieId: Int,
    @SerializedName("slug") val slug: String,
    @SerializedName("tier") val tier: String,
    @SerializedName("winner_id") val winnerId: Int?,
    @SerializedName("winner_type") val winnerType: String
)

data class Result(
    @SerializedName("score") val score: Int,
    @SerializedName("team_id") val teamId: Int
)

data class League(
    @SerializedName("id") val id: Int,
    @SerializedName("image_url") val imageUrl: String,
    @SerializedName("modified_at") val modifiedAt: String,
    @SerializedName("name") val name: String,
    @SerializedName("slug") val slug: String,
    @SerializedName("url") val url: String?
)

data class Serie(
    @SerializedName("begin_at") val beginAt: String,
    @SerializedName("end_at") val endAt: String?,
    @SerializedName("full_name") val fullName: String,
    @SerializedName("id") val id: Int,
    @SerializedName("league_id") val leagueId: Int,
    @SerializedName("modified_at") val modifiedAt: String,
    @SerializedName("name") val name: String,
    @SerializedName("season") val season: String?,
    @SerializedName("slug") val slug: String,
    @SerializedName("winner_id") val winnerId: Int?,
    @SerializedName("winner_type") val winnerType: String,
    @SerializedName("year") val year: Int
)

data class Game(
    @SerializedName("begin_at") val beginAt: String?,
    @SerializedName("complete") val complete: Boolean,
    @SerializedName("detailed_stats") val detailedStats: Boolean,
    @SerializedName("end_at") val endAt: String?,
    @SerializedName("finished") val finished: Boolean,
    @SerializedName("forfeit") val forfeit: Boolean,
    @SerializedName("id") val id: Int,
    @SerializedName("length") val length: Int?,
    @SerializedName("match_id") val matchId: Int,
    @SerializedName("position") val position: Int,
    @SerializedName("status") val status: String,
    @SerializedName("winner") val winner: Winner?,
    @SerializedName("winner_type") val winnerType: String
)

data class Stream(
    @SerializedName("embed_url") val embedUrl: String,
    @SerializedName("language") val language: String,
    @SerializedName("main") val main: Boolean,
    @SerializedName("official") val official: Boolean,
    @SerializedName("raw_url") val rawUrl: String
)

data class Live(
    @SerializedName("opens_at") val opensAt: String?,
    @SerializedName("supported") val supported: Boolean,
    @SerializedName("url") val url: String?
)

data class VideoGameTitle(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("slug") val slug: String,
    @SerializedName("videogame_id") val videogameId: Int
)