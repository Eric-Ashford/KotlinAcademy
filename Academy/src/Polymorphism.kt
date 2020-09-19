fun main(){
    //By Eric Ashford
    //Polymorphism is when you have identical functions but with different data types
    //2 variables cannot have the same name and the same amt of data values of the same type
    println("======================================Program Start=====================================")

    //The function will always check the data type in the argument for clarification on what function to use.
    showInfo("Koda")
    showInfo(1111111)

    println("======================================Program End========================================")
}

fun showInfo(name:String){
    println("Name: $name")
}

fun showInfo(cardID:Int){
    println("cardID: $cardID")

}

/*
========================================================================================================================
======================================================Results===========================================================
========================================================================================================================

Name: Koda
cardID: 1111111

========================================================================================================================
====================================================Results End=========================================================
========================================================================================================================
 */
