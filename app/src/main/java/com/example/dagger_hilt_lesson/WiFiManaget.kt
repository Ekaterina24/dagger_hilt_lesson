package com.example.dagger_hilt_lesson

import android.util.Log
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject
import javax.inject.Singleton

class WiFiManager(private val settings: WiFiSettings) {
    fun connect() {
        settings.openConnection()
    }

    fun sendMessage() {
        settings.writeBytes()
    }
}

class WiFiSettings {
    fun openConnection() {
        Log.d("MyLog", "Connected")
    }

    fun writeBytes() {
        Log.d("MyLog", "Hello!")
    }
}