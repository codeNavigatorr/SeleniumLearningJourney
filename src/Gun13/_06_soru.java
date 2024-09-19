package Gun13;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _06_soru extends BaseDriver {
    @Test
    public void Test()
    {
  driver.get("https://www.selenium.dev/");

  List<WebElement> linkler=driver.findElements(By.xpath("//a[@target='_blank']"));
        for (WebElement e:linkler)
            js.executeScript("arguments[0].click();",e);

        Set<String>tabidler=driver.getWindowHandles();
        for (String id:tabidler)
            driver.switchTo().window(id);

        System.out.println(driver.getTitle()+"-"+driver.getCurrentUrl());






            BekleKapat();

        }}

