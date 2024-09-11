package cssSelectorOdevv;

import Utility.BaseDriver;
import Utility.Myfunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class soru006 extends BaseDriver {
    @Test
    public void Test6()
    {
       driver.get("https://testpages.herokuapp.com/styled/index.html");
        Myfunction.Bekle(10);

        WebElement click=driver.findElement(By.cssSelector("a[id='fakealerttest']"));
        click.click();
        Myfunction.Bekle(3);

        WebElement click2=driver.findElement(By.cssSelector("input[value='Show fake alert box']"));
        click2.click();
        Myfunction.Bekle(3);

        WebElement click3=driver.findElement(By.cssSelector("button[class='dialog-button']"));
        click3.click();
        Myfunction.Bekle(3);
        driver.quit();



    }
}
