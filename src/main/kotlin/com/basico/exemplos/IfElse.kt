package com.basico.exemplos

fun main(){
    val nota: Double = 8.0

    var resultado = if (nota >= 7.0) "bigger" else "less"

    println(resultado)

    val feels = true
    println("Today i'm ${if(feels) "Happy" else "Sad"}")

    if(nota in 9.5..10.0){
        println("great")
    } else if(nota in 7.0..8.99){
        println("Good")
    } else {
        println("Not value")
    }

    when(nota){
        in 20.2..19.5 -> println("Using Range")
        10.0,9.0 -> println("Great")
        8.0,6.5 -> println("Good")
        else -> println("Not value")
    }
}