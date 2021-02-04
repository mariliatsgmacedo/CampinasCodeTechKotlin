package com.aula.exercicios

import java.util.*

fun main(){
    println("Digite um nome e veja que eu sei a ultima letra ")
    showLastCaracter(Scanner(System.`in`).nextLine())
}

fun showLastCaracter(name:String){
    println("A última letra do nome $name é : ${name.last()}")
}