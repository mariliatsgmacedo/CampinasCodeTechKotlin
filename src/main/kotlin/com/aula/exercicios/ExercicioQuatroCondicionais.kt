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

/**
 * import java.util.*
// se eh maior de 18, se sim, pode dirigir se nao nao pode
//verificar se eh habilitado, se houver mensagem = em liberacao, se for null habi nao autorizada

fun main(){
val mensagem: String? = null

println("Digite sua idade: ")
val idade: Int = Scanner(System.`in`).nextInt()

println(validacaoCarteira(idade, mensagem))
}
fun validacaoCarteira(idade:Int, mensagem: String? = "em Liberacao"): String{

val resultado = if (idade >= 18){
"Pode dirigir"

}else{
"Nao pode dirigir"
}

val liberacao = mensagem ?: "Não Habilitado"

return "$resultado $liberacao"

}
 */