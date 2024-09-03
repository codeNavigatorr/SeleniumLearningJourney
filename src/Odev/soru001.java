package Odev;

import Utility.BaseDriver;
import Utility.Myfunction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class soru001 extends BaseDriver {

    @Test
    public void Test0() {
        driver.get("http://demoqa.com/text-box");
        Myfunction.Bekle(15);

        WebElement fullname = driver.findElement(By.cssSelector("input[type='text']"));
        fullname.sendKeys("Automation");
        Myfunction.Bekle(2);

        WebElement email = driver.findElement(By.cssSelector("input[class='mr-sm-2 form-control']"));
        email.sendKeys("Testing@gmail.com");
        Myfunction.Bekle(2);

        WebElement addres = driver.findElement(By.cssSelector("textarea[placeholder='Current Address']"));
        addres.sendKeys("Testing Current Address");
        Myfunction.Bekle(2);

        WebElement permament = driver.findElement(By.cssSelector("textarea[id='permanentAddress']"));
        permament.sendKeys("Testing Permanent Address");
        Myfunction.Bekle(2);

        WebElement submit = driver.findElement(By.cssSelector("button[id='submit']"));
        submit.click();
        BekleKapat();


    }
}
