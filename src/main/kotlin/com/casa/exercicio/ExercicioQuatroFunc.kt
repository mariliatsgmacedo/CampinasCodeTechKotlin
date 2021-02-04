package com.casa.exercicio

import java.util.*

fun main(){
    val listProduct = mutableListOf<Any>()

    enterInfo(listProduct)

    listProduct.add(valueTotal(listProduct[2] as Double, listProduct[1] as Int))

    showInfo(listProduct)

}

fun enterInfo(listProduct: MutableList<Any>) {
    println("Informe o nome do produto:")
    listProduct.add(Scanner(System.`in`).nextLine())
    println("Informe a quantidade do produto:")
    listProduct.add(Scanner(System.`in`).nextInt())
    println("Informe o valor do Produto:")
    listProduct.add(Scanner(System.`in`).nextDouble())
}

fun showInfo(listProduct: MutableList<Any>) {
    println("Nome: ${listProduct[0]}")
    println("Quantidade: ${listProduct[1]}")
    println("Valor do Produto: ${listProduct[2]}")
    println("Valor total: ${listProduct[3]}")
}

fun valueTotal(a:Double,b:Int):Double{
    return a * b
}

