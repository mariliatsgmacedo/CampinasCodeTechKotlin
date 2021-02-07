package com.aula.exercicios

import java.util.*

fun main() {
    val numbers: MutableList<Int> = mutableListOf()

    println("Enter a number amount: ")
    var amountNumbers:Int = Scanner(System.`in`).nextInt()

   for (i in amountNumbers downTo 1){
       println("Enter one number: ")
       var number = Scanner(System.`in`).nextInt()
       numbers.add(number)
   }

    println(calMedia(numbers))

}

fun calMedia(list: MutableList<Int>):String{
    val media = list.average()
    val maxNumb = list.maxOrNull()
    return "Media: $media Maximo: $maxNumb List: $list"
}

