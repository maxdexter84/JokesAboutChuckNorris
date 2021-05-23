package ru.maxdexter.jokesaboutchucknorris

import android.app.Application
import ru.maxdexter.jokesaboutchucknorris.di.component.AppComponent
import ru.maxdexter.jokesaboutchucknorris.di.component.DaggerAppComponent

class App : Application() {

    override fun onCreate() {
        super.onCreate()
    }

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder().build()
    }
}