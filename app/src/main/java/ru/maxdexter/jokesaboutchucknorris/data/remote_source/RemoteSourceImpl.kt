package ru.maxdexter.jokesaboutchucknorris.data.remote_source

import okio.IOException
import ru.maxdexter.jokesaboutchucknorris.data.remote_source.network.JokesService
import ru.maxdexter.jokesaboutchucknorris.domen.common.Result
import ru.maxdexter.jokesaboutchucknorris.domen.source.RemoteSource


class RemoteSourceImpl(private val jokes: JokesService) : RemoteSource {

    override suspend fun loadJokes(): Result<*> {
        return try {
            Result.Success(loadJokes())
        } catch (e: IOException) {
            Result.Error(e)
        }
    }

}