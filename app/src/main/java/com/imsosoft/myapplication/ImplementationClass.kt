package com.imsosoft.myapplication

import javax.inject.Inject

class ImplementationClass
    @Inject constructor(
        @FirstImplementor private val firstImplementation: HiltInterface,
        @SecondImplementor private val secondImplementation: HiltInterface
    )
{
        fun printFunc(): String {
            return "Hello from ${firstImplementation.hiltInterface()}"
        }

    fun printFunc2(): String {
        return "Hello from ${secondImplementation.hiltInterface()}"
    }
}