package ru.maxdexter.jokesaboutchucknorris.ui.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import ru.maxdexter.jokesaboutchucknorris.ui.entity.Joke

class JokeAdapter : ListAdapter<Joke, JokeViewHolder>(DiffJoke()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JokeViewHolder {
        return JokeViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: JokeViewHolder, position: Int) {
       holder.bind(getItem(position))
    }
}