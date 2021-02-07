package com.basico.exemplos

fun main(){
    val a: String = "1"
    val b: String = "2"

    val c: Int = a.toInt() + b.toInt()

    println(c)

    val value = "abc"
    if(value is String){
        println(value)
    }else{
        println("Não é uma String")
    }

    //smart cast
    canShowStringOrPlus(true)
}

fun canShowStringOrPlus(x:Any){
    when(x){
        is String -> println(x.toUpperCase())
        is Int -> println(x.plus(3))
        else -> println("This is not any options")
    }
}