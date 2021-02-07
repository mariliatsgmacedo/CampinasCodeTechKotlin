package com.aula.exercicios

fun main() {

    for (i in 0..300 step 10){
        if (i > 290){
            println("it was not possible to reach up to 300")
            break
        }
        println(i)
    }
}