package com.example.polygon.api

import retrofit2.http.GET
import retrofit2.http.Query

interface PolygonApi {


    @GET("tickers")
    suspend fun queryTickers(@Query("search") search :String, @Query("apiKey") apiKey :String) :String
}