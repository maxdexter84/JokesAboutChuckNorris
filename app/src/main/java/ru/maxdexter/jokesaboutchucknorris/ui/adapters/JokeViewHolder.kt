package ru.maxdexter.jokesaboutchucknorris.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.maxdexter.jokesaboutchucknorris.databinding.ItemJokeBinding
import ru.maxdexter.jokesaboutchucknorris.ui.entity.Joke

class JokeViewHolder(private val binding: ItemJokeBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Joke){
        binding.tvJoke.text = item.joke
    }


    companion object {
        fun create(parent: ViewGroup): JokeViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ItemJokeBinding.inflate(layoutInflater, parent, false)
            return JokeViewHolder(binding)
        }
    }
}