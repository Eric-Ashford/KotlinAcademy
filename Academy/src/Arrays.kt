//Arrays are used to house a collection of data

fun main(){
    //By Eric Ashford
    println("===================================Start=====================================\n")
    println("Pets App")


    println("Enter 3 pet names")
    var listOfPets: Array<String> = Array(3){""}
    listOfPets[0] = readLine()!!.toString()
    listOfPets[1] = readLine()!!.toString()
    listOfPets[2] = readLine()!!.toString()
    var a: Int = 0
    for(a in 0..2){
        println("${listOfPets[a]}")
    }


    println("\nEnter 3 pet names")
    var inputListOfPets: Array<String> =Array(3){""}
    var j:Int = 0
    while (j <= 2){
        print("Enter pet name: ")
        inputListOfPets[j] = readLine()!!.toString()
        if (j==2){
            for(i in 0..2){
                println("${inputListOfPets[i]}")
            }
        }
        j++
    }

    println("\nHow many pets do you have?")
    var petNum: Int = readLine()!!.toInt()
    var numOfPets: Array<String> = Array(petNum){""}
    for(i: Int in 0 until petNum){
        print("Enter Pet Name: ")
        numOfPets[i] = readLine()!!.toString()
    }
    println("All of your pets are now in an array")
    for(i in 0 until petNum){
        println(numOfPets[i])
    }


}

/*
========================================================================================================================
======================================================Results===========================================================
========================================================================================================================

Pets App
Enter 3 pet names
Reggs
Koda
Kelly
Reggs
Koda
Kelly

Enter 3 pet names
Enter pet name: Sam
Enter pet name: Leela
Enter pet name: Fry
Sam
Leela
Fry

How many pets do you have?
2
Enter Pet Name: Maelen
Enter Pet Name: Cory
All of your pets are now in an array
Maelen
Cory

========================================================================================================================
====================================================Results End=========================================================
========================================================================================================================
 */
