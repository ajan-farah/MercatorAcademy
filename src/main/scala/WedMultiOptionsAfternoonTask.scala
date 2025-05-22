object WedMultiOptionsAfternoonTask extends App {

  //1. John from primary school maths is trying to buy as many watermelons as possible and we need to
  //give him a reality check. John can reasonably carry 3 watermelons without a bag, and 5 with one
  //bag.
  //a) Create a value to store a number of watermelons.
  val watermelons: Int = 4
  val hasBag = true

  //b) Use your Scala knowledge to print appropriate messages based on the criteria above to tell
  //John whether he:
  //i. Doesn't need a bag
  //ii. Needs a bag
  //iii. Can't carry them
  //Be sure to consider how you will handle invalid numbers.

  if(watermelons <= 0) {
    println(s"Invalid number of watermelons: $watermelons")
  } else if (watermelons <=3) {
    println(s"John does not require a bag for the $watermelons watermelons")
  } else if (watermelons <=5) {
      println(s"John requires a bag to carry the $watermelons watermelons")
    }
   else {
    println(s"John cannot carry the ${watermelons} watermelons")
  }

// c) Use string interpolation to add to each message the number of watermelons John is trying to
// buy.
// d) Create a value to store a `Boolean` that indicates whether John has a bag with him or not.
// e) Use an if/else statement and this `Boolean` to tell John whether he can or cannot by the
  //desired number of watermelons in Task 1.

  if (watermelons <= 0) {
    println(s"Invalid number of watermelons: $watermelons")
  } else if (!hasBag && watermelons <= 3) {
    println(s"John does not require a bag for the $watermelons watermelons.")
  } else if (hasBag && watermelons <= 5) {
    println(s"John can carry the $watermelons watermelons with his bag.")
  } else if (!hasBag && watermelons > 3) {
    println(s"John needs a bag to carry the $watermelons watermelons.")
  } else {
    println(s"John cannot carry the $watermelons watermelons.")
  }

//A person is paid £0.45 per mile travelled. When they input their miles travelled it goes in as a
// `String` (e.g. “twenty”). Given the distance inputted, calculate the amount to be paid back being
//sure to use try/catch to account for errors.

val milesTravelled = "twenty"

  try {
      val miles = milesTravelled.toDouble
      val pay = miles * 0.45
      println(s"You will get paid £$pay for $miles miles.")
    } catch {
      case error: NumberFormatException => print(s"Invalid input for miles travelled: '$milesTravelled'")
    }

//Extension
//Logical operators used in IF statements (e.g., && or <) have an order of precedence.
  // 1. What is this order, where can we find it?
  //Order: (), */%, AND && , OR ||
  //Let's try to apply it, try to predict the answer before coding it:
  //2. What would (true || false && false) result in?
  //TRUE
  //3. What about ((true || false) && false)? (Note the parentheses used here.)
  // FALSE
  //4. And finally, how about (1 < 4 && 7 != 10 || 9 + 10 == 21)?
  //TRUE

  //Research Task

  val value1: Int = 1
  val value2: Int = 2

  val value3: String = if (value1 < value2) {
    "yes"
  } else {
    "no"
  }







}
