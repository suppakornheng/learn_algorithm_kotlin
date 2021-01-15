import kotlin.Comparable as Comparable1

fun main(){
    val languages = arrayListOf("Python", "Java", "Kotlin", "Scala")
    println("Kotlin is at : ${languages.linearSearch("Kotlin")}")
}

fun <E>Collection<E>.linearSearch(element: E): Int{
    for ((index,value)  in this.withIndex()){
        if (value == element) return index
    }
    return -1
}

fun <E: Comparable<E>> Collection<E>.searchInSortedCollection(element:E) : Int{
    for((index,value) in this.withIndex()){
        if(value == element) return index
        else if (value > element) return  -1
    }
    return  -1
}