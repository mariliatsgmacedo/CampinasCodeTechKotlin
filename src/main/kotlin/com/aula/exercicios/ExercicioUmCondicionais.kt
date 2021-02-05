package com.aula.exercicios

import java.util.*

fun main(){
    println("Insert one number: ")
    println(negative(Scanner(System.`in`).nextInt()))
}

fun negative(number:Int):String{
    return if(number >= 0){
        "Positive"
    } else{
        "Negative"
    }
}