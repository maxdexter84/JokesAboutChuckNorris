package ru.maxdexter.jokesaboutchucknorris.ui.fragments.web

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class WebViewModel : ViewModel() {

    private val _currentUrl = MutableStateFlow("https://www.icndb.com/api")
    val currentUrl = _currentUrl.asStateFlow()

    fun setCurrentUrl(url: String) {
        _currentUrl.value = url
    }
}