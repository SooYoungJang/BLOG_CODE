package com.example.kotlin_basic

import android.util.Log
import com.example.defining_and_calling_functions.DefiningFunctionExample1
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val list = listOf(1,2,3)
        val result = DefiningFunctionExample1().joinToString(list, ":", "!" , "@" )
        println(result)
    }
}