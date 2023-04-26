fun main() {
    val answer=addNums(89,100)
    println(answer)
    val ans= addition(arrayOf(78,334,23,174,8,23,45))
    println(ans)
    val longest= longestString(arrayOf("Wambui","Shadrack","love","Elizabeth","boy"))
    println(longest)
    val vow= countVowels("BeautIful")
    println(vow)
    val reverse= reverseStr("Grace")
    println(reverse)
    val palindrome = palindromeString("wow","peep")
    println(palindrome)
    val oddNums= removeEvenNum(listOf(87,66,56,34,23,21,99))
    println(oddNums)
    val second= secondLargestNum(listOf(78,45,34,2245,9))
    println(second)
    val addStr = addStrings(listOf("Grace","Wambui"))
    println(addStr)
    val upper= stringsToUpper(listOf("grace","class","boy","kotlin"))
    println(upper)


      var str1="listen"
      var str2= "silent"
        val anagrams = areAnagrams("listen","silent")
    if (anagrams) {
        println("$str1 and $str2 are anagrams")
    } else {
        println("$str1 and $str2 are not anagrams")
    }


println(sortStr(arrayOf("gal","boy","apple")))

}


//Write a function that takes two integers as parameters and returns their sum.
fun addNums(x:Int,y:Int):Int{
    return x+y
}
//Write a function that takes an array of integers as a parameter and returns the sum of all the elements.
fun addition(num:Array<Int>):Int{
    var sum =0
    for (n in num){
        sum +=n
    }
    return sum
}
//Write a function that takes an array of strings as a parameter and returns the longest string.
fun longestString(a:Array<String>):String?{
    if (a.size <=1){
        return null
    }
    val long= a.maxByOrNull { it.length }
    return long
}

//Write a function that takes an array of strings as a parameter and returns the //length// of the longest string.

fun longString(a:Array<String>):Int{
    var long= 0
    for (a in a){
        if (a.length > long)
            long=a.length
    }
    return long
}
//Write a function that takes a string as a parameter and returns the number of vowels in the string.
fun countVowels(str:String){
    var count=0
    val vowels= arrayOf('a','e','i','o','u','A','E','I','O')
    for (s in str){
        if (s in vowels ){
            count++
        }
    }
}
//Write a function that takes a string as a parameter and returns the string in reverse order.
fun reverseStr(s:String):String{
    val reversal= s.reversed()
    return reversal
}
//Write a function that takes two strings as parameters and returns true
// if they are anagrams (have the same letters in a different order) and false otherwise.
fun palindromeString(x:String,y:String):Boolean{
    val reverseStr= x.reversed()
    val rever = y.reversed()
    return x == reverseStr && y== rever
}

//Write a function that takes a list of integers as a parameter and returns a new list with all the even numbers removed.
fun removeEvenNum(num:List<Int>):List<Int>{
    var odd= listOf<Int>()
    for (n in num){
        if (n%2==1){
            odd+=n
        }
    }
    return odd
}
//Write a function that takes a list of integers as a parameter and returns the second largest element in the list.
fun secondLargestNum(numb:List<Int>):Int?{
    if (numb.size <= 1){
        return null
    }
    val sort= numb.sortedByDescending{n-> n}
    return sort[1]
}

//Write a function that takes a list of strings as a parameter and returns a new list with all the strings in uppercase.
fun stringsToUpper(s:List<String>):List<String>{
    return s.map {  it.uppercase()}
}
//Write a function that takes a list of strings as a parameter and returns the concatenation of all the strings.
fun addStrings(x:List<String>):String{
    var join = x.reduce { x, y->  x+y}
    return join
}

fun areAnagrams(str1: String, str2: String): Boolean {
    // Convert both strings to character arrays
    val charArray1 = str1.toCharArray()
    val charArray2 = str2.toCharArray()

    // Sort both arrays
    charArray1.sort()
    charArray2.sort()

    // Check if the sorted arrays are equal
    return charArray1.contentEquals(charArray2)

}
//sorting strings
fun sortStr(x:Array<String>):List<String>{
    return x.sorted()
}












