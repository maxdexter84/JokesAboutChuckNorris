package ru.maxdexter.jokesaboutchucknorris.ui.fragments.jokes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ru.maxdexter.jokesaboutchucknorris.domen.entity.Joke
import ru.maxdexter.jokesaboutchucknorris.domen.usecase.UseCase

@Suppress("UNCHECKED_CAST")
class JokesViewModelFactory(private val useCase: UseCase) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return JokesViewModel(useCase) as T
    }
}