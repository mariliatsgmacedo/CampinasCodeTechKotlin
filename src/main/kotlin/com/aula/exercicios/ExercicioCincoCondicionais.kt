package com.aula.exercicios

fun main(){
    val listNumbers = listOf(10,2,0,8,22,5)
    firstItem(listNumbers)
    secondItem(listNumbers)
}

fun firstItem(list: List<Int>) {
     if(list[0] > list[5]) {
           println("The largest number is the first")
     } else{
         println("The first number is not greater than the last.")
     }
}

fun secondItem(list: List<Int>){
    if(list[1] > list[0]){
        println("the second number is greater than the first")
    } else{
        println("The second number is not greater than the first")
    }
}