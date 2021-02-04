package com.aula.exercicios

import java.util.*

fun main(){

    println("Digite uma palavra para contar suas letras: ")
    println(tamanhoPalavra(Scanner(System.`in`).nextLine()))

}

fun tamanhoPalavra(palavra:String): Int {
    return palavra.length
}