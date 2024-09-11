package Gun09;

import Utility.BaseDriver;
import Utility.Myfunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class _01_action extends BaseDriver {
    @Test
    public void Test1(){
   driver.get("http://demoqa.com/buttons");

        WebElement btnClick=driver.findElement(By.xpath("//button[text()='Click Me']"));


        Actions aksiyonlar=new Actions(driver);


        Action aksiyon=aksiyonlar.moveToElement(btnClick).click().build();


        Myfunction.Bekle(2);
        aksiyon.perform();

        //kisa hali
       // aksiyonlar.moveToElement(btnClick).click().build().perform();

        //daha kisa hali
        //new Actions(driver).moveToElement(btnClick).build().perform();

        // en kisa
      //  new Actions(driver).click(btnClick).build().perform(); //bit tek aksiyon icin







    }
}








//