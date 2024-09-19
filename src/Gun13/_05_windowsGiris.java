package Gun13;

import Utility.BaseDriver;
import Utility.Myfunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _05_windowsGiris extends BaseDriver {
    @Test
    public void Test()
    {
driver.get("https://www.selenium.dev/");
String anasayfaid=driver.getWindowHandle();

        List<WebElement>linkler=driver.findElements(By.xpath("//a[@target='_blank']"));

        for (WebElement e:linkler)
            js.executeScript("arguments[0].click();",e);
        Set<String>windowidler=driver.getWindowHandles();
        for (String id:windowidler)
            System.out.println(id);
        Myfunction.Bekle(3);
        driver.switchTo().window(anasayfaid);
        Myfunction.Bekle(4);
        BekleKapat();





    }
}
