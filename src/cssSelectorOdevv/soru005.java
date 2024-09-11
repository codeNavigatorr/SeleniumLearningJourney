package cssSelectorOdevv;

import Utility.BaseDriver;
import Utility.Myfunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class soru005 extends BaseDriver {
    @Test
    public void Test5()
    {
       driver.get("https://testpages.herokuapp.com/styled/index.html");
       Myfunction.Bekle(10);

        WebElement click1=driver.findElement(By.cssSelector("a[id='fakealerttest']"));
        click1.click();
        Myfunction.Bekle(3);
        WebElement click2=driver.findElement(By.cssSelector("input[class='styled-click-button'][onclick='show_modal()']"));
        click2.click();
        Myfunction.Bekle(3);
          WebElement ok=driver.findElement(By.cssSelector("button[id='dialog-ok']"));
          ok.click();
          BekleKapat();





    }
}
