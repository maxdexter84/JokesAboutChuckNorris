package ru.maxdexter.jokesaboutchucknorris.data.repository

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import ru.maxdexter.jokesaboutchucknorris.data.remote_source.entiry.JokeRemote
import ru.maxdexter.jokesaboutchucknorris.domen.common.MapData
import ru.maxdexter.jokesaboutchucknorris.domen.common.Result
import ru.maxdexter.jokesaboutchucknorris.domen.repositories.Repository
import ru.maxdexter.jokesaboutchucknorris.domen.source.RemoteSource

class RepositoryImpl(private val source: RemoteSource, private val map: MapData) : Repository {

    override fun getJokes() = flow {
        source.runCatching {
            when (val res = loadJokes()) {
                is Result.Success -> emit((res.data as List<JokeRemote>).map { map.valueToJoke(it.value) })
            }
        }
    }.flowOn(Dispatchers.IO)
}