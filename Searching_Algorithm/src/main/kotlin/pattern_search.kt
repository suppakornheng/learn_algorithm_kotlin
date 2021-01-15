fun main(){
}

fun patternSearch(text:String, pattern:String):Int{
    var retVal =-1
    val patternLen = pattern.length
    val len = text.length - patternLen
    for (i in 0 until len){ // 0 until len = 0..len-1
        var isFound = true
        for (j in 0 until patternLen) {
            if (text[i + j] != pattern[j]) {
                isFound = false
                break
            }
        }
        if(isFound){
            retVal = i
            break
        }
    }
    return retVal
}
