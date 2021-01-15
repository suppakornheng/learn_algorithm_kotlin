fun main(args: Array<String>) {
    ch1p1()
    ch1p2()
    find(input = intArrayOf(10,20,30,40,50), item =50)
}
private fun find(input: IntArray, item:Int){
    input.forEach {
        if(it == item) {
            print("Item found at Index - ${input.indexOf(it)}")
            return
        }}
    print("not found")

//    for(i in input.indices){
//        if(input[i]==item){
//            print("Item found at index - $i")
//        }
//    }
}

fun ch1p2() {
    //count num
    val x=10
    val y=x*2
    var s:String =""
    for (i in -5..(y-10)){
        s+= if(i%2==0) "$i is Even\n" else "$i is Odd\n"
    }
    print(s)
}

fun ch1p1 (){
    val names = UpperCasedList()
    names.add("Chandra")
    names.add("Rivu")
    println("Names in upper case : $names")
}