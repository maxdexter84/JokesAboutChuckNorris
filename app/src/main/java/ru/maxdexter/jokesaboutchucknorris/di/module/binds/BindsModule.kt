package ru.maxdexter.jokesaboutchucknorris.di.module.binds

import dagger.Binds
import dagger.Module
import ru.maxdexter.jokesaboutchucknorris.data.remote_source.RemoteSourceImpl
import ru.maxdexter.jokesaboutchucknorris.data.repository.RepositoryImpl
import ru.maxdexter.jokesaboutchucknorris.domen.repositories.Repository
import ru.maxdexter.jokesaboutchucknorris.domen.source.RemoteSource
import ru.maxdexter.jokesaboutchucknorris.domen.usecase.GetJokeUseCase
import ru.maxdexter.jokesaboutchucknorris.domen.usecase.UseCase

@Module
abstract class BindsModule {

    @Binds
    abstract fun bindsRemoteSource(sourceImpl: RemoteSourceImpl): RemoteSource

    @Binds
    abstract fun bindsRepository(repositoryImpl: RepositoryImpl): Repository

    @Binds
    abstract fun bindsUseCases(getJokeUseCase: GetJokeUseCase): UseCase
}