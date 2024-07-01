package score.data.network.token

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class TokenAuthenticator : Interceptor   {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        return chain.proceed(newRequestWithAccessToken(Constants.TOKEN, request))
    }

    private fun newRequestWithAccessToken(accessToken: String?, request: Request): Request =
        request.newBuilder()
             .header("Accept", "application/json")
             .header("Authorization", "Bearer $accessToken")
            .build()
}