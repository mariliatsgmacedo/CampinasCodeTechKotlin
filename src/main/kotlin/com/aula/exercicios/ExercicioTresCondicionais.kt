package com.aula.exercicios

import java.util.*

fun main(){
    println("Enter with one score: ")
    calcScore(Scanner(System.`in`).nextInt())
}

 fun calcScore(score: Int) {
    when (score) {
        10 -> println("Great! Good score, you passed!")
        9 -> println("Good score, you passed!")
        8 -> println("You passed!")
        else -> println("Score not expected, you don't passed!")
    }
}

