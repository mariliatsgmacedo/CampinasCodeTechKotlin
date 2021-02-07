package com.aula.exercicios

import java.util.*

fun main() {
    val listClient: MutableList<Any> = mutableListOf()

    getInfo(listClient)

    showInfoBalance(listClient)

}

private fun getInfo(listClient: MutableList<Any>) {
    println("Enter count number: ")
    val countNumberClient = Scanner(System.`in`).nextInt()
    listClient.add(countNumberClient)
    println("Enter balance: ")
    val balanceClient = Scanner(System.`in`).nextDouble()
    listClient.add(balanceClient)
    println("Enter debit: ")
    val debitClient = Scanner(System.`in`).nextDouble()
    listClient.add(debitClient)
    println("Enter credit: ")
    val creditClient = Scanner(System.`in`).nextDouble()
    listClient.add(creditClient)
}

private fun showInfoBalance(listClient: MutableList<Any>) {
    var balanceCurrent = 0.0

    listClient.mapIndexed { index, itemList ->

        when (index % 4) {

            0 -> {
                println()
                println("Count: $itemList")
                balanceCurrent = 0.0
            }

            1 -> {
                println("Balance: $itemList")
                balanceCurrent = itemList as Double
            }

            2 -> {
                println("Debit: $itemList")
                balanceCurrent -= itemList as Double
            }

            3 -> {
                println("Credit: $itemList")
                balanceCurrent += itemList as Double
                println("Balance Current: %.2f".format(balanceCurrent))
                println(if(balanceCurrent >=0) "Balance positive" else "Balance negative")

            }

        }

    }
}