package Gun08;

import Utility.BaseDriver;
import Utility.Myfunction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class deneme extends BaseDriver {
    @Test
     public void Test1 (){

        driver.get("https://www.akakce.com/");
        Myfunction.Bekle(5);

        WebElement login=driver.findElement(By.xpath("//a[@rel='nofollow' and @href='/akakcem/giris/'][1]"));
        login.click();
        Myfunction.Bekle(2);


        WebElement eposta=driver.findElement(By.xpath("//input[@id='life']"));
        eposta.sendKeys("yusuffucucu@gmail.com");
        Myfunction.Bekle(2);


        WebElement password=driver.findElement(By.xpath("//input[@type='password' and @id='lifp']"));
        password.sendKeys("Yusuf.0021");
        Myfunction.Bekle(3);

        WebElement giris=driver.findElement(By.xpath("//input[@value='Giriş yap' and @class='s' and @id='lfb']"));
        giris.click();
        Myfunction.Bekle(3);



        WebElement profilicon=driver.findElement(By.xpath("//a[@id='H_a_v8']"));
        profilicon.click();
        Myfunction.Bekle(2);

        WebElement cikis=driver.findElement(By.xpath("//a[@href='#Çık']"));
        cikis.click();
        BekleKapat();
    }
}
