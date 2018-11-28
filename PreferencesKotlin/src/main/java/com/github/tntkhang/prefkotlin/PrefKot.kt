package com.github.tntkhang.prefkotlin

import android.content.Context
import android.content.SharedPreferences

class PrefKot {
    private lateinit var instance: PrefKot
    var pref: SharedPreferences

    constructor(context: Context) {
        pref = context.applicationContext.getSharedPreferences(context.getString(R.string.app_name), Context.MODE_PRIVATE)
    }

    constructor(context: Context, prefName: String) {
        pref = context.applicationContext.getSharedPreferences(prefName, Context.MODE_PRIVATE)
    }

    class Instance {
        companion object {
            fun setVal(value: String) {
                pref.
            }
        }
    }

}