package com.example.myapplicationcomposetest


fun main() {
    /*var value = "Hello deepu"
    println(reverseString(value))*/

    /*val palindrome = "racecar"
    val notPalindrome = "hello"

    println("Is '$palindrome' a palindrome? ${isPalindrome(palindrome)}")
    println("Is '$notPalindrome' a palindrome? ${isPalindrome(notPalindrome)}")*/
    // countVowel("abcdefghijklmnopqrstuvwxyz")

    /*val arr = intArrayOf(1, 2, 3, 4, 5, 6, 3, 7, 8, 3)
    val matchingPairs = matchingElementArray(arr)

    if (matchingPairs.isNotEmpty()) {
        println("Matching elements found:")
        matchingPairs.forEach { (first, second) ->
            println("$first and $second")
        }
    } else {
        println("No matching elements found.")
    }*/
    /* val arr = intArrayOf(64, 34, 25, 12, 22, 11, 90)

     println("Original Array: ${arr.joinToString()}")

     val sortingSteps = bubbleSort(arr)

     sortingSteps.forEachIndexed { index, step ->
         println("Step ${index + 1}: ${step.joinToString()}")
     }*/


    /* val n = 5
     println("Fibonacci series of first $n numbers:")
     for(i in 0 until n){
         print("${fibonacciSeries(i)} ")
     }*/

    /*val number = 17 // Change number to check if it's prime or not

    if (primeNumber(number)) {
        println("$number is a prime number.")
    } else {
        println("$number is not a prime number.")
    }*/
    /*val arr = intArrayOf(1,2,5,6,3,2)
    println("second largest : ${secondLargest(arr,6)}")*/

    /* val data = "hello world!"
     val target = 'l'
     val printData = countOcurrence(data,target)
     println("print data is:--->$printData")*/

    /* val linkedList = LinkedList()
     linkedList.insert(1)
     linkedList.insert(2)
     linkedList.insert(3)
     linkedList.insert(4)

     println("Linked List:")
     linkedList.printList()*/


    /* val str = "hello"
     val result = findFirstNonRepeatedChar(str)
     if (result != null) {
         println("The first non-repeated character is: $result")
     } else {
         println("No non-repeated characters found in the string.")
     }*/

    /*val arr = intArrayOf(1, 2, 4, 3, 6, 7, 5, 3, 4)
    val duplicate = findDuplicateArray(arr)

    if (duplicate.isNotEmpty()) {
        println("Duplicates found: $duplicate")
    } else {
        println("No duplicates found.")
    }*/

    /* val number = 153 // Change this to any number you want to check
     if (isArmstrongNumber(number)) {
         println("$number is an Armstrong number.")
     } else {
         println("$number is not an Armstrong number.")
     }*/

    /*val head = ListNode(1)
    head.next = ListNode(2)
    head.next?.next = ListNode(3)
    head.next?.next?.next = ListNode(4)
    head.next?.next?.next?.next = ListNode(5)

    println("Original linked list:")
    printList(head)

    val reversedHead = reverseLinkedList(head)

    println("Reversed linked list:")
    printList(reversedHead)*/

   /* val arr = intArrayOf(2,5,9,13,17,21,30)
    if(binarySearch(arr,0,arr.size - 1,30))
        println("element found")
    else
        println("not found")*/

  //  printSquarePattern(5)

    /*val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val targetSum = 10

    val pairs = PrintPairs(nums, targetSum)
    if (pairs.isNotEmpty()) {
        println("Pairs with sum $targetSum:")
        pairs.forEach { println("${it.first} + ${it.second} = $targetSum") }
    } else {
        println("No pairs found with sum $targetSum.")
    }*/

    /*val str = "a!!!b.c,def!g@"
    val rever = reverseStringSpecial(str)
    println(rever)*/

    val inputString = "aaaabbbbccdeef"
    val compressedString = compressString(inputString)
    println("Input String: $inputString")
    println("Compressed String: $compressedString")

}


// reverse the String  abcd
fun reverseString(str: String): String {
    var reverse = ""

    for (i in str.length - 1 downTo 0) {
        reverse += str[i]
    }
    return reverse
}

// palindrom abaaba

fun isPalindrome(str: String): Boolean {
    var start = 0
    var end = str.length - 1
    while (start < end) {
        if (str[start] != str[end]) {
            return false
        }
        start++
        end--
    }
    return true
}

