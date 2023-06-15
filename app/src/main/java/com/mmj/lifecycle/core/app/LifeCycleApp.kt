package com.mmj.lifecycle.core.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class LifeCycleApp : Application() {

    override fun onCreate() {
        super.onCreate()
    }
}