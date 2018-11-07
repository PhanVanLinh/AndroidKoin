package vn.linh.androidkoin

import android.app.Application
import org.koin.android.ext.android.startKoin
import vn.linh.androidkoin.screen.di.appModule

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin(this, listOf(appModule))
    }
}