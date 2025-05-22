object MonCodeAlong extends App {
  //VAL= BEST PRACTISE!
  val melons = 5 * 50
  val apples = 2 * 10
  val fizzyDrink = 6 * (100*1.20)
//  val total = melons + apples + fizzyDrink

  //VAR - mutable (not best practice)
  var total: Double = 0
  total = total + apples
  println(total)
  total = total + melons
  println(total)
  total = total + fizzyDrink
  println(total)

//TYPES
  val wholeNumber: Int = 6171
  val littleNumber: Short = 68 // RARE - JUST USE INT
  val bigNumber: Long = 829374839928349L //MUST USE L
  val littleDecimal: Float = 2.374758595f //MUST PUT f
  val decimal: Double = 47365.936 // use this for decimal
  val text: String = "Hello World!"
  val trueFalse: Boolean = true //false
  val falseTrue: Boolean = false

  println(
    //even if two things have diff names it will look at the values only
  )

  //OPERATORS

  val a: Int = 10
  val b: Int = 5
  val c: Int = 3

  val add:Int = a + b
  val subtract: Int = a - b
  val divide: Double = a/ c
  val multiply:Int = a * b
  val modulus: Int = a % c// 10/3 what is left left over

  val even: Int = a % 2 // left with 0 = even

  //Relational

  val equality: Boolean = a==a //true/false
  val inequality: Boolean = a!=b // not equal to
  val LessThan: Boolean = a < b

  //Logical
  val and: Boolean = true && true //both must be true to return true
  val or: Boolean = true || false // either side can  be true to return true
  val not: Boolean = !false

  //METHODS
  def makeACupOfTea(sugar:Int, milk:Boolean): String = {
    s"You have made a cup of tea with $sugar spoons of sugar. Your milk selection is: $milk"
  }
  println(makeACupOfTea(7,milk = true))
  println(makeACupOfTea(1, milk = false)) //calling the method

  val VAT: Double = 1.2

  def finalPrice(price:Double): Double = {
    price * VAT

  }

  println(finalPrice(20))
 //CLASSES (think of these as a type)

 class Dog (val name:String,val age:Int,val likesBananas:Boolean) {
   val hasEars: Boolean = true //default parameters
   def speak:String = "woof" //declared in advance as it is the same for every dog
 }
  //Use the Class to make objects (e.g Dog)
  //Object of type of Dog

  val loki:Dog = new Dog("Loki", 5, true)
  //How do I access?
  println(loki.speak)
  println(loki.name)

}
i