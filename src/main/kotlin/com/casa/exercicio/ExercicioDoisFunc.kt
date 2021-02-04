package com.casa.exercicio

import java.util.*

fun main() {
    val listNotas = mutableListOf<Double>()

    (1..4).forEach{
    println("Digite a $it nota do aluno: ")
        listNotas.add(Scanner(System.`in`).nextDouble())
    }

    println(calculoNotas(listNotas))
}

fun calculoNotas(list: MutableList<Double>):String{
    var soma : Double = 0.0

    list.forEach {
        soma += it
    }

    return "A média do aluno é ${soma/list.size}"
}


