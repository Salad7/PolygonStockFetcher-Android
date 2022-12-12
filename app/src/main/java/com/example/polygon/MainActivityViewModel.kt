package com.example.polygon

import android.util.Log
import com.example.polygon.api.PolygonApi
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.create

class MainActivityViewModel {

    var retrofit = Retrofit.Builder()
        .baseUrl("https://api.polygon.io/v3/reference/")
        .addConverterFactory(ScalarsConverterFactory.create())
        .build()

    init {

    }

    suspend fun queryStocks(s :String){
        var polygonApi = retrofit.create<PolygonApi>().queryTickers(s,"vGM47_0HjvEz4RB_05YtzyLdSQhddiKgZHCl0d")
        Log.d("MainActivityViewModel",polygonApi.toString())
    }
}