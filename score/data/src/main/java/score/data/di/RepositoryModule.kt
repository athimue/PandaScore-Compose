package score.data.di

import com.mathieu.score.domain.repository.MatchRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import score.data.repository.MatchRepositoryImpl

@InstallIn(ViewModelComponent::class)
@Module
abstract class RepositoryModule {

    @Binds
    @ViewModelScoped
    abstract fun provideMatchRepository(matchRepositoryImpl: MatchRepositoryImpl): MatchRepository

}
