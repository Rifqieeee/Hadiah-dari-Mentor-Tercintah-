package com.example.apptugas

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("anime")
    fun getAnime(
        @Query("page[limit]") pageLimit: Int = 10,
        @Query("page[offset]") pageOffset: Int = 0
    ):Call<AnimeResponse>
}