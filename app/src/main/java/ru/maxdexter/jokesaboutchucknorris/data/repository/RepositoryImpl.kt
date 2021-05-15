package ru.maxdexter.jokesaboutchucknorris.data.repository

import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import ru.maxdexter.jokesaboutchucknorris.data.remote_source.entiry.JokeRemote
import ru.maxdexter.jokesaboutchucknorris.domen.common.MapData
import ru.maxdexter.jokesaboutchucknorris.domen.common.Result
import ru.maxdexter.jokesaboutchucknorris.domen.repositories.Repository
import ru.maxdexter.jokesaboutchucknorris.domen.source.RemoteSource

const val TAG = "NETWORK_ERROR"

@Suppress("UNCHECKED_CAST")
class RepositoryImpl(private val source: RemoteSource, private val map: MapData) : Repository {

    override fun getJokes(count: Int) = flow {
        source.runCatching {
            when (val res = loadJokes(count)) {
                is Result.Success -> {
                    val data = (res.data as JokeRemote).value.map { map.valueToJoke(it) }
                    emit(data)
                }
                is Result.Error -> Log.e(TAG, res.exception.message.toString())
                else -> throw Exception("Unknown exception")
            }
        }
    }.flowOn(Dispatchers.IO)
}