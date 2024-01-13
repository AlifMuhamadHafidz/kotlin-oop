package com.example.kotlinoop.inheritance

open class BasicRobot (){

    var name : String
    var modelYear : String = ""

    //custom getter

        get() {
            println("Getting the model year please wait ...")
            return field
        }


    //custom setter
    set(value) {
        println("Changing the model year, please wait...")
        if (value == "2025"){
            println("you can't create future robot")
        }else{
            field = value
        }
    }

    init {
        name = ""
        modelYear = ""
        println("new robot has been deployed")
    }
    //constructor
    constructor(name: String, modelYear : String): this(){
        this.name = name
        this.modelYear = modelYear
    }

    //secondary constructor
    constructor(name: String): this(){
        this.name = name
        this.modelYear = "Unknown Model Year"
    }


    fun walk(){
        println("$name is walking now...")
    }

    fun speak(message: String){
        println("$name says: $message")
    }
}