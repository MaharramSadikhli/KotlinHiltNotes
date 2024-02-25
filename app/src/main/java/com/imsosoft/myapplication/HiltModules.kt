package com.imsosoft.myapplication

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
class HiltModules {

    @FirstImplementor
    @Singleton
    @Provides
    fun providerFunctionFirst(): HiltInterface {
        return FirstImplementation()
    }

    @SecondImplementor
    @Singleton
    @Provides
    fun providerFunctionSecond(): HiltInterface {
        return SecondImplementation()
    }

}