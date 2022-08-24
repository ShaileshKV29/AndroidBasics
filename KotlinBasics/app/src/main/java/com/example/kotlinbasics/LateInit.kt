package com.example.kotlinbasics

fun main()
{
    var myCar = Car()
//    myCar.owner
    myCar.maxSpeed = 200
    println(myCar.model)
    println(myCar.price)
}

class Car
{
    lateinit var owner: String
    var price = 1000000
    var maxSpeed: Int = 250

    set(value)
    {
        field = if(value > 0) value else throw IllegalArgumentException("Max Speed cannot be less than 0")
    }

    var model: String = "M5"
    private set

}