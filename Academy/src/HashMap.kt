//For a Hashmap, every element has a Key and a Value
//Keys should be unique, Meaning 2 elements shouldn't have the same Key, if it happens it will override the previous

fun main(){
    //By Eric Ashford
println("====================================Start Program==================================")
    var listOfUsers = HashMap<Int, String>()
    listOfUsers[123] = "Eric"
    listOfUsers[456] = "Judy"
    listOfUsers[321] = "Koda"


    println("Printing value for Key 123: ${listOfUsers[123]}")
    println("\nPrinting every Key in our hashmap: ")
    for(key in listOfUsers.keys){
        println("$key: ${listOfUsers[key]}")
    }

println("====================================End Program====================================")
}

/*
========================================================================================================================
======================================================Results===========================================================
========================================================================================================================

Printing value for Key 123: Eric

Printing every Key in our hashmap:
321: Koda
456: Judy
123: Eric

========================================================================================================================
====================================================Results End=========================================================
========================================================================================================================
 */
