package com.casa.exercicio

fun main(){
    val(num1, num2 , num3, num4, num5) = listOf(32,4,8,5,30)

    val result = (((num1/num2) * (num3 * num4)) - num5)

    println("O resultado da expressão é: $result")
}