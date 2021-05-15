package ru.maxdexter.jokesaboutchucknorris.data.remote_source.network

import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Path
import ru.maxdexter.jokesaboutchucknorris.data.remote_source.entiry.JokeRemote

interface JokesService {
    //http://api.icndb.com/jokes/random/3
    @GET("jokes/random/{count}")
    suspend fun getAllJokes(@Path("count") count: Int): JokeRemote

}