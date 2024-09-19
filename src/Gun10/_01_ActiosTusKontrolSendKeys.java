package Gun10;

import Utility.BaseDriver;
import Utility.Myfunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _01_ActiosTusKontrolSendKeys extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://demoqa.com/auto-complete");
        Myfunction.Bekle(3);
        WebElement txtbox=driver.findElement(By.xpath("//*[@id=;autoCompleteMultipleContainer']/div/div[1]"));
        new Actions(driver)
                .moveToElement(txtbox)
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys("a")
                .keyUp(Keys.SHIFT)
                .sendKeys("hmet")
                .build()
                .perform();
        BekleKapat();






    }
}
