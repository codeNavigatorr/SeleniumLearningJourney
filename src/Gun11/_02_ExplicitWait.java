package Gun11;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _02_ExplicitWait extends BaseDriver {
@Test
    public void Test()
{
    driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

    WebElement btn=driver.findElement(By.xpath("//button[@onclick='timedText()']"));
    btn.click();

    WebDriverWait bekle=new WebDriverWait(driver, Duration.ofSeconds(20));
    bekle.until(ExpectedConditions.textToBe(By.id("demo"),"WebDriver"));

    WebElement demomsj=driver.findElement(By.id("demo"));
    System.out.println("Demo Mesaj = "+demomsj.getText());
    BekleKapat();


}
}
