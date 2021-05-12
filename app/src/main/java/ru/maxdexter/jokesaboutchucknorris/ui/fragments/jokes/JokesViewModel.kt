package ru.maxdexter.jokesaboutchucknorris.ui.fragments.jokes

import androidx.lifecycle.ViewModel
import ru.maxdexter.jokesaboutchucknorris.domen.entity.Joke
import ru.maxdexter.jokesaboutchucknorris.domen.usecase.UseCase

class JokesViewModel (private val useCase: UseCase<List<Joke>>) : ViewModel() {
    // TODO: Implement the ViewModel
}