package com.justserve.partner.di.component


import android.app.Application
import com.familyroots.customer.FamilyRootsApplication
import com.justserve.partner.di.module.ActivityModule
import com.justserve.partner.di.module.FragmentModule
import com.justserve.partner.di.module.ViewModelModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ViewModelModule::class,
        AndroidSupportInjectionModule::class,
        ActivityModule::class,
        FragmentModule::class
    ]
)
interface ApplicationComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app: Application): Builder
        fun build(): ApplicationComponent
    }

    fun inject(familyRootsApplication: FamilyRootsApplication)
}