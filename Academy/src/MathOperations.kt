fun main(){
    println("First Num")
    val num1: Double = readLine()!!.toDouble()
    println("Second Num")
    val num2: Double = readLine()!!.toDouble()

    val sum: Double = num1 + num2
    val sub: Double = num1 - num2
    val div: Double = num1/num2
    val mult: Double = num1 * num2

    println("Sum: $sum\nSub: $sub\nDiv: $div\nMul: $mult")

}

/*
========================================================================================================================
======================================================Results===========================================================
========================================================================================================================

First Num
20
Second Num
6
Sum: 26.0
Sub: 14.0
Div: 3.3333333333333335
Mul: 120.0

First Num
2
Second Num
60
Sum: 62.0
Sub: -58.0
Div: 0.03333333333333333
Mul: 120.0

========================================================================================================================
====================================================Results End=========================================================
========================================================================================================================
 */
