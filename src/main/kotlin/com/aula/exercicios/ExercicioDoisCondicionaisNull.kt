package com.aula.exercicios

import java.util.*

fun main(){
    println("Insert one number: ")
    println(isBiggerThan(Scanner(System.`in`).nextInt()))
}

fun isBiggerThan(result:Int?): String {
  return if (result == null) "Its not biggest than 10" else if (result > 10) "Biggest than 10" else "Its not biggest than 10"
}

