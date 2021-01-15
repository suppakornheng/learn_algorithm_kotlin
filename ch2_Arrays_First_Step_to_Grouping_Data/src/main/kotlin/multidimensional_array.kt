fun main(){
    val numbers = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9)
    )
    val food = arrayOf(
        arrayOf("Apple", "Apricot", "Avocado"),
        arrayOf("Banana", "Broccoli", "Beetroot"),
        arrayOf("Cherry", "Carrot")
    )
    //println(numbers)//output: [[Ljava.lang.Integer;@24d46ca6
    //println(food)//output; [[Ljava.lang.String;@4517d9a3
    numbers.forEach {
        it.forEach {
            print(it)
        }
        println()
    }// output: 123 \n 456 \n 789 \n
    println()
    food.forEach{
        it.forEach {
            print(it+" ")
        }
        println()
    }
}