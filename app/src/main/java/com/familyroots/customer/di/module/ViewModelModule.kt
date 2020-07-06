package com.justserve.partner.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.an.trailers.di.module.ViewModelKey
import com.an.trailers.factory.ViewModelFactory
import com.familyroots.customer.viewmodels.LoginViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
internal abstract class ViewModelModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(LoginViewModel::class)
    protected abstract fun loginViewModel(loginViewModel: LoginViewModel): ViewModel

}