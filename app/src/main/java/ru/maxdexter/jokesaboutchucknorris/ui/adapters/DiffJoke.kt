package ru.maxdexter.jokesaboutchucknorris.ui.adapters

import androidx.recyclerview.widget.DiffUtil
import ru.maxdexter.jokesaboutchucknorris.domen.entity.Joke

class DiffJoke : DiffUtil.ItemCallback<Joke>() {
    override fun areItemsTheSame(oldItem: Joke, newItem: Joke): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Joke, newItem: Joke): Boolean {
        return oldItem.joke == newItem.joke
    }
}