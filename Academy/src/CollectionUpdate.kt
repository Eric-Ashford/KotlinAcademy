fun main(){
    //Mutable means you can update or add more
    //Immutable means you cannot update or add more
println("====================================Start Program==================================")

    //Immutable
    var listImmutable = listOf<String>("Koda","Reggs")
    //list.add("Kota")
    for(name in listImmutable){
        println(name)
    }

    //Mutable
    var listMutable = mutableListOf<String>("Koda", "Reggs")
    listMutable.add("Kota")
    for(name in listMutable){
        println(name)
    }

    //Hashmaps Mutable and Immutables
    var listOfUsersI = mapOf(1 to "Koda", 2 to "Reggs")

    var listOfUsersM = mapOf(1 to "Koda", 2 to "Reggs")

println("====================================End Program====================================")
}