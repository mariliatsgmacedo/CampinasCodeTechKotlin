package com.basico.operadores

import java.util.*

fun main(){
    println("Marília" === "marília") //Posição é igual a outra
    println("Marí" == "marí") //Posição é igual a outra

    val a: String = "Marília"
    val b: String = "Marília"

    println(a === b)

    val d1 = Date(0)
    val d2 = Date(0)

    println(d1 == d2)
    println(d1 === d2)

    println(3 != 2)

    //Operadores Lógicos

    val x : Boolean = true
    val y : Boolean = true


    val z : Boolean = x || y
    val w : Boolean = x && y
    val t : Boolean = (x xor y) xor z //Condições Iguais é falso. Condições diferentes é verdadeiro.

    println("Booleano de Z $z")
    println("Booleano de W $w")
    println("Booleano de T $t")

}
