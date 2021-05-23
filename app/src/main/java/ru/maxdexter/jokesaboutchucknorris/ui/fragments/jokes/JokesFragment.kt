package ru.maxdexter.jokesaboutchucknorris.ui.fragments.jokes

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import ru.maxdexter.jokesaboutchucknorris.App
import ru.maxdexter.jokesaboutchucknorris.data.remote_source.RemoteSourceImpl
import ru.maxdexter.jokesaboutchucknorris.data.remote_source.network.JokeApi
import ru.maxdexter.jokesaboutchucknorris.data.repository.RepositoryImpl
import ru.maxdexter.jokesaboutchucknorris.databinding.JokesFragmentBinding
import ru.maxdexter.jokesaboutchucknorris.domen.common.MapDataImpl
import ru.maxdexter.jokesaboutchucknorris.domen.usecase.GetJokeUseCase
import ru.maxdexter.jokesaboutchucknorris.ui.adapters.JokeAdapter
import javax.inject.Inject

class JokesFragment : Fragment() {


//    private val viewModel: JokesViewModel by lazy {
//        val apiService = JokeApi.jokeService
//        val remoteSource = RemoteSourceImpl(apiService)
//        val repository = RepositoryImpl(remoteSource, MapDataImpl())
//        val useCase = GetJokeUseCase(repository)
//        ViewModelProvider(this, JokesViewModelFactory(useCase)).get(JokesViewModel::class.java)
//    }

    private lateinit var binding: JokesFragmentBinding

    private val jokeAdapter: JokeAdapter by lazy {
        JokeAdapter()
    }

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel by viewModels<JokesViewModel> { viewModelFactory }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        (requireActivity().application as App).appComponent.jokesFragment()
            .create().inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = JokesFragmentBinding.inflate(layoutInflater, container, false)

        initBtn()

        dataObserver()


        return binding.root
    }

    private fun initBtn() {
        binding.btnReloadJoke.setOnClickListener {
            val count = binding.etJokeQuantity.text.toString()
            viewModel.loadJokes(count)
        }
    }

    private fun dataObserver() {
        viewModel.currentJokes.onEach {
            jokeAdapter.submitList(it)
            initRecycler(jokeAdapter)
        }.launchIn(lifecycleScope)
    }

    private fun initRecycler(jokeAdapter: JokeAdapter) {
        binding.jokesRecycler.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = jokeAdapter
        }
    }


}