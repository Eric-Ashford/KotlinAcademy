//Break is used to end a conditional statement
//Continue is used to continue a conditional statement when a condition is met
//Break @ is used to break at a specific statement when a condition is met

fun main(){
    //By Eric Ashford
    println("====================================Start Program==================================")

    println("\nContinue")
    for(i:Int in 1..10 step 1){
        if(i == 5){
            continue;
        }
        println(i)
    }

    println("\nBreak")
    for(i:Int in 1..10 step 1){
        if(i == 5){
            break;
        }
        println(i)
    }

    println("\nBreak @")
    loop@ for(i: Int in 1..10){
        println("Outerloop: $i")
        for(i:Int in 1..5){
            println("Innerloop: $i")
            if(i == 4){
                break@loop
            }
        }
    }
    println("====================================End Program==================================")
}

/*
========================================================================================================================
======================================================Results===========================================================
========================================================================================================================

Continue
1
2
3
4
6
7
8
9
10

Break
1
2
3
4

Break @
Outerloop: 1
Innerloop: 1
Innerloop: 2
Innerloop: 3
Innerloop: 4

========================================================================================================================
====================================================Results End=========================================================
========================================================================================================================
 */
