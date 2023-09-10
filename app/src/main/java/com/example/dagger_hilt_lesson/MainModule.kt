package com.example.dagger_hilt_lesson

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn (SingletonComponent::class)
object MainModule {

    @Provides
    @Singleton
    fun provideWiFiManager(settings: WiFiSettings): WiFiManager {
        return WiFiManager(settings)
    }

    @Provides
    fun provideWiFiSettings(): WiFiSettings {
        return WiFiSettings()
    }
}