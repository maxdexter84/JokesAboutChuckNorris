package ru.maxdexter.jokesaboutchucknorris.domen.common

import ru.maxdexter.jokesaboutchucknorris.data.remote_source.entiry.Value
import ru.maxdexter.jokesaboutchucknorris.ui.entity.Joke

interface MapData {
    fun valueToJoke(value: Value) : Joke
}