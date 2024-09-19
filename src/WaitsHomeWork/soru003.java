package WaitsHomeWork;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class soru003 extends BaseDriver {
    @Test
    public void Test()
    {
        driver.get("https://demoqa.com/dynamic-properties");

       wait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")));
        WebElement enable=driver.findElement(By.id("enableAfter"));
        System.out.println(enable.isEnabled());

        BekleKapat();






    }
}
