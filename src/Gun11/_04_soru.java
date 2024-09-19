package Gun11;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _04_soru extends BaseDriver {
    @Test
    public void Test()
    {
       driver.get("https://www.demoblaze.com/index.html ");

        WebElement sansung = driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']"));

        sansung.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Samsung galaxy s6")));
        WebElement add=driver.findElement(By.linkText("Add to cart"));
        new Actions(driver)
                .moveToElement(add)
                .build()
                .perform();
      wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
WebElement ana=driver.findElement(By.id("nava"));
ana.click();

        Assert.assertTrue("Ana sayfa ya donulmedi",driver.getCurrentUrl().equalsIgnoreCase("https://www.demoblaze.com/index.html"));



        BekleKapat();


    }
}
