package ru.maxdexter.jokesaboutchucknorris.domen.usecase

import kotlinx.coroutines.flow.Flow
import ru.maxdexter.jokesaboutchucknorris.domen.entity.Joke
import ru.maxdexter.jokesaboutchucknorris.domen.repositories.Repository
import javax.inject.Inject

class GetJokeUseCase @Inject constructor(private val repository: Repository) : UseCase {
    override fun get(count: Int): Flow<List<Joke>> {
        return repository.getJokes(count)
    }
}