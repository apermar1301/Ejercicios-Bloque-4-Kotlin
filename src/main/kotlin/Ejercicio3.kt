package com.github.apermar1301

fun main(){

    print("Type your age:\n> ")
    val age = readlnOrNull()?.toIntOrNull() ?: -1
    print("Type your anual incomes:\n> ")
    val anualIncomes = readlnOrNull()?.toDoubleOrNull() ?: -1.0
    val category = calculateCategory(age, anualIncomes)

    print("Your category was detected as: \n\t$category")


}

fun calculateCategory(age: Int, incomes: Double): String {

    return when {
        //validation
        age < 0 -> "There has been an error with the AGE"
        incomes < 0 -> "There has been an error with the INCOMES"
        
        age < 18 -> "Minor worker"
        age in 18..64 -> {
            when {
                incomes < 20_000.00 -> "Young worker with low incomes"
                incomes in 20_000.00..60_000.00 -> "Adult worker with medium incomes"
                else -> "Adult worker with high incomes"
            }
        }
        else -> {
            when {
                incomes < 15_000.00 -> "Elderly with low incomes"
                incomes in 15_000.00..40_000.00 -> "Elderly with medium incomes"
                else-> "Elderly with high incomes"
            }
        }
    }

}