package com.emil.mobileuptest

import com.squareup.moshi.Json

data class CryptoResponse(
    @Json(name = "id") val id: String,
    @Json(name = "symbol") val symbol: String,
    @Json(name = "name") val name: String,
    @Json(name = "image") val image: String,
    @Json(name = "current_price") val currentPrice:Double,
    @Json(name = "price_change_percentage_24h") val priceChangePercentage24h: Double

)