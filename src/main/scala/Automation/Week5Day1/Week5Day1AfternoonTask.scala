package Automation.Week5Day1

import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver

object Week5Day1AfternoonTask extends App {

  val driver: WebDriver = new ChromeDriver()

  driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html")

 //2. Username field - byName

  val userName: WebElement = driver.findElement(By.name("username"))
  userName.sendKeys("username1")
  println("Username entered - Passed")

  // Password Field -By.cssSelector

  val password: WebElement = driver.findElement(By.cssSelector("input[type=password]"))
  password.sendKeys("password1")
  println("Password entered - Passed")

  //Comments/Extra Field - tagName
  val textArea: WebElement = driver.findElement(By.tagName("textarea"))
  textArea.clear()
  textArea.sendKeys("This is a comment")
  println("Text comment entered successfully")

  //Clicks on: - xpath
  //A check box
   val checkBox = driver.findElement(By.xpath("//input[@type='checkbox'][@value='cb1']"))
   checkBox.click()
   println("Check box 1 clicked successfully")

   //Submit button - css selector
   val clickSubmit = driver.findElement(By.cssSelector("input[type='submit'][value='submit']"))
  clickSubmit.click()

  // Click back to form link
  val backButton = driver.findElement(By.id("back-to-form"))
  backButton.click()


  // A link on the page - By.linkText
  //driver.navigate().back()
  val backToFormLink: WebElement = driver.findElement(By.linkText("Go back to the form"))
  backToFormLink.click()
  println("Navigated back using the link - Passed")


  driver.quit()






















}
