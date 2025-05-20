object IntroScalaAfternoonTask extends App {

  //1
  //true/false - store values in a function that can be printed and use operators

  // a) Three plus four, times fifty-seven is less than three-hundred
  def a(): Boolean = {
    val result = 3 + 4 * 57
    result < 300
  }
  println(a())

  // b) 144 divided by 12 is greater than or equal to 12
  def b(): Boolean = {
    val result = 144 / 12
    result >= 12
  }
  println(b())

  // c) Is "Cat" less than "Dog"? (alphabetical comparison)
  def c(): Boolean = {
    "Cat" < "Dog"              // true, because C comes before D
  }
  println(c())
  // d) Is "Rabbit" less than "Hamster"? (alphabetical comparison)
  def d(): Boolean = {
    "Rabbit" < "Hamster"       // false, because R comes after H
  }
    println(d())
  // e) Is 17 odd? (use modulus)
  def e(): Boolean = {
    val remainder = 17 % 2
    remainder != 0
  }
  println(e())
  // f) 75 / 9 < 30 AND 89 / 6 < 20
  def f(): Boolean = {
    val f1 = 75 / 9
    val f2 = 89 / 6
    (f1 < 30) && (f2 < 20)
  }
  println(f())


//3- Method to calculate square of an Int

def square(a: Int): Int = {
  a * a
}

  println(square(3))

//4- Write a method to check if a number is odd.

  def checkOdd(b: Int): Boolean = {
  b % 2 != 0
  }

  println(checkOdd(5))

//5. Library with class Book

  class Book(
              val title: String,
              val author: String,
              val genre: String,
              val year: Int,
              val available: Boolean
            ) {
    def isAvailable(): Boolean = available
  }

  val book = new Book("The Alchemist", "Paulo Coelho", "Fantasy Fiction", 1988, true)
  println(book.isAvailable()) // Output: true


  //Extension
  //1. Convert a lowercase `String` to uppercase.

  def uppercaseConversion(text:String): String = {
    text.toUpperCase()
  }
  println(uppercaseConversion("hi how are you"))

//2. Convert the first letter of a `String` to uppercase.

  def capitaliseFirstLetter(text: String): String = {
    if (text.isEmpty) ""
    else text.charAt(0).toUpper + text.substring(1)
  }

  println(capitaliseFirstLetter("ajan"))
  println(capitaliseFirstLetter(""))

//4. Can you simply convert the `String` “one” to the `Int` 1?





















}