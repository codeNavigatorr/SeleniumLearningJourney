package cssSelectorOdevv;

import Utility.BaseDriver;
import Utility.Myfunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class soru004 extends BaseDriver {
    @Test
    public void Test4() {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        Myfunction.Bekle(10);

        WebElement click = driver.findElement(By.cssSelector("a[id='calculatetest']"));
        click.click();
        Myfunction.Bekle(3);

        WebElement input1 = driver.findElement(By.cssSelector("input[type='text'][id='number1']"));
        input1.sendKeys("10");
        Myfunction.Bekle(3);


        WebElement input2 = driver.findElement(By.cssSelector("input[type='text'][id='number2']"));
        input2.sendKeys("15");
        Myfunction.Bekle(3);

        WebElement click2 = driver.findElement(By.cssSelector("input[class='styled-click-button']"));
        click2.click();
        Myfunction.Bekle(2);


        WebElement result=driver.findElement(By.cssSelector("[id='answer']"));
        System.out.println("Answer= "+result.getText());

        BekleKapat();


    }
}
