object WedHandlingMultipleOptions extends App {

  val weather: String = "sunny"

  //IF/ELSE

  if (weather == "rainy") {
    println("Take a coat with a hood")
  } else if (weather == "sunny") {
    println("Wear sun cream")
  } else if (weather == "cold") {
    println("Wear a warm coat")
  } else { //catch for anything not defined in the else/if
    println("Not a valid weather option")
  }

  //PATTERN MATCH
  weather match {
    case "rainy" => println("Take a coat with a hood")
    case "sunny" => println("Wear sun cream")
    case "cold" => println("Wear a warm coat")
    case _ => println("Not a valid weather option")
  }

  val season: String = "summer"
  //How we approach this when we have multiple options:
  if (weather == "warm" || season == "summer") {
    println("wear sunscreen")
  } else {
    println("No sunscreen is fine")
  }
  //Multiple conditions in pattern matching - can get confusing
  (weather, season) match {
    case (weather, season) if weather == "cold" || season == "winter"
    => println("Take a coat")
    case _ => println("A light jacket is fine")
  }

  //INT - have to be slightly more careful
  val age: Int = -60
  if (age < 0) {
    println("Enter a positive number")
  } else if (age >= 18) {
    println(s"You are an adult because you are $age")
  } else {
    println(s"You are a child because you are $age")
  }
//  //Case match
//  age match {
//    case age if age <0 => println("Enter a postiive number")
//    case age if age
//  }

  //Task 1

  val percentage = 80

  if (percentage <0 || percentage > 100 ) {
    println(s"Invalid percentage: $percentage")
  } else if (percentage >= 90){
    println("Grade A")
  } else if (percentage >= 80) {
    println("Grade: B")
  } else if (percentage >= 70) {
    println("Grade: C")
  } else if (percentage >= 60) {
    println("Grade: D")
  } else if (percentage >= 50) {
    println("Grade: E")
  } else {
    println("Grade: F")
  }

  //OPTIONS(getOrElse)
  val name: Option[String] = Some("April")
  val emptyName: Option[String] = None
  println(name)
  println(emptyName)

  //getOrElse is used when we want to return a default value if teh none is returned.
  //It will also take the Some away, leaving us with just the internals.
  def getName(name: Option[String]):String = name.getOrElse("This user has left the field empty")
  println(getName(name)) //Some("April")
  println(emptyName) //None

  //TRY/CATCH

  try {
    //ALL LOGIC - if/else, pattern match, def, val
    val number = "abc".toInt //I want to change the input to a Int from a String
    println(s"The number is $number")
  } catch {
    case error: NumberFormatException => print(s"$error was not a valid input") //often see error as 'e'

  }





}
