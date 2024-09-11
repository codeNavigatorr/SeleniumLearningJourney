package cssSelectorOdev.xPathOdev1;

import Utility.BaseDriver;
import Utility.Myfunction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class soru003 extends BaseDriver {

    @Test
    public void Test()
    {
        driver.get("https://www.snapdeal.com/");
        Myfunction.Bekle(2);

        WebElement page=driver.findElement(By.xpath("//input[@class='col-xs-20 searchformInput keyword']"));
        page.sendKeys("teddy bear");
        Myfunction.Bekle(2);

        WebElement search=driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
        search.click();
        Myfunction.Bekle(2);

        WebElement head=driver.findElement(By.xpath("//div[@class='search-result-txt-section  marT12']"));

        Assert.assertTrue(head.getText().equals("We've got 62 results for teddy bear"));
        BekleKapat();










    }

}
