package com.imsosoft.myapplication

import javax.inject.Inject

class FirstImplementation
    @Inject constructor(): HiltInterface
{
    override fun hiltInterface(): String {
        return "First Implementation"
    }
}