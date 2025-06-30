package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

/**
 * 搜索全球城市数据的数据模型
 */
data class PlaceResponse(val status: String, val places: List<Place>)

/**
 * 城市信息
 */
data class Place(
    val name: String, val location: Location,
    @SerializedName("formatted_address") val address: String
)

/**
 * 城市地理位置，lng：经度，lat：纬度
 */
data class Location(val lng: String, val lat: String)