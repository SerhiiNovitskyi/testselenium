import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MainClass {

    public static void main(String[] args) {

               // Optional, if not specified, WebDriver will search your path for chromedriver.
            System.setProperty("webdriver.gecko.driver", "//Users/snovitskiy/Documents/Work/geckodriver");

            WebDriver driver = new FirefoxDriver();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().setSize(new Dimension (1024, 720));





            driver.get("https://github.com/");
            WebElement button = driver.findElement(By.xpath("//form[@class='home-hero-signup js-signup-form']//button"));
            System.out.println("Button text is:" + button.getText());
            button.submit();
            driver.get("https://en.wikipedia.org/wiki/Main_Page");



  //          driver.get("https://en.wikipedia.org/wiki/Main_Page");
  //          WebElement link = driver.findElement(By.linkText("Log in"));                                                // поиск по тексту ссылки
  //          WebElement link2 = driver.findElement(By.partialLinkText("Donate"));                                        // поиск частичному тексту ссылки
  //          WebElement searchfield = driver.findElement(By.name("search"));                                             // поиск по имени
  //          WebElement searchbutton = driver.findElement(By.className("searchButton"));                                 // поиск по имени класа
  //          WebElement input = driver.findElement(By.tagName("input"));                                                 // поиск по имени тега
  //          WebElement element = driver.findElement(By.cssSelector("div#simpleSearch input#searchButton"));             // поиск по CSS selector
  //          WebElement logo = driver.findElement(By.xpath("//a[@title='Visit the main page']"));                        // поиск по xpath


            // driver.get("http://www.google.com");
            // driver.get("http://google.com");
            // driver.navigate().to("http://seleniumhq.org");
            // System.out.println(driver.getCurrentUrl());
            // driver.navigate().back();
            // driver.navigate().refresh();
            // System.out.println(driver.getTitle());

            driver.quit();




    }
}

