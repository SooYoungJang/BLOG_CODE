package com.example.kotlin_basic.classAndProperty

class Person {
    val name: String =  "my name " + " is bill "

    val name1 : String
        get() = sumString()

    fun sumString() : String {
        return "my name " + " is bill "
    }
}