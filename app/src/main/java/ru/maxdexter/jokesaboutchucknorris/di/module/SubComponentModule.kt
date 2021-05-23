package ru.maxdexter.jokesaboutchucknorris.di.module

import dagger.Module
import ru.maxdexter.jokesaboutchucknorris.di.subcomponent.JokesSubComponent

@Module(subcomponents = [JokesSubComponent::class])
object SubComponentModule {
}