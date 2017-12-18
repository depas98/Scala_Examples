package com.depas.examples

object CollectionExample {

  def main(args: Array[String]): Unit = {

    // Map
    val authorsToAge = Map("Raoul" -> 23, "Mario" -> 40, "Alan" -> 53)

    println("############ Map iterating ##################")
    authorsToAge.foreach{ author => println("Author's name is " + author._1 +
      " and is " + author._2 + " years old.")}

    println("############ Map iterating using case ##################")
    authorsToAge.foreach{ case(name, age) => println(s"Author's name is $name " +
      s"and is $age years old.")}

    // List
    val authors = List("Raoul", "Mario", "Alan")

    println("############ List iterating ##################")
    println(authors)
    println("or")
    authors.foreach{a => println(s"Author's name is $a ")}

    val newAuthors = "Amy" :: authors
    val newAuthors2 = newAuthors :+ "Mike"

    println("Add creates a new list")
    println(newAuthors2)
    newAuthors2.foreach{a => println(s"Author's name is $a ")}

    // Integer List
    println("Integer list")
    var x = List(2)
    println(x)
    x = 1 :: x  // add 1 to front of list
    println(x)
    x = x :+ 3  // add 3 to end of list
    println(x)

    println("############ Set ##################")
    val numbers = Set(2,5,3);
    val newNumbers = numbers + 8
    println("numbers: " + numbers)
    println("newNumbers: " + newNumbers)
  }
}
