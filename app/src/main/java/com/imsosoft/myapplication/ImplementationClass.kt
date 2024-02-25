package com.imsosoft.myapplication

import javax.inject.Inject

class ImplementationClass
    @Inject constructor(private val firstImplementation: HiltInterface)
{
        fun printFunc(): String {
            return "Hello from ${firstImplementation.hiltInterface()}"
        }
}