package com.casa.exercicio

import java.util.*

fun main(){
    val priceG:Double = 4.60
    val priceA:Double = 3.20

    formHeadTitle()
    println("Enter with liter Sell:")
    val literSell: Double = Scanner(System.`in`).nextDouble()
    println("Enter G for Gasoline or A for Alcohol")
    val typeFuel: String = Scanner(System.`in`).nextLine().toUpperCase()

    if(literSell > 0.0 ){
        formFooterError()
    } else{
        if (typeFuel == "G"){
            if(literSell <= 20){
                formHeadCoupon()
                returnClient(calcDis(priceG,0.04),totalPayment(priceG,literSell,calcDis(priceG,0.04)),typeFuel)
            } else{
                formHeadCoupon()
                returnClient( calcDis(priceG,0.06),totalPayment(priceG,literSell,calcDis(priceG,0.06)),typeFuel)
            }

        } else if (typeFuel == "A"){
            if(literSell <= 20){
                formHeadCoupon()
                returnClient(calcDis(priceA,0.03),totalPayment(priceA,literSell,calcDis(priceA,0.03)),typeFuel)
            } else{
                calcDis(priceA,0.05)
                formHeadCoupon()
                returnClient(calcDis(priceA,0.05),totalPayment(priceA,literSell,calcDis(priceA,0.05)),typeFuel)
            }

        } else{
            formFooterError()
        }
    }
}
fun formHeadTitle(){
    println("========================================================")
    println("=================== GAS STATION ========================")
    println("========================================================")
}
fun formHeadCoupon(){
    println("=================================================")
    println(" ============ Tax Coupon - Client ============== ")
    println("=================================================")
}

fun formFooterError(){
    println(" ============= === =============== ")
    println(" ======= Invalid Value! ========== ")
    println(" ============= End =============== ")
}

fun calcDis(price:Double,percent:Double):Double{
    return (price * percent)
}

fun totalPayment(price:Double,liter:Double, discount:Double):Double{
    return (price * liter) - discount
}

fun returnClient(calD:Double, totalP:Double, typF:String){
    println("Discount per liter R$ %.2f ".format(calD))
    println("To pay: R$ %.2f".format(totalP))
    println("Type fuel choice: $typF")
    println("====================== End ======================")
}