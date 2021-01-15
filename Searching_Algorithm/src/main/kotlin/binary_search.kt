fun main(){

}

fun <E:Comparable<E>> List<E>.binarySearch(element: E): Int{
    var left =0
    var right =size-1
    while(left<=right){
        var mid = (left+right)/2
        var midVal = this[mid]
        val compare = midVal.compareTo(element)
        //print(5.compareTo(8))// return -3
        //print(9.compareTo(7))// return 2
        if(compare<0) left = mid+1  // element>midVal
        else if (compare>0) right = mid-1 // element<midVal
        else return mid//element found
    }
    return -1
}

