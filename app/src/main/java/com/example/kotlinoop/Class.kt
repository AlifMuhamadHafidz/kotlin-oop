package com.example.kotlinoop

import com.example.kotlinoop.inheritance.OrdinaryRobot
import com.example.kotlinoop.inheritance.SuperRobot

fun main(){
    //creating object from robot class
    val robotOne : Robot = Robot("Bestie")
    robotOne.walk()

    robotOne.speak("TYGBTWAGSMKYCIA")

    val superRobot : SuperRobot = SuperRobot("beliau")
    superRobot.firing()

    val ordinaryRobot : OrdinaryRobot = OrdinaryRobot("dia")
    ordinaryRobot.turnOnLight()

    //secondary constructor

    val superRobot2 : SuperRobot = SuperRobot("uong", modelYear = "1992")
    superRobot2.firing()
    println(superRobot2.modelYear)

    val ordinaryRobot2 : OrdinaryRobot = OrdinaryRobot("wong")
    println(ordinaryRobot2.modelYear)

    //custom setter
    superRobot2.modelYear = "2025"

    //custom getter
    println(superRobot2.modelYear)


}


class Robot(val name: String){
    fun walk(){
        println("$name is walking now...")
    }

    fun speak(message: String){
        println("$name says: $message")
    }
}