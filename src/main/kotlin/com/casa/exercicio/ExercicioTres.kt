package com.casa.exercicio

fun main() {
    val chuva: Boolean = true
    val molha: Boolean = false
    val venta: Boolean = false
/*
    //verdadeiro
    var tempestadeX = (chuva xor molha) xor venta
    println(tempestadeX)

    //falso
    var tempestadeE = (chuva && molha && venta)
    println(tempestadeE)

    //verdadeiro
    var tempestadeO = (chuva || molha || venta)
    println(tempestadeO)

*/
    println((chuva xor molha) xor venta)
    println((chuva && molha && venta))
    println((chuva || molha || venta))

}