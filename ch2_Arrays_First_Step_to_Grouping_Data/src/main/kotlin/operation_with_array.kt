import kotlin.collections.indexOf as indexOf1

fun main(){
    val friends = arrayOf("Rivu", "Subin", "Sid", "Susri", "Ramya", "Sachin")
    val info = arrayOf("Rivu", 32, 5.11, "rivu@abc.com")
    //val info: Array<String> = arrayOf("Rivu", 32, 5.11, "rivu@abc.com")
    val numbers = arrayOf(1, 3, 5, 7, 9)
    val oddNums = intArrayOf(1, 3, 5, 7, 9)
    val users = arrayOf(
        User("Chandra Sekhar", "Nayak", "0909090909", "chansek@live.com"),
        User("Utkarsh", "Asthana", "1234123412", "utku@xyz.com"),
        User("Sachin", "Kamble", "7878787878", "sachin@abc.com"),
        User("Ramya", "K", "0000000000", "ramu@zzz.com"),
        User("Subin", "S", "1234512345", "sub@s.com")
    )
    val serverUsers: Array<User?> = arrayOf(null, null, null, null, null)
    val squares = Array(51, {i -> i * i})
    //print(squares)
    squares.forEach {
        print("$it " +  if((squares.indexOf1(it))%5==0){ "\n" }  else "")
    }

    val languages = arrayOf("Kotlin", "Java", "C", "C++", "C#", "JavaScript")
    val firstLanguage = languages[0]
    val fifthLanguage = languages[4]
    val invalidLanguage = languages[-1]
    val outLanguage = languages[100]
    val secondLanguage = languages.get(1)
    val sixthLanguage = languages.get(5)
    val firstLang = languages.component1()
    val secLang = languages.component2()
}
