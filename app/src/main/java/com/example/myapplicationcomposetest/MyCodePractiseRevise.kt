package com.example.myapplicationcomposetest

fun main(){

    val arr1 = intArrayOf(1,2,3,4,5,6)
    val subArr = intArrayOf(2,3,5)
    val output = subsequenceArray(arr1,subArr)

    println("is subciquence is $output ")

}

// input [1,2,3,4,5,6]--->sub[2,3,5]  [4,3,5]
fun subsequenceArray(arr:IntArray,subArr:IntArray):Boolean{
  for(i in arr.indices){
      for(j in 0 until subArr.size-1){
          if(arr[i] != arr[j]){
              return false
          }
      }

  }
    return true
}



