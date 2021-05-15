package ru.maxdexter.jokesaboutchucknorris.domen.usecase

import kotlinx.coroutines.flow.Flow


interface UseCase<out T> {
     fun get(count: Int): Flow<T>
}