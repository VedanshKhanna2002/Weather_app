package com.yodgorbekkomilov.weatherapps.presentation

import com.yodgorbekkomilov.weatherapps.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)