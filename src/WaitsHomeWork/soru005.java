package WaitsHomeWork;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class soru005 extends BaseDriver {
    @Test
    public void Test() {

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");


        WebElement addElement = driver.findElement(By.xpath("//button[text()='Add Element']"));
        addElement.click();


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Delete']")));
        WebElement delete =driver.findElement(By.xpath("//button[text()='Delete']"));
                System.out.println(delete.isEnabled());


        delete.click();


        wait.until(ExpectedConditions.stalenessOf(delete));

        System.out.println("Delete butonu başarıyla silindi.");


        BekleKapat();


    }
}
