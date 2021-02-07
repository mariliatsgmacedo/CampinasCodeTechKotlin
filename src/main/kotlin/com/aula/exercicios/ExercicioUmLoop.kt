package com.aula.exercicios

import java.util.*

fun main() {

    val list: MutableList<String> = mutableListOf()

    for (i in 1..5){
        println("Enter number write: ")
        val itemsList = Scanner(System.`in`).nextLine()
        list.add(itemsList)
    }

    for ((indic,itemsList) in list.withIndex()){
        println( "${indic+1} -> $itemsList")
    }
}