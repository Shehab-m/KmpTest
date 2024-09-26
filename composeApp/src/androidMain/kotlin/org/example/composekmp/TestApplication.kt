package org.example.composekmp

import android.app.Application
import di.initKoin
import org.koin.android.ext.koin.androidContext

class TestApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@TestApplication)
        }
    }
}