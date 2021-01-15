fun main(args:Array<String>){
    val friends = arrayOf("Rivu", "Subin", "Sid", "Susri", "Ramya", "Sachin")



    val days = listOf("Sunday", "Monday", "Tuesday", "Wednesday")//immutable
    val months = arrayListOf("January", "February", "March", "April")//mutable
    val modifiedDays = days + "Thursday"   // immutable can be added by creating a new immutable list
    months.add("May") // while mutable can be added directly

    println(days)
    println(modifiedDays)
    println(months)
}