// string anagram aaaab, abbbb
fun anagramString(str1: String, str2: String): Boolean {
    if (str1.length != str2.length) {
        return false
    }

    val sortedStr1 = str1.toCharArray().apply { sort() }
    val sortedStr2 = str2.toCharArray().apply { sort() }
    return sortedStr1.contentEquals(sortedStr2)

}

// calculate the number of vowels and consonants in a String
fun countVowel(str: String) {
    var vowel = 0
    var consonants = 0
    for (i in str.indices) {
        val char: Char = str[i]
        if (char == 'a' || char == 'e' || char == 'i' || char == 'o' || char == 'u') {
            vowel++
        } else
            consonants++
    }
    println("vowel is..$vowel")
    println("consonants is..$consonants")

}

// matching elements in an integer array
fun matchingElementArray(arr: IntArray): List<Pair<Int,Int>> {
    val matchingPair = mutableListOf<Pair<Int, Int>>()
    for (i in arr.indices) {
        for (j in 1 until arr.size) {
            if (arr[i] == arr[j]) {
                matchingPair.add(Pair(arr[i], arr[j]))
            }
        }
    }
    return matchingPair
}

// bubble sort

fun bubbleSort(arr: IntArray): List<IntArray> {
    val steps = mutableListOf<IntArray>()
    for (i in arr.indices) {
        var swaped = false
        for (j in 0 until arr.size - i - 1) {
            if (arr[j] > arr[j + 1]) {
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
                swaped = true
            }
            steps.add(arr.copyOf())
        }
        if (!swaped) {
            break
        }
    }

    return steps

}

// reverse array
fun reverseArray(arr: IntArray) {
    var start = 0
    var end = arr.size - 1
    while (start < end) {
        // [8,3,4]
        val temp = arr[start]
        arr[start] = arr[end]
        arr[end] = temp

        start++
        end--

    }
}

// fibonacci series
fun fibonacciSeries(n: Int): Int {
    return if (n == 0 || n == 1)
        n
    else
        fibonacciSeries(n - 1) + fibonacciSeries(n - 2)
}

// factorial
fun factorial(n: Int): Int {
    return if (n == 1)
        n
    else
        n * factorial(n - 1)
}

// prime
fun primeNumber(n: Int): Boolean {
    if (n <= 1) {
        return false
    } else {
        for (i in 2 until n) {
            if (n % i == 0) {
                return false
            }
        }
    }
    return true
}

// sum all the elements in an array
fun sumArray(arr: IntArray) {
    var sum = 0
    for (i in arr) {
        sum += i

    }
    println(sum)
}

