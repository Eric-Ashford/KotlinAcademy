//ArrayList is useful if you have a ton of elements to record

fun main(){
    //By Eric Ashford
    println("====================================Start Program==================================")
    println("Pets App")
    var listOfPets = ArrayList<String>()

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
    println("====================================End Program==================================")
}

/*
========================================================================================================================
======================================================Results===========================================================
========================================================================================================================

Pets App
Enter Pet name or type quit to exit: Koda
Enter Pet name or type quit to exit: Sammy
Enter Pet name or type quit to exit: Jelly
Enter Pet name or type quit to exit: quit

Your pets are using Index
Pet 0: Koda
Pet 1: Sammy
Pet 2: Jelly

Your pets are using Object
Pet: Koda
Pet: Sammy
Pet: Jelly

========================================================================================================================
====================================================Results End=========================================================
========================================================================================================================
 */