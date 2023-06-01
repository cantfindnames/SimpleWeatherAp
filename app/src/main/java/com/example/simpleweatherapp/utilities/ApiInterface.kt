package com.example.simpleweatherapp.utilities

import com.example.simpleweatherapp.models.WeatherModels
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("weather")
    fun getCurrentWeatherData(
        @Query("lat") lat:String,
        @Query("lon") lon:String,
        @Query("APPID") appid:String
    ):Call<com.example.simpleweatherapp.models.WeatherModels>

    @GET("weather")
    fun getCityWeatherData(
        @Query("q") q:String,
        @Query("APPID") appid:String
    ):Call<com.example.simpleweatherapp.models.WeatherModels>



}