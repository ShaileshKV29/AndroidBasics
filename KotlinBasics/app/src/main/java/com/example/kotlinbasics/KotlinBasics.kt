package com.example.kotlinbasics

fun main()
{
    val shailesh = Person("Shailesh", "Kumar Verma")
    shailesh.setPersonHobby("Anime")
    shailesh.getHobby()
//    Person()
//    function(10)
}

fun function(a: Int)
{
    println("a : $a")
    var a:Int = 15
    println("a : $a")
}

class Person(firstName: String = "John", lastName: String = "Doe")
{
    var age: Int? = null
    var hobby: String? = null

    init {
        println("First Name: $firstName, Last Name: $lastName")
    }

    constructor(firstName: String, lastName: String, age: Int): this(firstName, lastName)
    {
        this.age = age
    }

    fun setPersonHobby(hobby: String)
    {
        this.hobby = hobby
    }

    fun getHobby()
    {
        println("Hobby: $hobby")
    }
}