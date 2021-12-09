package com.example.kotlin_basic

import android.util.Log
import com.example.class_object_interface.Button
import com.example.defining_and_calling_functions.DefiningFunctionExample1
import com.example.defining_and_calling_functions.ExtensionFunction
import com.example.defining_and_calling_functions.to2xMutiple
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun test_coding() {
        val strings: String = "4"

        println(" result =  "+ strings.to2xMutiple())

    }
}