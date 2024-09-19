package Gun11;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class _01_ImplicitlyWait extends BaseDriver {
    @Test
    public void Test()
    {
    driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement btn=driver.findElement(By.xpath("//button[@onclick='timedText()']"));
        btn.click();

        WebElement mesj=driver.findElement(By.xpath("//*[text()='WebDriver']"));
        System.out.println(mesj.getText());
        BekleKapat();




    }
}
