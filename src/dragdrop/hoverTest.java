package dragdrop;

import Utility.BaseDriver;
import Utility.Myfunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class hoverTest extends BaseDriver {
    @Test
    public void Test()
    {
        driver.get("https://www.hepsiburada.com/");
        Actions aksiyonlar=new Actions(driver);
        Myfunction.Bekle(4);


        WebElement element=driver.findElement(By.name("//input[@placeholder='Ürün, kategori veya marka ara']"));
      aksiyonlar.moveToElement(element).contextClick().build().perform();
        BekleKapat();




    }
}
