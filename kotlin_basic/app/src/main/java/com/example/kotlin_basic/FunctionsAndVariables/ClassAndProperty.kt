package com.example.kotlin_basic.FunctionsAndVariables

class ClassAndProperty {
    val name: String =  "my name " + " is bill "

    fun sumString() : String {
        return "my name " + " is bill "
    }



    class Person(
        val name: String,// 변경 불가능한 , 게터를 만들어 낸다.
        val sex: String //변경 가능한 , 게터와 세터를 만들어 낸다.
    )

}