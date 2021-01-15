fun main(){

}

fun <E:Comparable<E>>Array<E>.jumpSearch(element: E): Int{
    // array size of n and skip m indexes
    // perform n/m jump and m-1 iterations for linear search
    // performance: f(n) = (n/m)+(m-1) = n+m^2-m
    // the optimal value of m is sqrt(n)
    val size = this.size
    var step = Math.sqrt(size.toDouble()).toInt()
    var prev = 0

    while(this[Math.min(step,size)-1] < element){
        prev=step
        step*=2
        if(prev>=size.toInt())return -1 // element not found
    }
    while(this[prev]<element){// linear search
        prev++
        if(prev == Math.min(step,size)) return -1 // element not found
    }
    if(this[prev]==element){
        return prev
    }
    return -1
}