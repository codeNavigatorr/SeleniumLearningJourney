package dragdrop;

import Utility.BaseDriver;
import Utility.Myfunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class dragdrop extends BaseDriver {
    @Test
public void Test()
    {
       driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
        Actions aksiyonlar=new Actions(driver);
        Myfunction.Bekle(5);


        WebElement boxa=driver.findElement(By.name("A"));
        WebElement boxd=driver.findElement(By.name("D"));
        WebElement boxe=driver.findElement(By.name("E"));
        WebElement boxg=driver.findElement(By.name("G"));
        WebElement boxc=driver.findElement(By.name("C"));
        WebElement boxl=driver.findElement(By.name("L"));

        


        aksiyonlar.moveToElement(boxa).clickAndHold(boxa).build().perform();
        aksiyonlar.moveToElement(boxd).release().build().perform();

       aksiyonlar.moveToElement(boxe).clickAndHold(boxe).build().perform();
       aksiyonlar.moveToElement(boxg).release().build().perform();

       aksiyonlar.moveToElement(boxc).clickAndHold(boxc).build().perform();
       aksiyonlar.moveToElement(boxl).release().build().perform();
       Myfunction.Bekle(4);
       driver.quit();







    }
}
