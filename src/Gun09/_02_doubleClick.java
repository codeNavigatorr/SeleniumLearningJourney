package Gun09;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _02_doubleClick extends BaseDriver {
    @Test
    public void Test1(){

        driver.get("http://demoqa.com/buttons");

        WebElement btnClickdouble=driver.findElement(By.xpath("//button[text()='Bana çift tıkla']"));

        Actions aksiyonlar=new Actions(driver);
        Action aksiyon=aksiyonlar.moveToElement(btnClickdouble).doubleClick().build();
        aksiyon.perform();
        BekleKapat();


    }
}
