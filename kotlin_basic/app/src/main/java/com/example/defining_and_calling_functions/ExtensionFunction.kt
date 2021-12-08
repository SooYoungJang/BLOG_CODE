package com.example.defining_and_calling_functions

class ExtensionFunction {

    val strings: List<String> = listOf("first","second","three")

    fun extension1(list :List<String>): String {
        return list.last()
    }


}

fun String.to2xMutiple() : Int {
    return this.toInt() * 2
}
