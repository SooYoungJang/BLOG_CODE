package com.example.kotlin_basic.enumAndWhen

class ExampleSmartCase {

    fun eval(e: Expr) : Int {
        if(e is Num) {
            val n = e as Num // 여기서 as 는 원래 타입캐스팅을 하는 코드이지만 사실 불필요한 코드이다.
            return n.value
        }
        if(e is Sum) {
            val n = e
            return eval(e.right) + eval(e.left)
        }
        throw IllegalArgumentException("exception")
    }
}