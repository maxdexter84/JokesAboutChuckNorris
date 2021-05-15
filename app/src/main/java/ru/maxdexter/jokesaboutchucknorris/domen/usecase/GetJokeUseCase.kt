package ru.maxdexter.jokesaboutchucknorris.domen.usecase

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn
import ru.maxdexter.jokesaboutchucknorris.domen.entity.Joke
import ru.maxdexter.jokesaboutchucknorris.domen.repositories.Repository

class GetJokeUseCase(private val repository: Repository) : UseCase<List<Joke>> {
    override fun get(count: Int): Flow<List<Joke>> {
        return repository.getJokes(count)
    }
}