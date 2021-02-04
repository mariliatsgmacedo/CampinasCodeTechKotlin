package com.aula.exercicios

import java.util.*

fun main(){

    val leitura = Scanner(System.`in`)
    println("Digite uma palavra para contar suas letras: ")

    val palavraMostrada : String = leitura.nextLine()
    println(tamanhoPalavra(palavraMostrada))

}

fun tamanhoPalavra(palavra:String): Int {
    return palavra.length
}