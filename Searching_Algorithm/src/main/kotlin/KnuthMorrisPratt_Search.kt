fun main(){
}
fun preparePrefixArray(pattern: String): IntArray {
    val patternLen = pattern.length
    val arr = IntArray(patternLen)
    var index = 0
    var i = 1
    while(i < patternLen) {
        if (pattern[i] == pattern[index]) {
            arr[i] = index + 1
            index++
            i++
        } else {
            if (index != 0) index = arr[index - 1]
            else {
                arr[i] = 0
                i++
            }
        }
    }
    return arr
}
//the most efficient algorithm!
fun aKMPSearch(text: String, pattern: String): Int {
    val prefixArr = preparePrefixArray(pattern)
    val textLen = text.length
    val patternLen = pattern.length

    var patternIndex = 0
    var textIndex = 0
    while ((textIndex < textLen) and (patternIndex < patternLen)) {
        if (pattern[patternIndex] == text[textIndex]) {
            textIndex++
            patternIndex++
        } else {
            // Use the prefix array to skip few indexes
            if (patternIndex != 0) patternIndex = prefixArr[patternIndex - 1]
            else textIndex++
        }
        if (patternIndex == patternLen) {
            // We found the pattern
            return textIndex - patternIndex
        }
    }
    return -1
}