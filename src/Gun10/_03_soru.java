package Gun10;

import Utility.BaseDriver;
import Utility.Myfunction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _03_soru extends BaseDriver {
    @Test
    public void Test()
    {
       driver.get("https://www.mediamarkt.com.tr/");
        Myfunction.Bekle(4);

        WebElement tmkategori=driver.findElement(By.xpath("//*[@id='mms-app-header-category-button']/span[2]"));
        Actions aksiyonlar=new Actions(driver);

        aksiyonlar.moveToElement(tmkategori).click().build().perform();
        Myfunction.Bekle(3);

        WebElement beyzesya=driver.findElement(By.xpath("//*[@id='category-197']/span[1]"));
        WebElement kombi=driver.findElement(By.xpath("//*[@id='category-197']/span[1]"));
        aksiyonlar.moveToElement(kombi)
                        .build()
                        .perform();
Myfunction.Bekle(3);
aksiyonlar.moveToElement(beyzesya)
                .click()
                .build()
                .perform();
        Assert.assertFalse("URL de kombi kelimesi bulunamadi",driver.getCurrentUrl().contains("kombi"));

                  BekleKapat();
    }
}
