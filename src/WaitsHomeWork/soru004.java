package WaitsHomeWork;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class soru004 extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://demoqa.com/dynamic-properties");

        WebElement scrool = driver.findElement(By.id("//span[text()='Dynamic Properties']"));
        new Actions(driver)
                .scrollToElement(scrool)
                .build()
                .perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
        WebElement visible = driver.findElement(By.id("visibleAfter"));
        System.out.println(visible.isDisplayed());

        BekleKapat();


    }
}
