package Gun10;

import Utility.BaseDriver;
import Utility.Myfunction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _04_Alert extends BaseDriver {
    @Test
    public void Test()
    {
        driver.get("https://www.selenium.dev/selenium/web/alerts.html");
        Myfunction.Bekle(3);
        WebElement clickme=driver.findElement(By.id("alert"));
        clickme.click();
        Myfunction.Bekle(3);//alert cikti
        driver.switchTo().alert().accept();//alert ok basti

        BekleKapat();

    }
    @Test
    public void Test2()
    {
        driver.get("https://www.selenium.dev/selenium/web/alerts.html");
        Myfunction.Bekle(3);
        WebElement prompt=driver.findElement(By.id("prompt"));
        prompt.click();
        Myfunction.Bekle(3);//alert cikti
        driver.switchTo().alert().dismiss();//alert ok basti
        WebElement txtmesaj=driver.findElement(By.id("text"));
        Assert.assertTrue("mesaj bulunamadi",txtmesaj.getText().equalsIgnoreCase("null"));


        BekleKapat();


    }
    @Test
    public void Test3()
    {
        driver.get("https://www.selenium.dev/selenium/web/alerts.html");
        Myfunction.Bekle(3);
        WebElement prompt=driver.findElement(By.id("prompt"));
        prompt.click();
        Myfunction.Bekle(3);//alert cikti
        driver.switchTo().alert().sendKeys("yusuf");
        driver.switchTo().alert().accept();//alert ok basti
        WebElement txtmesaj=driver.findElement(By.id("text"));
        new Actions(driver).scrollToElement(txtmesaj).build().perform();
        Myfunction.Bekle(3);
        Assert.assertTrue("mesaj bulunamadi",txtmesaj.getText().equalsIgnoreCase("yusuf"));


BekleKapat();

}
    @Test
    public void Test4()
    {
        driver.get("https://www.selenium.dev/selenium/web/alerts.html");
        Myfunction.Bekle(3);

        WebElement prompt=driver.findElement(By.id("prompt-with-default"));
        prompt.click();
        Myfunction.Bekle(3);//alert cikti

        String okunanyazi=driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();//alert ok basti

        System.out.println(okunanyazi);

        Assert.assertTrue("mesaj bulunamadi",okunanyazi.contains("Enter"));


        BekleKapat();


}}
