package com.aula.exercicios

import java.util.*
import kotlin.collections.ArrayList

fun main(){
    val scores = ArrayList<Double>()

    println("Digite o nome do aluno: ")
    val nameStudent:String = Scanner(System.`in`).nextLine()
    println(nameStudent)

    (1 .. 3).forEach {
        println("Digite a nota $it do aluno: ")
        scores.add(Scanner(System.`in`).nextDouble())
    }


    println("A segunda nota do aluno $nameStudent é: ${scores[1]}")



}



