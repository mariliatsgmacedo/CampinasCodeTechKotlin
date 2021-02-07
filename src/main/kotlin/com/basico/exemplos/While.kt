package com.basico.exemplos

import java.util.*

fun main(){

    val values: MutableList<Double> = mutableListOf()
    var option: String = ""

    while (option != "N" && option != "n"){
        println("Enter the value:")
        val buy = readLine()!!.toDouble()
        values.add(buy)

        println("Continue? Y/N")
        option = readLine() ?: "N"
    }
    println(values)


}