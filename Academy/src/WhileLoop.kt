//Loops are used to repeat actions without needed to constantly rewrite the function

fun main(){
    //By Eric Ashford
    println("Program Start\n")

    println("For Loop")
    for(i: Int in 1..10 step 1){
        println("Number $i")
    }

    println("\nWhile Loop")
    var num:Int = 1
    while(num <= 10){
        println("Number $num")
        num++
    }

    println("\nDo While Loop")
    num = 1
    do{
        println("Number $num")
        num++
    }while(num <= 10)

    println("\nProgram End")

}

/*
========================================================================================================================
======================================================Results===========================================================
========================================================================================================================

For Loop
Number 1
Number 2
Number 3
Number 4
Number 5
Number 6
Number 7
Number 8
Number 9
Number 10

While Loop
Number 1
Number 2
Number 3
Number 4
Number 5
Number 6
Number 7
Number 8
Number 9
Number 10

Do While Loop
Number 1
Number 2
Number 3
Number 4
Number 5
Number 6
Number 7
Number 8
Number 9
Number 10

========================================================================================================================
====================================================Results End=========================================================
========================================================================================================================
 */
