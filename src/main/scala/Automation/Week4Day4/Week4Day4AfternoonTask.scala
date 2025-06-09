package Automation.Week4Day4

import Automation.Week4Day4.ByID.driver
import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver

object Week4Day4AfternoonTask extends App {
  val driver: WebDriver = new ChromeDriver()

  driver.get("https://www.selenium.dev/selenium/web/web-form.html")

  // 1. By ID
  val nameField = driver.findElement(By.id("my-text-id"))
  nameField.sendKeys("Ajan")

  // 2. By Name
  val passwordField = driver.findElement(By.name("my-password"))
  passwordField.sendKeys("password123")

  // 3. By Class Name
  val commentField = driver.findElement(By.className("form-control"))
  commentField.sendKeys("This is a test comment.")

  // 4. By Tag Name
  val inputElements = driver.findElements(By.tagName("input"))
  println(s"Number of input elements: ${inputElements.size}")

  // 5. By LinkText
  val returnLink = driver.findElement(By.linkText("Return to index"))
  returnLink.click()

  // 6. By PartialLinkText
  driver.navigate().back()
  val partialLink = driver.findElement(By.partialLinkText("Return"))
  partialLink.click()

  driver.quit()


}
