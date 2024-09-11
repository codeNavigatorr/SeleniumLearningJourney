package cssSelectorOdev.xPathOdev1;

import Utility.BaseDriver;
import Utility.Myfunction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class soru001 extends BaseDriver {
    @Test
    public void Test1()
    {
        driver.get("http://demoqa.com/text-box");

        Myfunction.Bekle(2);

        WebElement element1=driver.findElement(By.xpath("//*[@id='userName-wrapper']/div[2]/input"));
        element1.sendKeys("Automation");
        Myfunction.Bekle(2);

        WebElement element2=driver.findElement(By.xpath("//*[@id='userEmail-wrapper']/div[2]/input"));
        element2.sendKeys("Testing@gmail.com");
        Myfunction.Bekle(2);

        WebElement element3=driver.findElement(By.xpath("//*[@id='currentAddress-wrapper']/div[2]/textarea"));
        element3.sendKeys("Testing Current Address");
        Myfunction.Bekle(2);

        WebElement element4=driver.findElement(By.xpath("//*[@id='permanentAddress-wrapper']/div[2]/textarea"));
        element4.sendKeys("Testing Permanent Address");
        Myfunction.Bekle(2);

        WebElement element5=driver.findElement(By.xpath("//*[@class='mt-2 justify-content-end row']/div[1]/button"));
        element5.click();
        Myfunction.Bekle(2);


        WebElement element6=driver.findElement(By.xpath("//*[@id='output']/div/p[1]"));
        Assert.assertTrue("Kullanıcı Adı Yanlış",element6.getText().contains("Automation"));

        System.out.println(element1.getText());
        System.out.println(element6.getText());


        Assert.assertTrue("Kullanıcı Adı Yanlış",element6.getText().contains(element1.getText()));

        BekleKapat();

    }
}





