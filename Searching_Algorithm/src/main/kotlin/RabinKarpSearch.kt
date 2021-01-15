fun main(){

}
private fun hash(input:String): Long{
    var result = 0L
    input.forEachIndexed { index, c ->
        result+= (c.toDouble()*Math.pow(97.0,index.toDouble())).toLong()
        // use 97 because 97 is a prime number! so the hash is kinda unique!
    }
    return result
}
private fun rolledHash(oldChar:Char, newChar:Char,oldHash:Long,patternLen:Int):Long{
    return (((oldHash-oldChar.toLong())/97) + newChar.toDouble()*Math.pow(97.0,(patternLen-1).toDouble())).toLong()
}

// Big O notation: O(m+n) in the best case, to O(m*n) in the worst case.
fun RabinKarpSearch(text:String, pattern:String):Int{
    val patternLen = pattern.length
    val textLen = text.length-patternLen
    val patternHash = hash(pattern)
    var subText = text.substring(0,patternLen)
    var subTextHash = hash(subText)
    var isFound = false
    if((patternHash == subTextHash) and subText.equals(pattern))
        return 0 // found at 0th postion
    for(i in 1..textLen){
        subTextHash = rolledHash(text[i-1],text[i+patternLen-1],subTextHash,patternLen)
        if((patternHash == subTextHash) and text.substring(i,i+patternLen).equals(pattern)) return i
    }
    return -1
}
