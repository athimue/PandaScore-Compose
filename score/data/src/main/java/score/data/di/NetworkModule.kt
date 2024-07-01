package score.data.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import score.data.network.api.PandaScoreApi
import score.data.network.token.TokenAuthenticator
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideOkHttpClient(): OkHttpClient =
        OkHttpClient
            .Builder()
            .addInterceptor(TokenAuthenticator())
            .build()

    @Singleton
    @Provides
    fun provideRetrofitInstance(client: OkHttpClient): Retrofit =
        Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(PandaScoreApi.PANDASCORE_API)
            .client(client)
            .build()


    @Provides
    @Singleton
    fun provideApi(retrofit: Retrofit): PandaScoreApi =
        retrofit.create(PandaScoreApi::class.java)
}