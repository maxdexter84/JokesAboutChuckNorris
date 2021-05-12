package ru.maxdexter.jokesaboutchucknorris.domen.usecase

import kotlinx.coroutines.flow.Flow


interface UseCase<out T> {
    operator fun invoke(): Flow<T>
}