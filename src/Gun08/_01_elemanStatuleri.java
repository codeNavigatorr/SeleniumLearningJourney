package Gun08;

import Utility.BaseDriver;
import Utility.Myfunction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_elemanStatuleri extends BaseDriver {
    @Test
    public void Test1()
    {
       driver.get("https://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");
        Myfunction.Bekle(2);

        WebElement pazartesi=driver.findElement(By.xpath("//label[@id='gwt-debug-cwCheckBox-Monday-label']"));
        System.out.println(pazartesi.isDisplayed());
        System.out.println(pazartesi.isEnabled());

        pazartesi.click();
        System.out.println(pazartesi.isSelected());

        WebElement pazar=driver.findElement(By.xpath("//label[@id='gwt-debug-cwCheckBox-Sunday-label']"));

        System.out.println(pazar.isDisplayed());
        System.out.println(pazar.isEnabled());
        System.out.println(pazar.isSelected());
        Assert.assertTrue(pazar.isDisplayed()==true);
        BekleKapat();







    }
}
