package com.imsosoft.myapplication

import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class Animals
    @Inject
    constructor(cat: Cat, dog: Dog) {

    fun food() {
        println("animals ate food")
    }

}