// second largest  [8,5,4,7]
fun secondLargest(arr: IntArray, total: Int): Int {
    var temp = 0
    for (i in 0 until total) {
        for (j in i + 1 until total) {
            if (arr[i] > arr[j]) {
                temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
        }


    }
    return arr[total - 3]
}

// calculate the number of numerical digits in a string

fun countNumeric(n: String): Int {
    var count = 0
    for (char in n) {
        if (char.isDigit()) {
            count++
        }
    }
    return count
}

// countOccurrences
fun countOcurrence(input: String, target: Char): Int {
    var count = 0
    for (char in input) {
        if (char == target) {
            count++
        }
    }
    return count
}

class Node(var data: Int) {
    var next: Node? = null
}

class LinkList {
    private var head: Node? = null

    fun insert(value: Int) {
        val newNode = Node(value)
        if (head == null) {
            head = newNode
        } else {
            var current = head
            while (current?.next != null) {
                current = current.next
            }
            current?.next = newNode
        }
    }

    // Print the linked list
    fun printList() {
        var current = head
        while (current != null) {
            print("${current.data} ")
            current = current.next

        }
        println()
    }
}


// findFirstNonRepeatedChar

fun findFirstNonRepeatedChar(str: String): Char? {

    val charFrequency = mutableMapOf<Char, Int>()

    for (char in str) {
        charFrequency[char] = charFrequency.getOrDefault(char, 0) + 1
    }
    for (char in str) {
        if (charFrequency[char] == 1) {
            return char
        }
    }
    return null
}

// duplicate array [1,2,2,4,3,4]

fun findDuplicateArray(arr: IntArray): List<Int> {
    arr.sort()
    val sortedList = mutableListOf<Int>()
    for (i in 0 until arr.size - 1) {
        if (arr[i] == arr[i + 1]) {
            sortedList.add(arr[i])
        }
    }
    return sortedList
}

// remove duplicate from array
fun removeDuplicateFromArray(arr: IntArray): Int {
    if (arr.isEmpty()) return 0

    var uniqueIndex = 0
    for (i in 1 until arr.size) {

        if (arr[i] != arr[i - 1]) {
            arr[uniqueIndex++] = arr[i]

        }
    }
    return uniqueIndex
}

// find pair with sum // { 5, 2, 1, 5, 8, 5, 1, 7, 7, 0 } // target 7{}


fun isArmstrongNumber(number: Int): Boolean {
    var originalNumber = number
    val numDigits = number.toString().length
    var sum = 0

    while (originalNumber > 0) {
        val digit = originalNumber % 10
        sum += Math.pow(digit.toDouble(), numDigits.toDouble()).toInt()
        originalNumber /= 10
    }

    return sum == number
}


// reverse Link list
fun reverseLinkedList(head: ListNode?): ListNode? {
    var prev: ListNode? = null
    var current = head

    while (current != null) {
        val nextTemp = current.next
        current.next = prev
        prev = current
        current = nextTemp
    }

    return prev
}

fun printList(head: ListNode?) {
    var temp = head
    while (temp != null) {
        print("${temp.value} ")
        temp = temp.next
    }
    println()
}

// find max element from array
fun findMaxElement(arr: IntArray): Int? {
    if (arr.isEmpty()) return null
    var max_element = arr[0]
    for (i in 1 until arr.size) {
        if (arr[i] > max_element) {
            max_element = arr[i]
        }
    }
    return max_element
}

// val array = intArrayOf(10,20,30,40,50
// )

// binary search via recurrsion

fun binarySearch(arr: IntArray, l: Int, r: Int, x: Int): Boolean {
    if (r >= l) {
        val mid = l + (r - l) / 2

        // If the element is present at the middle itself
        if (arr[mid] == x)
            return true

        // If element is smaller than mid, then it can only be present in left subarray
        if (arr[mid] > x)
            return binarySearch(arr, l, mid - 1, x)

        // Else the element can only be present in right subarray
        return binarySearch(arr, mid + 1, r, x)
    }

    // We reach here when the element is not present in array
    return false
}

// print square pattern

fun printSquarePattern(size:Int){
    for (i in size downTo 1) {
        for (j in 1..i) {
            print("* ")
        }
        println()
    }
}

// All pair in array

fun PrintPairs(input:IntArray,sum:Int):List<Pair<Int,Int>>{
    val list = mutableListOf<Pair<Int,Int>>()
    for(i in input.indices){
        for(j in i+1 until input.size ){
            if(input[i] + input[j] == sum){
                list.add((Pair(input[i],input[j])))
            }
        }
    }
   return list
}


// count occurrence
/*var str: String? = "GeeksforGeeks A computer science portal portal for geeks "
var word = "portal"*/
fun countOccurrences(str:String,word:String):Int{
    var split = str.split(" ")
    var count = 0
    for(i in split.indices){
        if(word == split[i]){
            count++
        }
    }
    return count
}



//  reverse string without special charector
// deep@uverma!   o/p amervu@peed
fun reverseStringSpecial(str:String):String{
    val charArray = str.toCharArray()
    var right = charArray.size-1
    var left = 0

    while (left < right){
        if(!charArray[left].isLetter()){
            left++
        }else if (!charArray[right].isLetter()){
            right--
        }else{
            val temp = charArray[left]
            charArray[left] = charArray[right]
            charArray[right] = temp
            left++
            right--
        }
    }
    return String(charArray)
}

fun compressString(input: String): String {
    if (input.isEmpty()) return ""

    val result = StringBuilder()
    var count = 1

    for (i in 1 until input.length) {
        if (input[i] == input[i - 1]) {
            count++
        } else {
            result.append(input[i - 1])
            result.append(count)
            count = 1
        }
    }

    // Append the last character and its count
    result.append(input[input.length - 1])
    result.append(count)

    return result.toString()
}



