fun main(){
    println("Enter a number to find out if its even or odd.")

    val num: Int = readLine()!!.toInt()
    val result = num % 2

    if(result == 0){
        println("$num is even.")
    } else{
        println("$num is odd.")
    }

}

/*
========================================================================================================================
======================================================Results===========================================================
========================================================================================================================

9
9 is odd.

50
50 is even.

========================================================================================================================
====================================================Results End=========================================================
========================================================================================================================
 */
