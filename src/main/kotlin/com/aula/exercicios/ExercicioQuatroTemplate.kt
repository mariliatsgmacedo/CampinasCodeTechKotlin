package com.aula.exercicios

import java.util.*

fun main(){
    println("Digite seu nome e veja a mágica acontecer: ")
    showCapsName(Scanner(System.`in`).nextLine())
}

fun showCapsName(name:String){
    println("This is the most magic in the world: ${name.toUpperCase()}")
}