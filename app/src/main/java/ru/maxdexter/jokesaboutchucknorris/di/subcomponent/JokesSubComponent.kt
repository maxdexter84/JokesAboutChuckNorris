package ru.maxdexter.jokesaboutchucknorris.di.subcomponent

import dagger.Subcomponent
import ru.maxdexter.jokesaboutchucknorris.di.module.view_model.JokesModule
import ru.maxdexter.jokesaboutchucknorris.ui.fragments.jokes.JokesFragment

@Subcomponent(modules = [JokesModule::class])
interface JokesSubComponent {

    @Subcomponent.Factory
    interface Factory{
        fun create(): JokesSubComponent
    }

    fun inject(fragment: JokesFragment)
}