package Gun09;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_actionhovertest extends BaseDriver {
    @Test
    public void Test1()
    {
        driver.get("https://www.hepsiburada.com/");

        Actions aksiyonlar=new Actions(driver);


        WebElement element=driver.findElement(By.xpath("//span[text()='Moda']"));
        Action akssiyon=aksiyonlar.moveToElement(element).build();
        akssiyon.perform();
        BekleKapat();



    }

}
