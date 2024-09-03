package Odev;

import Utility.BaseDriver;
import Utility.Myfunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class soru003 extends BaseDriver {
    @Test
    public void Test2()
    {
        driver.get("https://www.snapdeal.com/");
        Myfunction.Bekle(10);

        WebElement search=driver.findElement(By.cssSelector("input[class='col-xs-20 searchformInput keyword']"));
        search.sendKeys("teddy bear");
        Myfunction.Bekle(3);

        WebElement click=driver.findElement(By.cssSelector("span[class='searchTextSpan']"));
        click.click();
        BekleKapat();



    }
    }
