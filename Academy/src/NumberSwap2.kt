//Swap numbers without using a temporary value

fun main(){
    //By Eric Ashford
    var X: Int = 10
    var Y: Int = 20

    println("X: $X, Y: $Y")

    X = X + Y
    Y = X - Y
    X = X - Y


    println("X: $X, Y: $Y")
}

/*
========================================================================================================================
======================================================Results===========================================================
========================================================================================================================

X: 10, Y: 20
X: 20, Y: 10

========================================================================================================================
====================================================Results End=========================================================
========================================================================================================================
 */