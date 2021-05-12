package ru.maxdexter.jokesaboutchucknorris.data.remote_source.network

import retrofit2.http.GET
import ru.maxdexter.jokesaboutchucknorris.data.remote_source.entiry.JokeRemote

interface JokesService {
    //http://api.icndb.com/jokes
    @GET("jokes")
    suspend fun getAllJokes(): JokeRemote
}