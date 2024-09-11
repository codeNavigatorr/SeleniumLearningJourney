package cssSelectorOdev.xPathOdev1;

import Utility.BaseDriver;
import Utility.Myfunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class soru006 extends BaseDriver {
    @Test
    public void Test()
    {

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        Myfunction.Bekle(5);

        WebElement alert=driver.findElement(By.xpath("//a[@href='alerts/fake-alert-test.html']"));
        alert.click();
        Myfunction.Bekle(2);

        WebElement modul=driver.findElement(By.xpath("//input[@id='modaldialog']"));
        modul.click();
        Myfunction.Bekle(2);

        WebElement ok=driver.findElement(By.xpath("//button[@id='dialog-ok']"));
        ok.click();
        BekleKapat();



    }
}
