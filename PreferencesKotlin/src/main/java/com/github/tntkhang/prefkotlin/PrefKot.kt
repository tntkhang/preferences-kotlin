package com.github.tntkhang.prefkotlin

import android.content.SharedPreferences

class PrefKot {
    var instance: PrefKot
    val pref: SharedPreferences


    class AA {
        companion object {
            fun getInstance(): SharedPreferences {

            }
        }
    }

}