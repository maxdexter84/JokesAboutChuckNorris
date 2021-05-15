package ru.maxdexter.jokesaboutchucknorris.domen.usecase

import kotlinx.coroutines.flow.Flow
import ru.maxdexter.jokesaboutchucknorris.domen.entity.Joke
import ru.maxdexter.jokesaboutchucknorris.domen.repositories.Repository

class GetJokeUseCase(private val repository: Repository) : UseCase<List<Joke>> {
    override fun get(count: Int): Flow<List<Joke>> {
        return repository.getJokes(count)
    }
}