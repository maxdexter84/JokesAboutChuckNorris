package ru.maxdexter.jokesaboutchucknorris.domen.source

import ru.maxdexter.jokesaboutchucknorris.domen.common.Result

interface RemoteSource {
    suspend fun loadJokes(count: Int): Result<*>
}