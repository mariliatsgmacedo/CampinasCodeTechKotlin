package com.aula.exercicios

import java.util.*

fun main() {
    val list:MutableList<Any> = mutableListOf()
    var opc: String

    do {
        getNameStudent(list)

        getScores(list)

        println("Continue? S or N")
        opc = Scanner(System.`in`).nextLine().toUpperCase()

    } while (opc == "S")

    showDetails(list)

}

fun getNameStudent(list: MutableList<Any>) {
    println("Enter name:")
    val nameStudent = Scanner(System.`in`).nextLine()
    list.add(nameStudent)
    println("Enter age:")
    val ageStudent = Scanner(System.`in`).nextInt()
    list.add(ageStudent)
}

fun getScores(list: MutableList<Any>) {
    (1..2).forEach {
        println("Enter score $it :")
        var score = Scanner(System.`in`).nextDouble()
        list.add(score)
    }
}

fun showDetails(list: MutableList<Any>) {

    list.mapIndexed { index, itemList ->
        when(index%4){
            0 -> {
                println()
                println("Name: $itemList")
            }

            1 -> {
                println("Age: $itemList")
            }

            2 -> {
                println("Score 1: $itemList")
            }

            3 -> {
                println("Score 2: $itemList")
            }
        }
    }

}