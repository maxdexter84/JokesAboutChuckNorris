package ru.maxdexter.jokesaboutchucknorris.domen.usecase

import kotlinx.coroutines.flow.Flow
import ru.maxdexter.jokesaboutchucknorris.domen.entity.Joke


interface UseCase {
    fun get(count: Int): Flow<List<Joke>>
}