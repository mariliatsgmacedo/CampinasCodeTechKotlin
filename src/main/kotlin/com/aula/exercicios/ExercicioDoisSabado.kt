package com.aula.exercicios

import java.util.*

fun main() {
    println("Enter salary: ")
    val salary = Scanner(System.`in`).nextDouble()

    println("Enter value total sales: ")
    val sales = Scanner(System.`in`).nextDouble()

    calcSalary(sales, salary)
}

private fun calcSalary(sales: Double, salary: Double) {
    if (sales <= 1500) {
        val percentComissionOne = 1500 * 0.03
        val totalSalary = salary + percentComissionOne
        println("Total Salary: %.2f".format(totalSalary))
    }
    if (sales > 1500) {
        val percentComissionTwo = 1500 * 0.05
        val totalSalary = salary + percentComissionTwo
        println("Total Salary: %.2f".format(totalSalary))
    }
}