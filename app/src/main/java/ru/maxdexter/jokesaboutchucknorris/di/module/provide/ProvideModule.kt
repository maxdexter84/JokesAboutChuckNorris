package ru.maxdexter.jokesaboutchucknorris.di.module.provide

import dagger.Module
import dagger.Provides
import ru.maxdexter.jokesaboutchucknorris.data.remote_source.network.JokeApi
import ru.maxdexter.jokesaboutchucknorris.data.remote_source.network.JokesService
import ru.maxdexter.jokesaboutchucknorris.domen.common.MapData
import ru.maxdexter.jokesaboutchucknorris.domen.common.MapDataImpl
import javax.inject.Singleton

@Module
class ProvideModule {

    @Singleton
    @Provides
    fun provideJokesServiceApi(): JokesService {
        return JokeApi.jokeService
    }

    @Provides
    fun provideMapData(): MapData {
        return MapDataImpl()
    }


}