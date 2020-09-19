import java.lang.Exception

/*
Multithreading is being able to run multiple task at the same time.

Synchronous is waiting for a task to finish before moving onto the next task
Asynchronous is being able to move onto a new task before the first one finishes. (Saves time)
 */

fun main(args:Array<String>){
    //By Eric Ashford
    println("======================================Program Start=====================================")

    var t1 = thread("Thread 1")
    t1.start()

    var t2 = thread("Thread 2")
    t2.start()

    var t3 = thread("Thread 3")
    t3.start()


    println("======================================Program End========================================")
}

class thread:Thread{

    var threadName:String?= null

    constructor(threadName: String):super(){
        this.threadName=threadName
        println("${this.threadName} has started")
    }

    override fun run(){
        //Write thread

        var count = 0
        while (count<10){
            println("$threadName Number $count")
            count++

            try{
                Thread.sleep(1000)
            } catch(ex:Exception){
                println(ex.message)
            }

        }
    }
}



/*
========================================================================================================================
======================================================Results===========================================================
========================================================================================================================

Thread 1 has started
Thread 2 has started
Thread 3 has started

Thread 2 Number 0
Thread 1 Number 0
Thread 3 Number 0
Thread 2 Number 1
Thread 3 Number 1
Thread 1 Number 1
Thread 2 Number 2
Thread 3 Number 2
Thread 1 Number 2
Thread 2 Number 3
Thread 3 Number 3
Thread 1 Number 3
Thread 2 Number 4
Thread 1 Number 4
Thread 3 Number 4
Thread 2 Number 5
Thread 3 Number 5
Thread 1 Number 5
Thread 2 Number 6
Thread 3 Number 6
Thread 1 Number 6
Thread 2 Number 7
Thread 3 Number 7
Thread 1 Number 7
Thread 2 Number 8
Thread 3 Number 8
Thread 1 Number 8
Thread 2 Number 9
Thread 3 Number 9
Thread 1 Number 9

========================================================================================================================
====================================================Results End=========================================================
========================================================================================================================

 */