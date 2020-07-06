package com.justserve.partner.di.module

import com.familyroots.customer.views.activities.LoginActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector(modules = [FragmentModule::class])
    abstract fun contributeLoginActivity(): LoginActivity

}