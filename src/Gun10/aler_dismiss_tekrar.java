package Gun10;

import Utility.BaseDriver;
import Utility.Myfunction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class aler_dismiss_tekrar extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://www.selenium.dev/selenium/web/alerts.html");
        Myfunction.Bekle(3);
        WebElement clickme = driver.findElement(By.xpath("/html/body/p[1]/a"));
        clickme.click();
        Myfunction.Bekle(3);

        driver.switchTo().alert().accept();
        BekleKapat();
    }
    @Test
    public void Test2()
{
    driver.get("https://www.selenium.dev/selenium/web/alerts.html");
    Myfunction.Bekle(3);

    WebElement clickme2=driver.findElement(By.id("prompt"));
    clickme2.click();
    Myfunction.Bekle(3);

    driver.switchTo().alert().sendKeys("yusuf");
    driver.switchTo().alert().accept();

WebElement yusuf=driver.findElement(By.id("id=text1"));
new Actions(driver).scrollToElement(yusuf).build().perform();
    Assert.assertTrue("yusuf kelimesi bulunamadi",yusuf.getText().equalsIgnoreCase("yusuf"));
    BekleKapat();




}
    }

