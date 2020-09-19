import java.util.*

//LinkedList will create nodes for the amount of size used
//Should not be used for query speed as it will take n time for search

fun main(){
    //By Eric Ashford
println("====================================Start Program==================================")
    println("Pets App")
    var listOfPets = LinkedList<String>()

    do{
        print("Enter Pet name or type quit to exit: ")
        val petName = readLine()!!.toString()
        if(petName != "quit"){
            listOfPets.add(petName)
        }
    }while(petName != "quit")

    println("\nYour pets are using Index")
    for(i in 0 until listOfPets.size){
        println("Pet $i: ${listOfPets[i]}")
    }

    println("\nYour pets are using Object")
    for(pet in listOfPets){
        println("Pet: $pet")
    }

println("====================================End Program====================================")

}

/*
========================================================================================================================
======================================================Results===========================================================
========================================================================================================================

Pets App
Enter Pet name or type quit to exit: Gary
Enter Pet name or type quit to exit: Smooshie
Enter Pet name or type quit to exit: Kali
Enter Pet name or type quit to exit: quit

Your pets are using Index
Pet 0: Gary
Pet 1: Smooshie
Pet 2: Kali

Your pets are using Object
Pet: Gary
Pet: Smooshie
Pet: Kali

========================================================================================================================
====================================================Results End=========================================================
========================================================================================================================
 */
