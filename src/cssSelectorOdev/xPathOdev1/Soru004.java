package cssSelectorOdev.xPathOdev1;

import Utility.BaseDriver;
import Utility.Myfunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru004 extends BaseDriver {
    @Test
    public void Test1()
    {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        Myfunction.Bekle(10);

        WebElement calculator=driver.findElement(By.xpath("//a[@id='calculatetest']"));
        calculator.click();
        Myfunction.Bekle(2);

        WebElement num1=driver.findElement(By.xpath("//input[@id='number1']"));
        num1.sendKeys("10");
        Myfunction.Bekle(2);

        WebElement num2=driver.findElement(By.xpath("//input[@id='number2']"));
        num2.sendKeys("100");
        Myfunction.Bekle(2);

        WebElement click=driver.findElement(By.xpath("//input[@class='styled-click-button']"));
        click.click();
        Myfunction.Bekle(2);

        WebElement result=driver.findElement(By.xpath("//span[@id='answer']/.."));
        System.out.printf(result.getText());

     BekleKapat();


    }
}
