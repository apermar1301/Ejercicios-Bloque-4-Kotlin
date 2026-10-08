package com.github.apermar1301

fun main() {
    val de0a100 = De0a100()
    print(de0a100 contains 4)
}

class De0a100 {

    infix fun contains(number: Int) : Boolean{
        return number in 0..100
    }

}