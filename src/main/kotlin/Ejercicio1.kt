package com.github.apermar1301


fun main() {
    print(calculateAverage(intArrayOf(1, 5, 4, 4)))
}

fun calculateAverage(numbers: IntArray): Double {
    return (numbers.sum() / numbers.size).toDouble();
}