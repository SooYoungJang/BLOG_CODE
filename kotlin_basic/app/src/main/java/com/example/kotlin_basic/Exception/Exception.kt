package com.example.kotlin_basic.Exception

import android.util.Log
import java.lang.NumberFormatException

class Exception {


    fun basicFun() {
        var percentage = 99
        if (percentage !in 0..10) {
            throw IllegalArgumentException("A percentage value must be between 0 and 100 : $percentage")
        }
    }

    fun basicFun1() {
        val number = 50
        val percentage =
            if (number in 0..100) number
            else throw IllegalArgumentException("A percentage value must be between 0 and 100 : $number")
    }

    fun basicFun2(): Int? {
        try {
            val number = "150"
            return number.toInt()
        } catch (e: NumberFormatException) {
            return null
        } finally {
            println("basicFun2 함수가 호출이 끝났습니다.")
        }
    }

    fun basicFun3() {
        val age: String = "18"
        val number = try {
            age.toInt()
        } catch (e: NumberFormatException) {
            null
        }
        println(number)
    }
}