package exercicio

fun main(){
    val(v1,v2,v3,v4,v5) = listOf(2,3,5,8,10)
    val(v6,v7,v8,v9) = listOf(20,25,30,50)

    var resultado = (v1*v4 + v6 - v1) - ((v8-v7)+v6)
    var resultadoDois = (v2 * (v2*v2*v2)) / (v9 -(v5/v1*v4))
    var result = (((v1*v4)/v2) + (v2*v4)/(v3 % v2))

    println("O resultado da primeira expressão é: $resultado")
    println("O resultado da segunda expressão é: $resultadoDois")
    println("O resultado da terceira expressão é: $result")

}


