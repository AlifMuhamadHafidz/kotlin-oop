package com.example.kotlinoop.inheritance

import com.example.kotlinoop.inheritance.BasicRobot

class SuperRobot: BasicRobot {
    constructor(name : String, modelYear : String):super(name, modelYear)
    constructor(name : String):super(name)
    fun firing(){
        println("$name firing a laser beam")
    }
}