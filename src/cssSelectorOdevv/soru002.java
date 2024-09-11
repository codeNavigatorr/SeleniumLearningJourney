package cssSelectorOdevv;

import Utility.BaseDriver;
import Utility.Myfunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class soru002 extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("https://demo.applitools.com/");
        Myfunction.Bekle(10);

        WebElement username=driver.findElement(By.cssSelector("input[class='form-control'][placeholder='Enter your username']"));
        username.sendKeys("ttechno@gmail.com");
        Myfunction.Bekle(3);

        WebElement password=driver.findElement(By.cssSelector("input[placeholder='Enter your password']"));
        password.sendKeys("techno123.");
        Myfunction.Bekle(3);

        WebElement sing=driver.findElement(By.cssSelector("a[class='btn btn-primary']"));
        sing.click();

        WebElement header=driver.findElement(By.xpath("//h6[@style='text-align: center;font-size: x-large;color:red']"));

        System.out.println(header.getText());

        BekleKapat();



    }
}
