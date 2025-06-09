import org.scalatest.flatspec.AnyFlatSpec

import scala.language.postfixOps

class CalculatorSpec extends AnyFlatSpec {

  val calc: Calculator = new Calculator // make a new object of our Class so we can access all the methods within it

  "add" should "add 2 Ints together" in {
    val input = calc.add(1,2)
    val expectedResult = 3
    assert(input == expectedResult) // assert(calc.add(1,2) ==3 - may be more confusing but shorter
  }

  "multiply" should "multiply 2 Ints together" in{
    val input = calc.multiply(2,3)
    val expectedResult = 6
    assert(input == expectedResult)
  }

  //1. Subtract - which way is important

  "subtract" should "subtract second Int from the first Int" in {
    val input = calc.subtract(6,3)
    val expectedResult = 3
    assert(input == expectedResult)
  }

  //Divide

  "divide" should " should divide second Int from the first Int" in {
    val input = calc.divide(6,3)
    val expectedResult = 3
    assert(input == expectedResult)
  }





}
