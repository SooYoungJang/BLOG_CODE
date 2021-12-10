package com.example.class_object_interface

import android.provider.ContactsContract

class InitializerClass(val nickname: String)

class User constructor(_nickname: String) {
    val nickname: String

    init {
        nickname = _nickname
    }

}


class Gamer constructor(_nickname: String = "Faker") {
    val nickname: String

    init {
        nickname = _nickname
    }

}