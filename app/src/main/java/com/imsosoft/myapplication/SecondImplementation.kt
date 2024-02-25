package com.imsosoft.myapplication

import javax.inject.Inject

class SecondImplementation
    @Inject constructor(): HiltInterface
{
    override fun hiltInterface(): String {
        return "Second Implementation"
    }

}