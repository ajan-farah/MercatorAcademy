object CollectionsAfternoonTask extends App {

  //MVP
  //1. A Seq with names
  val taxpayerForenames = Seq("Alina","Tiffany","Ben","Jerry","Ben", "Alina")
  println("Taxpayer Forenames: " + taxpayerForenames)
  //2. Using string interpolation, print list of names
  println(s"Taxpayer Forenames: $taxpayerForenames")

  //3. Method that uses '.count' to identify the number of tax returns of a taxpayer
  def countSubmissions(name: String, submissions: Seq[String]): Int = {
    submissions.count(_ == name)
  }

  val count = countSubmissions("Alina", taxpayerForenames)
  //4.Print a sentence to state the number of times
  println(s"Alina submitted $count times.")

  //5. Write built in method to convert seq to set (.toSet)
  val uniqueTaxpayers = taxpayerForenames.toSet
  //6. Usig string interpolation, print list of unique taxpayers
  println(s"Unique Taxpayer names: $uniqueTaxpayers")

  //7. Refactor method(Q3) to work for any inputted collection (Iterable)

  def countSubmissions(name: String, submissions: Iterable[String]): Int = {
    submissions.count(_ == name)
  }

  //8. Print count of Alina in both the Seq and Set

  val name = "Alina"
  val countSeq = countSubmissions(name, taxpayerForenames)
  val countSet = countSubmissions(name, uniqueTaxpayers)

  println(s"$name submitted $countSeq times in the Seq (with duplicates).")
  println(s"$name submitted $countSet time in the Set (duplicates removed).")

  //9. User of service needs to login but 6 users have failed login attempts
  //a. Write a Map[String,Int] to represent number of failed attempts for each user
  var failedLogins = Map(
    "alina" -> 1,
    "ben" -> 0,
    "jerry" -> 1,
    "tiffany" -> 2,
    "noah" -> 1,
    "tia" -> 0
)
  //b. Print the number of failed attempts for the user at index position 0
  val userIndex0 = failedLogins.keys.toSeq(0)
  println(s"$userIndex0 has ${failedLogins(userIndex0)} failed login attempts.")
  //c. Add a new user to your Map who has 3 failed attempts.
  failedLogins += ("jeremy" -> 3)

  //d. Update the user at index position 1 to have a further failed attempt.
  val userIndex1 = failedLogins.keys.toSeq(1)
  failedLogins += (userIndex1 -> (failedLogins(userIndex1) + 1))

  //    e. Remove the user at index position 5.

  val userIndex5 = failedLogins.keys.toSeq(5)
  failedLogins -= userIndex5

  //Research

  //1. Explain how knowing the difference between Seq and Set can help when writing tests
  // Seq is ordered and allows for repeated values whereas Set is unordered and does not allow repeated values.
  // Knowing this is important so you can write correct tests fully understand the ..


  //2.A Research the difference between the build in methods
  //i. Map.get - returns an Option type containing the value if the key exists, otherwise None.
  //It lets you safely check if a key exists
  // ii.Map(key) - accesses the value directly and throws a NoSuchElementException if the key does not exist.
  // iii. Map.getOrElse - returns the value if the key exists, otherwise returns the provided default value.

  //B. Using your Map from MVP Q9, write an example using each of the commands above.

  failedLogins.get("alina") match {
    case Some(count) => println(s"Alina has $count failed attempts.")
    case None => println("User not found.")
  }


  //C. In testing, when might it be dangerous to use Map(key) directly?
  //Using Map(key) directly is risky if the key might not exist in the map.
  //It throws a NoSuchElementException which can crash your program or test unexpectedly.

















}









