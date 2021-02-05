package com.aula.exercicios

import java.util.*

fun main(){
    println("Informe o raio do círculo: ")
    println(calculaArea(Scanner(System.`in`).nextDouble()))
}

fun calculaArea(raio:Double):Double{
    return  3.14 * (raio * raio)
}