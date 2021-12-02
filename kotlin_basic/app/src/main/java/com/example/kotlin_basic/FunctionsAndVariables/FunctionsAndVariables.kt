package com.example.kotlin_basic.FunctionsAndVariables

class FunctionsAndVariables {

    val question = "삶, 우주, 그리고 모든 것에 대한 궁극적인 질문"
    val question1: String = "삶, 우주, 그리고 모든 것에 대한 궁극적인 질문"


    fun funName(word: String): String {
        println("Hello World")
        val fullWord = word + " in English"
        return fullWord
    }

    fun variables() {
        val languages = arrayListOf("java")
        languages.add("kotlin")
    }
}