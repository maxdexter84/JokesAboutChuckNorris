package ru.maxdexter.jokesaboutchucknorris.domen.common

import ru.maxdexter.jokesaboutchucknorris.data.remote_source.entiry.Value
import ru.maxdexter.jokesaboutchucknorris.domen.entity.Joke

class MapDataImpl : MapData {

    override fun valueToJoke(value: Value): Joke {
        return Joke(value.id, value.joke)
    }
}