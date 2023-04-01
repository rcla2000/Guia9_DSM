package com.example.retrofitapp_la181955
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("{usuario}/repos")
    fun getDogsByBreed(@Path("usuario") raza: String?): Call<DogsResponse?>?
}