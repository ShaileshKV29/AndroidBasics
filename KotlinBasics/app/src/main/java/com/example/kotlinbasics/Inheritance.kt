package com.example.kotlinbasics

// All classes in Kotlin are Final by Default
open class Game(id: Int, name: String, genre: String){
    // Properties
    // Methods
}

class Bloodborne(id: Int, name: String, genre: String) : Game(id, name, genre)
{

}

fun main()
{
    val name: String
    val id: Int

    name = "Shailesh"
    id = 1
    println("$name $id")
}