package com.sunnyweather.android.logic.dao

import com.google.gson.Gson
import com.sunnyweather.android.logic.model.Place
import android.content.Context
import androidx.core.content.edit
import com.sunnyweather.android.SunnyWeatherApplication


object PlaceDao {
    // 保存选中的城市名
    fun savePlace(place: Place) {
        sharedPreferences().edit {
            putString("place", Gson().toJson(place))
        }
    }

    // 获取已经保存的选中城市名
    fun getSavedPlace(): Place {
        val placeJson = sharedPreferences().getString("place", "")
        return Gson().fromJson(placeJson, Place::class.java)
    }

    // 判断选择的城市名是否保存
    fun isPlaceSaved() = sharedPreferences().contains("place")

    private fun sharedPreferences() = SunnyWeatherApplication.context
        .getSharedPreferences("sunny_weather", Context.MODE_PRIVATE)
}