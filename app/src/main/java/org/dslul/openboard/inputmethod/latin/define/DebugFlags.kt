package com.chumian.ime.define

import android.content.SharedPreferences

object DebugFlags {
    const val DEBUG_ENABLED = false
    @JvmStatic
    fun init(prefs: SharedPreferences?) {}
}