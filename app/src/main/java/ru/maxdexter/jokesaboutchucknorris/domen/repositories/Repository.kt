package ru.maxdexter.jokesaboutchucknorris.domen.repositories

import kotlinx.coroutines.flow.Flow
import ru.maxdexter.jokesaboutchucknorris.domen.entity.Joke

interface Repository {
    fun getJokes(count: Int): Flow<List<Joke>>
}