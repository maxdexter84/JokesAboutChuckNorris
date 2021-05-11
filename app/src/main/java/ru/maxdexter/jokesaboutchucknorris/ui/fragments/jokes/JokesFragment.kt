package ru.maxdexter.jokesaboutchucknorris.ui.fragments.jokes

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.maxdexter.jokesaboutchucknorris.R

class JokesFragment : Fragment() {



    private val viewModel: JokesViewModel by lazy {
        ViewModelProvider(this).get(JokesViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.jokes_fragment, container, false)
    }



}