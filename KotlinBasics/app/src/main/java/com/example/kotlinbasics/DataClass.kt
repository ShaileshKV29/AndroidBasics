package com.example.kotlinbasics

data class User(val id: Int, val name: String)

fun main()
{
    val user1 = User(1, "Shailesh")
    println("User Data: $user1")
}