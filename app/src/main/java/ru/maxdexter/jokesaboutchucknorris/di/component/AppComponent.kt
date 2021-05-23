package ru.maxdexter.jokesaboutchucknorris.di.component

import dagger.Component
import ru.maxdexter.jokesaboutchucknorris.di.module.SubComponentModule
import ru.maxdexter.jokesaboutchucknorris.di.module.binds.BindsModule
import ru.maxdexter.jokesaboutchucknorris.di.module.provide.ProvideModule
import ru.maxdexter.jokesaboutchucknorris.di.module.view_model.ViewModelBuilderModule
import ru.maxdexter.jokesaboutchucknorris.di.subcomponent.JokesSubComponent
import javax.inject.Singleton

@Singleton
@Component(modules = [
    BindsModule::class,
    ProvideModule::class,
    ViewModelBuilderModule::class,
    SubComponentModule::class
])
interface AppComponent {
    fun jokesFragment(): JokesSubComponent.Factory

}