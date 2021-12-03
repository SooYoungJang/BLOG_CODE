package com.example.kotlin_basic.enumAndWhen

class ExampleWhen {

    fun testCase(color: Color) =
        when (color) {
            Color.BLUE -> "blue ~~"
            Color.INDIGO -> "indigo ~~"
            Color.GREEN -> "green ~~"
            Color.ORANGE -> "orange ~~"
            Color.RED -> "red ~~"
            Color.VIOLET -> "violet ~~"
            Color.YELLOW -> "yellow ~~"
        }

    fun mix(c1: Color, c2: Color) =
        when (setOf(c1, c2)) {
            setOf(Color.YELLOW, Color.VIOLET) -> Color.ORANGE
            setOf(Color.RED, Color.VIOLET) -> Color.INDIGO
            setOf(Color.GREEN, Color.INDIGO) -> Color.BLUE
            else ->  " 값은 값이 없네 ~~"
        }
}