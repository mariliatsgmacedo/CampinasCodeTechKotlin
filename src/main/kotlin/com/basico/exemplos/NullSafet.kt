package com.basico.exemplos

fun main(){
    //var a: Int? = null //2 ou 5
    //println(a?.dec())

    val opc: String? = null //test
    val obg: String = opc ?: "Valor Padrão"
    println(obg)
}