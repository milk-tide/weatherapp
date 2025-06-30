package com.sunnyweather.android.logic.network

import com.sunnyweather.android.SunnyWeatherApplication
import com.sunnyweather.android.logic.model.DailyResponse
import com.sunnyweather.android.logic.model.RealtimeResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface WeatherService {
    @GET("v2.5/${SunnyWeatherApplication.TOKEN}/{lng},{lat}/realtime.json")
    suspend fun getRealtimeWeather(
        @Path("lng") lng: String,
        @Path("lat") lat: String
    ): RealtimeResponse

    @GET("v2.5/${SunnyWeatherApplication.TOKEN}/{lng},{lat}/daily.json")
    suspend fun getDailyWeather(
        @Path("lng") lng: String,
        @Path("lat") lat: String
    ): DailyResponse
}
