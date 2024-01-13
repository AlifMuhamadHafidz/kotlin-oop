package com.example.kotlinoop.inheritance

import com.example.kotlinoop.inheritance.BasicRobot

class OrdinaryRobot : BasicRobot{
    constructor(name : String, modelYear: String):super(name, modelYear)
    constructor(name : String):super(name)
    fun turnOnLight(){
        println("$name Turn On the light")
    }
}