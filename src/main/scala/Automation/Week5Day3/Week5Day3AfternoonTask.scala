package Automation.Week5Day3
import Automation.Week5Day3.HandlingDropdowns.select
import org.openqa.selenium.{By, WebElement}
import org.openqa.selenium.By.ById
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.Select

object Week5Day3AfternoonTask extends App {
  val driver = new ChromeDriver

  //1. navigate to website then maximise
  driver.get("https://testpages.herokuapp.com/styled/index.html")
  driver.manage().window().maximize()

  //2. navigate to HTML Form Example + username + password
  driver.findElement(By.id("htmlformtest")).click()

  val userName: WebElement = driver.findElement(By.name("username"))
  userName.sendKeys("username1")
  println("Username entered - Passed")

  val password: WebElement = driver.findElement(By.name("password"))
  password.sendKeys("password123")
  println("Password entered - Passed")

  //3.Handle Checkbox
  val checkbox = driver.findElement(By.name("checkboxes[]"))
  if (!checkbox.isSelected) {
    checkbox.click()
    println("Checkbox has been selected")
  } else {
      println("Checkbox already selected")
    }

  //4. Handle Radio Buttons:
  driver.findElement(By.cssSelector("input[type='radio'][value='rd1']")).click()
  println("Selected radio button successfully")

 // 5. Handle Dropdown/Select

  val dropdown = new Select(driver.findElement(By.name("multipleselect[]")))
  dropdown.selectByVisibleText("Selection Item 1")
  println("Selected by visible text passed ")

  //6. Handle Buttons - Click the "Submit" button.

  driver.findElement(By.cssSelector("input[value='submit']")).click()
  println("Submit button has been clicked")


  // 7. Click a link to return to the homepage
  driver.findElement(By.linkText("Back to Index")).click()
  println("Clicked 'Back to Index' link to return to homepage")


  Thread.sleep(3000)

  driver.quit()







}
