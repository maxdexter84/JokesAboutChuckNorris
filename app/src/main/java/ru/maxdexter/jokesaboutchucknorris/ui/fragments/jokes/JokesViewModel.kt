package ru.maxdexter.jokesaboutchucknorris.ui.fragments.jokes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import ru.maxdexter.jokesaboutchucknorris.domen.entity.Joke
import ru.maxdexter.jokesaboutchucknorris.domen.usecase.UseCase
import javax.inject.Inject

class JokesViewModel @Inject constructor(private val useCase: UseCase<List<Joke>>) : ViewModel() {

    private val _currentJokes = MutableStateFlow<List<Joke>>(emptyList())
    val currentJokes = _currentJokes.asStateFlow()

    fun loadJokes(count: String) {
        if (count.isNotBlank()) {
            viewModelScope.launch {
                useCase.get(count.toIntOrNull() ?: 0).collect {
                    _currentJokes.value = it
                }
            }
        }
    }
}