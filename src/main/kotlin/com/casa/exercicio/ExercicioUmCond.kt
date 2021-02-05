package com.casa.exercicio

import java.util.*

fun main(){

    println("Enter with the first score: ")
    val scoreOne: Double = Scanner(System.`in`).nextDouble()

    println("Enter with the first score: ")
    val scoreTwo: Double = Scanner(System.`in`).nextDouble()

    isApproved(scoreOne, scoreTwo)


}

 fun isApproved(scoreOne: Double, scoreTwo: Double) {
    if (calMedia(scoreOne, scoreTwo) >= 6) {
        println("Student Approved")
        println("Result: ${calMedia(scoreOne, scoreTwo)}")
    } else {
        println("Student Reproved")
        println("Result: ${calMedia(scoreOne, scoreTwo)}")
    }
}

fun calMedia(scOne: Double, scTwo: Double): Double {
    return (scOne + scTwo) / 2
}

