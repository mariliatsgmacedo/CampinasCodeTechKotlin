package com.aula.exercicios

import java.util.*

fun main(){
    println(listaNomes("Tamiles","Macedo"))
}

fun listaNomes(vararg names:String): String {
    return "Lista de Pessoas: ${ names.reversed()}"
}