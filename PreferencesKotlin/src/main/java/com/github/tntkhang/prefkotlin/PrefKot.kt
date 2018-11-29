package com.github.tntkhang.prefkotlin

import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson

class PrefKot {
    private lateinit var instance: PrefKot
    var pref: SharedPreferences

    constructor(context: Context) {
        pref = context.applicationContext.getSharedPreferences(context.getString(R.string.app_name), Context.MODE_PRIVATE)
    }

    constructor(context: Context, prefName: String) {
        pref = context.applicationContext.getSharedPreferences(prefName, Context.MODE_PRIVATE)
    }

    fun setVal(key: String, value: String) {
        pref.edit().putString(key, value).apply()
    }

    fun setVal(key: String, value: Boolean) {
        pref.edit().putBoolean(key, value).apply()
    }
    fun setVal(key: String, value: Any) {
        setVal(key, Gson().toJson(value))
    }
    fun setVal(key: String, value: Int) {
        pref.edit().putInt(key, value).apply()
    }
    fun setVal(key: String, value: Long) {
        pref.edit().putLong(key, value).apply()
    }
    fun setVal(key: String, value: Float) {
        pref.edit().putFloat(key, value).apply()
    }
    fun setVal(key: String, value: Double) {
        setVal(key, value.toString())
    }
}