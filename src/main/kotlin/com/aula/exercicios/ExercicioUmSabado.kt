package com.aula.exercicios

import java.util.*

fun main() {
    println("Enter apple amount: ")
    val amountApple = Scanner(System.`in`).nextInt()

    calcPrice(amountApple)
}

private fun calcPrice(amountApple: Int) {
    if (amountApple < 12) {
        val priceApple = 4.30
        val total = amountApple * priceApple
        println("Total to pay R$: %.2f".format(total))
        println("Price Apple R$: %.2f".format(priceApple))
    } else {
        val priceApple = 4.00
        val total = amountApple * priceApple
        println("Total to pay R$: %.2f".format(total))
        println("Price Apple R$: %.2f".format(priceApple))
    }
}