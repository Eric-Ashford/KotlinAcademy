import java.io.FileReader
import java.io.FileWriter
import java.lang.Exception

fun main(args:Array<String>){
    //By Eric Ashford
    println("======================================Program Start=====================================")

    println("1: Read File\n2: Writing to File\n")
    var option = readLine()!!.toInt()

    when(option){
        1-> {
            readFromFile()
        }
        2->{
            println("Please write to the file:")
            var str = readLine().toString()
            writerToFile(str)
        }

    }


    println("======================================Program End========================================")
}

fun writerToFile(str:String){
    try {
        var fo = FileWriter("test.txt",true)
        fo.write(str + "\n")
        fo.close()
        println("Saved!")
    } catch(ex:Exception){
        println(ex.message)
    }
}

fun readFromFile(){
    try{
        var fileToRead = FileReader("test.txt")
        var c:Int?
        do{
           c = fileToRead.read()
            print(c.toChar())
        } while(c!=-1)

    } catch(ex:Exception){
        println(ex)
    }
}


/*
========================================================================================================================
======================================================Results===========================================================
========================================================================================================================

1: Read File
2: Writing to File

1
Google
Hello World

2
Please write to the file:
Koda
Saved!


========================================================================================================================
====================================================Results End=========================================================
========================================================================================================================

 */