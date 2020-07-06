package com.familyroots.customer

import android.app.Activity
import android.app.Application
import androidx.lifecycle.LifecycleObserver
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class FamilyRootsApplication : Application(), HasActivityInjector,LifecycleObserver{

    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
    }

    override fun onTerminate() {
        super.onTerminate()
    }

    override fun onLowMemory() {
        super.onLowMemory()
    }
    override fun activityInjector(): AndroidInjector<Activity> = activityInjector
}