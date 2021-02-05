package com.aula.exercicios

import java.util.*
/**
 * Its not complete
 */
fun main(){
    println("How old are you?")
    println(isEnabled(Scanner(System.`in`).nextInt()))
    println("Do you have a car license?")

    val message = Scanner(System.`in`).nextLine()

    println(checkHasCarLicense(Scanner(System.`in`).nextLine()))

}

fun isEnabled(age:Int):String{
    return   if (age >= 18) "You can Drive" else "You can't Drive"
}

fun checkHasCarLicense(message:String = "in Release"): String {
    return when(message){
        "Null" ->{
            "Unauthorized"
        }
        "" ->{
            "in Release"
        }
        else -> {
            message
        }
    }
}