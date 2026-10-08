package com.github.apermar1301


fun main() {
    print("Type your age:\n\t> ")
    val age = readlnOrNull()?.toIntOrNull() ?: -1

    print(validate2(age))

}

fun validate2(age: Int): String {
    return when (age) {
        in 1..10 -> "1 al 10"
        in 11..20 -> "11 al 20"
        in 21..30 -> "21 al 30"
        in 31..40 -> "31 al 40"
        in 41..50 -> "41 al 50"
        else -> "Superior (50+)"
    }
}
