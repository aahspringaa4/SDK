package com.example.sdk_project.di

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import com.example.sdk_project.di.module.*

class SdkApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@SdkApplication)

            modules(
                listOf(
                    AuthModule,
                    MainModule,
                    MypageModule,
                    PostDetailModule,
                    ProfileModule,
                    CreatePostModule
                )
            )
        }
    }
}