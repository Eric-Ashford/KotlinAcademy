//Val cannot be change once declared and initialized
//Var can be changed once declared and initialized

fun main(){
    //By Eric Ashford
    var str: String = "Welcome to kotlin"

    println(str)

    println("What is your name?")
    val name: String = readLine()!!.toString()                      //!! Means to check for null

    println("How old are you?")
    val age: Int = readLine()!!.toInt()



    if (age > 18){
        str = "Welcome to Kotlin College"
    }

    println("$str $name!")

    /* Variable name cannot be reassigned
    name = "User"
    */

}

/*
========================================================================================================================
======================================================Results===========================================================
========================================================================================================================

Welcome to kotlin
What is your name?
Eric
How old are you?
26
Welcome to Kotlin College Eric!

========================================================================================================================
====================================================Results End=========================================================
========================================================================================================================
 */
