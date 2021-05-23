package ru.maxdexter.jokesaboutchucknorris.di.module.view_model

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import ru.maxdexter.jokesaboutchucknorris.ui.fragments.jokes.JokesViewModel

@Module
abstract class JokesModule {

    @Binds
    @IntoMap
    @ViewModelKey(JokesViewModel::class)
    abstract fun bindsJokesViewModel(viewModel: JokesViewModel): ViewModel
}