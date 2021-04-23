package Test_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DummySeleniumTest {

    @Test
    public void testOpeningGoogle() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\User\\IdeaProjects\\QA_projs\\src\\test\\java\\Test_pkg\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        Thread.sleep(2000);
        WebElement inputField = driver.findElement(By.cssSelector("input[name=q]"));
        inputField.sendKeys("https://youtube.com" + Keys.ENTER);
        driver.get("https://youtube.com");
//        driver.findElement(By.id("butt")).click();
        Thread.sleep(2000);
        driver.findElement(By.tagName("a")).click();
//        driver.findElement(By.id("email")).sendKeys("My email");
//        driver.findElement(By.id("pass")).sendKeys("My password");

        Thread.sleep(2000);
        driver.quit();
    }
}
