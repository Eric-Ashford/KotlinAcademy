//Creating a function with arguments to initiate an action outside from outside of the main.
fun main(){
    //By Eric Ashford
println("======================================Program Start=====================================")

    addNumbers(6.0,9.0)
    println(addNumbersAlt(6.0,9.0))
    subtractNumbers(3,20)
    displayInfo(names = *arrayOf("Koda", "Bears", "Reggs", "Cocoa"))


println("======================================Program End========================================")
}

fun addNumbers(x:Double = 1.0,y:Double = 1.0){
    val temp = x + y
    println("Add: $temp")
}

fun addNumbersAlt(x:Double = 1.0,y:Double = 1.0): Double {
    return x+y
}

fun subtractNumbers(x:Int, y:Int){
    val temp = y - x
    println("Subtract: $temp")
}

fun displayInfo(vararg names:String){
    for(name in names){
        println(name)
    }
}

/*
========================================================================================================================
======================================================Results===========================================================
========================================================================================================================

Add: 15.0
15.0
Subtract: 17
Koda
Bears
Reggs
Cocoa

========================================================================================================================
====================================================Results End=========================================================
========================================================================================================================
 */

