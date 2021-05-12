package ru.maxdexter.jokesaboutchucknorris.domen.source

import ru.maxdexter.jokesaboutchucknorris.data.remote_source.entiry.JokeRemote
import ru.maxdexter.jokesaboutchucknorris.domen.common.Result

interface RemoteSource {
    suspend fun loadJokes(): Result<*>
}