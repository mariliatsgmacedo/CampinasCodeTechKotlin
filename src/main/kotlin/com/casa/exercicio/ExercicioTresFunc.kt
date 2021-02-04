package com.casa.exercicio

import java.util.*

fun main(){

    println("Digite o primeiro número: ")
    val numeroU = Scanner(System.`in`).nextInt()

    println("Digite o segundo número: ")
    val numeroD = Scanner(System.`in`).nextInt()

    soma(numeroU,numeroD)
    subtracao(numeroU,numeroD)
    multiplicacao(numeroU,numeroD)
    divisao(numeroU,numeroD)
    modulo(numeroU,numeroD)
}

fun soma(a:Int,b:Int){
    println("A soma de $a + $b = ${a+b}")
}

fun subtracao(a:Int,b:Int){
    println("A subtracao de $a - $b = ${a-b}")
}

fun multiplicacao(a:Int,b:Int){
    println("A multiplicacao de $a * $b = ${a*b}")
}

fun divisao(a:Int,b:Int){
    println("A divisao de $a / $b = ${a/b}")
}

fun modulo(a:Int,b:Int){
    println("O modulo de $a % $b = ${a%b}")
}