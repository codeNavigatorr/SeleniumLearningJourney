package Gun10;

import Utility.BaseDriver;
import Utility.Myfunction;
import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.K;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class deneme extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://demoqa.com/auto-complete");
        Myfunction.Bekle(5);

        WebElement txtbox = driver.findElement(By.xpath("//div[@class='auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3']"));
        new Actions(driver)
                .moveToElement(txtbox)
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys("a")
                .keyUp(Keys.SHIFT)
                .sendKeys("hmet")
                .build()
                .perform();
        BekleKapat();
    }

@Test
    public void Test2() {
    driver.get("https://demoqa.com/auto-complete");
    Myfunction.Bekle(4);

    WebElement element = driver.findElement(By.xpath("//div[@class='auto-complete__value-container css-1hwfws3']"));
    new Actions(driver)
            .moveToElement(element)
            .click()
            .sendKeys("b")
            .build()
            .perform();
    Myfunction.Bekle(3);

    new Actions(driver)
            .sendKeys(Keys.DOWN)
            .sendKeys(Keys.ENTER)
            .build()
            .perform();
    BekleKapat();
}
@Test
    public void Test3()
{
   driver.get("https://www.mediamarkt.com.tr/");
   Myfunction.Bekle(3);

   WebElement tum=driver.findElement(By.xpath("//div[@class='sc-155e821c-0 ctTThj']"));
   Actions aksiyonlar=new Actions(driver);
   aksiyonlar.click(tum)
           .build()
           .perform();
   Myfunction.Bekle(2);

   WebElement eyazesya=driver.findElement(By.xpath("//span[text()='Beyaz Eşya' and @font-size='xs' and @font-family='default']"));
   aksiyonlar.moveToElement(eyazesya)
           .build()
           .perform();
   Myfunction.Bekle(2);
   WebElement kombiler=driver.findElement(By.xpath("(//span[text()='Kombiler'])[1]"));
   aksiyonlar.click(kombiler)
           .build()
           .perform();
   Myfunction.Bekle(2);
    Assert.assertTrue("urlde kombi bulunamadi",driver.getCurrentUrl().contains("kombi"));
BekleKapat();
}
}








