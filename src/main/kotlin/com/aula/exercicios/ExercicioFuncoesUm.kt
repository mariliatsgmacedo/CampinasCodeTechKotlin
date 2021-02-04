package com.aula.exercicios

fun main(){
    operacoesAleatorias(5,2)
}

fun operacoesAleatorias(a:Int,b:Int) {
    val resulted = (((a+b) * a) / b)
    println("A soma/multiplicação e divisão é ((($a + $b) * $a) / $b) = $resulted")
}