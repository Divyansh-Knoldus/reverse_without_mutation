package com.knoldus
object Reverse_Without_Mutation {
  def reverse_List(inputListToReverse: List[Int]): List[Int] = {    //this method is used to reverse a list of elements without using mutable variable
    if (inputListToReverse == List()) {                            // If the input list is empty, it will return it as it is.
      inputListToReverse
    }
    else {
      reverse_List(inputListToReverse.tail) :+ inputListToReverse.head
    }
  }
  def main(args: Array[String]): Unit = {
    val list_given = List(3, 4, 8, 7, 9, 6, 2, 1, 5)
    val reversedList = reverse_List(list_given)
      println("Reverse of " + list_given  + " is " + reversedList)
  }
}
