package com.example.class_object_interface

class DefiningClass {


    class Client(val name: String, val postalCode: Int) {
        override fun toString(): String =  "Client (name = $name, postalCode = $postalCode)"

        override fun equals(other: Any?): Boolean {
            if(other == null || other !is Client) return false
            return name == other.name && postalCode == other.postalCode
        }
    }



    fun equalsTest() {
        val client1 = Client("eddy", 9999)
        val client2 = Client("eddy", 9999)

        println(client1.equals(client2))
    }



}