package com.basico.exemplos

fun main() {
    /**
    val values: MutableList<Double> = mutableListOf()

    for (value in values){
        println("The values $value")
    }
     *
     * */

    for (i in 1..10){
        if (i == 5){
            //break
                println("IF WITH CONTINUE")
            continue
        }
        println("$i")
    }

    for (i in 10 downTo 1){
        println("i =$i")
    }

    for (i in 1..30 step 5){
        println("i =$i")
    }

    for (i in 31 downTo 1 step 5){
        println("i =$i")
    }

    val students = listOf("Marília","Tamiles","Jeferson")
    for ((indic, student) in students.withIndex()){
        println("$indic - $student")
    }

    //Param named
    println(level(chief = "Marília", employed = "Tamiles"))

}

fun level(employed: String, chief:String):String{
    return "$employed is employed the $chief"
}