package Automation.Week5Day3

import org.openqa.selenium.By.ByCssSelector
import org.openqa.selenium.{By, WebDriver}
import org.openqa.selenium.chrome.ChromeDriver

object HandlingButtonsandLinks extends App{

  val driver: WebDriver = new ChromeDriver()

  driver.get("https://www.selenium.dev/selenium/web/web-form.html")

  driver.manage().window().maximize()

  val button = driver.findElement(By.cssSelector("[type=\"submit\"]"))
   if (button.isEnabled) {


   } else{
     println("Button is not enabled")
   }

   //Handling hyperlinks

  driver.get("https://www.selenium.dev/")

  //val myLink = driver.findElement(By.linkText)

  //val myLink= .getAttribute("href")



}
