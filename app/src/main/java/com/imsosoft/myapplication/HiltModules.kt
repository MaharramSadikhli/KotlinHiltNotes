package com.imsosoft.myapplication

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
class HiltModules {

    @Singleton
    @Provides
    fun providerFunctionFirst(): HiltInterface {
        return FirstImplementation()
    }

}