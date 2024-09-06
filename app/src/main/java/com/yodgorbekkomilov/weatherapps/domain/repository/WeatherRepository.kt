package com.yodgorbekkomilov.weatherapps.domain.repository

import com.yodgorbekkomilov.weatherapps.domain.util.Resource
import com.yodgorbekkomilov.weatherapps.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}