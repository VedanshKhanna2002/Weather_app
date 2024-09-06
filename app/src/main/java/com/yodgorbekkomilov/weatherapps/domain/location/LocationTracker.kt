package com.yodgorbekkomilov.weatherapps.domain.location

import android.location.Location

interface LocationTracker {
    suspend fun getCurrentLocation(): Location?
}