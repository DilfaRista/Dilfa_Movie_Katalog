package com.dilfa.dilfa_movie_katalog.service

import retrofit2.Call
import retrofit2.http.GET

interface MovieAPIinterface {
    @GET("/3/movie/popular?api_key=ee0cb6b635a1b1bcf3e65481068e12c1")
    fun getMovieList(): Call<MovieResponse>
}