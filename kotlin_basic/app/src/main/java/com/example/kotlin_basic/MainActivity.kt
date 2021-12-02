package com.example.kotlin_basic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println(funName("word"))

        val question = "삶, 우주, 그리고 모든 것에 대한 궁극적인 질문"
        val question1: String = "삶, 우주, 그리고 모든 것에 대한 궁극적인 질문"

        val languages = arrayListOf("java")
        languages.add("kotlin")

    }

    fun funName(word: String) : String {
        println("Hello World")
        val fullWord = word + " in English"
        return fullWord
    }


}