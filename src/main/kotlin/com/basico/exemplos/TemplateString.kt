package com.basico.exemplos

fun main(){
    val nome : String = "Marília"
    val aprovados = listOf("Tamiles","Macedo","Guerra")
    var a:Int = 356.dec()
    var b:String = a.toString()

    println("O nome é $nome")
    println("O primeiro colocado é: ${aprovados[0]}")
    println("Int: $a")
    println("Primeiro caractere da String: ${b.first()}")
}