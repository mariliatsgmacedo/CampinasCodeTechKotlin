package com.casa.exercicio

import java.util.*

fun main(){

    println("Enter how many pounds of strawberry you want")
    val strawberryKg:Double = Scanner(System.`in`).nextDouble()

    println("Enter how many pounds of apples you want")
    val appleKg:Double = Scanner(System.`in`).nextDouble()

    val totalValue = getTotalValue( strawberryKg, appleKg)

    val totalFruitsKg = strawberryKg + appleKg

    val valueToPayment = applyDiscount(totalFruitsKg, totalValue)

    println(" R$%.2f".format(valueToPayment))



}

fun applyDiscount(totalFruitsKg: Double, totalValue: Double): Double {
    return if ((totalFruitsKg > 8) or (totalValue < 25)) {
        totalValue - (totalValue * 0.1)
    } else {
        totalValue
    }
}

fun getTotalValue(strawberryKg: Double, appleKg: Double):Double {
    val appleValues = listOf(3.80, 3.50)
    val strawberryValues = listOf(5.50, 5.20)

    val strawberryTotal: Double = if (strawberryKg <= 5) {
        strawberryValues[0] * strawberryKg
    } else {
        strawberryValues[1] * strawberryKg
    }

    val appleTotal:Double = if (appleKg <= 5) {
        appleValues[0] * appleKg
    } else {
        appleValues[1] * appleKg
    }


    return  strawberryTotal + appleTotal
}

