package Gun13;

import Utility.BaseDriver;
import Utility.Myfunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _04_javascriptClick extends BaseDriver {
    @Test
    public void Test()
    {
        driver.get("https://www.copado.com/robotic-testing");
        Myfunction.Bekle(2);

        JavascriptExecutor js=(JavascriptExecutor) driver;
        WebElement takeTest=driver.findElement(By.xpath("//div[text()='Take Testing Quiz'"));
        js.executeScript("arguments[0].click();",takeTest);
        BekleKapat();




    }
}
