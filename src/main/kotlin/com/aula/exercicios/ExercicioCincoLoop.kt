package com.aula.exercicios

fun main() {

    //Not yet

    var plus:Int = 0

    for (i in 0..100 step 2){
        if (i > 96){
            plus = i+4
            println("Loop Finished")
            continue
        }
        println(i)
    }

}