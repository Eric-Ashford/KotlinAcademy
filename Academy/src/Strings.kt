//Strings have predefined methods that can be used to manipulate their values

fun main(){
    //By Eric Ashford
    val message = "Welcome to Kotlin"
    val name = "Eric"
    val allMessage = "$message $name!"
    println(allMessage[0])                                      //Prints a character from the allMessage variable
    println(allMessage.toLowerCase())                           //Converts string characters to lowercase
    println(allMessage.toUpperCase())                           //Converts string characters to uppercase
    println(message.trim())                                     //Trim will remove extra spaces.
    println(message)

    val tokens = message.split(" ")                   //Split message variable at each space into a list
    for(token in tokens){
        if(!token.contains("to")){                        //Not printing any element that contains a specific phrase
            println("Token: $token")
        }

    }

}

/*
========================================================================================================================
======================================================Results===========================================================
========================================================================================================================

W
welcome to kotlin eric!
WELCOME TO KOTLIN ERIC!
Welcome to Kotlin
Welcome to Kotlin
Token: Welcome
Token: Kotlin

========================================================================================================================
====================================================Results End=========================================================
========================================================================================================================
 */
