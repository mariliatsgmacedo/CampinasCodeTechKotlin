package com.basico.operadores

fun main(){
    val(v1, v2, v3, v4) = listOf(3,5,7,9)

    val soma = v1 + v2 + v3 + v4
    val subtracao = v1 - v2 - v4
    val divisao = v4 / v1
    val resto = v1 % v3

    println("O resultado da Soma é: $soma")
    println("O resultado da Subtracao é: $subtracao")
    println("O resultado da Divisão é: $divisao")
    println("O resto é: $resto")
}