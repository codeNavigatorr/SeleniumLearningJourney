package Gun11;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _03_soru extends BaseDriver {
    @Test
    public void Test() {

        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
        WebElement btn1 = driver.findElement(By.id("btn2"));
        btn1.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt2")));
        WebElement txt2 = driver.findElement(By.id("txt2"));
        new Actions(driver)
                .moveToElement(txt2)
                .sendKeys("Yusuf")
                .build()
                .perform();
        BekleKapat();


    }
}
