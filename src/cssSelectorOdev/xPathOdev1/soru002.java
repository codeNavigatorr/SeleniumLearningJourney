package cssSelectorOdev.xPathOdev1;

import Utility.BaseDriver;
import Utility.Myfunction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class soru002 extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://demo.applitools.com/");
        Myfunction.Bekle(5);

        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("yusuf");
        Myfunction.Bekle(2);


        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
        password.sendKeys("123456");
        Myfunction.Bekle(2);

        WebElement click = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
        click.click();
        BekleKapat();

        WebElement head = driver.findElement(By.xpath("//h6[@style='text-align: center;font-size: x-large;color:red']"));
        Assert.assertTrue(head.getText().equals("Your nearest branch closes in: 30m 5s"));
        BekleKapat();


    }
}
