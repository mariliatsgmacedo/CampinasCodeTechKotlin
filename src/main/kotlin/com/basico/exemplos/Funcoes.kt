package com.basico.exemplos

fun main(){

    //Listas Imutaveis
    val compras = listOf("Arroz","Feijao","Carne")
    println(compras[0])
    //Listas Mutáveis
    val nomes: MutableList<String> = mutableListOf("Marília","Macedo","Portugal")
    nomes[0] = "Teste"
    println(nomes[0])

    //Add itens a lista
    nomes.add("Guerra")

    //Chamada de Funções
    val a: Int = 5
    val b: Int = 3

    val c: Double = 3.0
    val d: Double = 5.0

    soma(a,b)
    println(multiplica(c,d))
}

//fun mostraLista(compras:MutableList<String>): String{ return "a"}

//Declaração de uma função sem retorno
fun soma(a:Int, b:Int){
    println("A soma de A e B é:" + (a+b))
}
//Mesmo resultado de cima
fun somaD(a:Int, b:Int) = println("A soma de A e B é:" + (a+b))


//Declaração de uma função com retorno
fun multiplica(a: Double, b:Double):Double{
    return a * b
}
//Mesmo resultado de cima
fun multi(a: Double, b:Double) = a * b
