package com.example.poccomposenavigation

import android.app.Application
import com.example.di.intent.intentModule
import com.example.di.presentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(
                intentModule +
                        listOf(
//                            dataModule,
//                            dataRemoteModule,
//                            dataLocalModule,
//                            useCaseModule,
                            presentationModule
                        )
            )
        }
    }
}