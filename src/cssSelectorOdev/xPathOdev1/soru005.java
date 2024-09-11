package cssSelectorOdev.xPathOdev1;

import Utility.BaseDriver;
import Utility.Myfunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class soru005 extends BaseDriver {
    @Test
    public void Test1()
    {

  driver.get("https://testpages.herokuapp.com/styled/index.html");
        Myfunction.Bekle(5);

        WebElement alert=driver.findElement(By.xpath("//a[@href='alerts/fake-alert-test.html']"));
        alert.click();
Myfunction.Bekle(2);

WebElement show=driver.findElement(By.xpath("//input[@value='Show fake alert box']"));
show.click();
Myfunction.Bekle(2);

WebElement ok=driver.findElement(By.xpath("//button[@id='dialog-ok']"));
ok.click();
BekleKapat();


    }
}
