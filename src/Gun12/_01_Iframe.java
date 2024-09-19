package Gun12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_Iframe extends BaseDriver {
    @Test
    public void Test()
    {
        driver.get("https://demo.automationtesting.in/Frames.html");
          driver.switchTo().frame(0);
          //driver.switchTo().frame("id") id vererek bulunur element verilerek yniwebelemnt.driver iile bulunur


        WebElement txtbox=driver.findElement(By.xpath("//input[@type='text']"));
        txtbox.sendKeys("yusuf");

        // anasayfaya nasil donebilirim
        // iki yol var
        // 1.yol=parente yani geri git
        //2: direkt anasayfaya gitt
        driver.switchTo().parentFrame();// bi geri yani anasayfaya git
        // suan ana sayfadayim


      BekleKapat();
    }
}
