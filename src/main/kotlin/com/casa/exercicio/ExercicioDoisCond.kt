package com.casa.exercicio

import java.util.*

fun main(){
    println("Enter with hours worked")
    val hourWork:Int = Scanner(System.`in`).nextInt()
    println("Enter with salary hour")
    val salaryHour:Double = Scanner(System.`in`).nextDouble()

    var salaryTotal: Double = calcSalary(salaryHour, hourWork)

    calcSalaryReturn(hourWork, salaryHour, salaryTotal)
}

private fun calcSalaryReturn(hourWork: Int, salaryHour: Double, salaryTotal: Double) {
    var salaryTotal1 = salaryTotal
    if (hourWork > 40) {
        val extra = (salaryHour * (50 / 100))
        salaryTotal1 += extra
        println("Result with 50%: $salaryTotal1")
    } else {
        println("Result without 50%: $salaryTotal1")
    }
}

private fun calcSalary(salaryHour: Double, hourWork: Int): Double {
    return (salaryHour * hourWork * 30)
}