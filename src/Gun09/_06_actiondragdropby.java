package Gun09;

import Utility.BaseDriver;
import Utility.Myfunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _06_actiondragdropby extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");
        Myfunction.Bekle(3);

        Actions aksiyonlar=new Actions(driver);
        WebElement solsurgu=driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));
        Action aksiyon=aksiyonlar.dragAndDropBy(solsurgu,100,0).build();//soldan saga kaydirdi
        aksiyon.perform();
        BekleKapat();

    // TODO :sol surguyu $200 noktasina sag surguyu $400  noktasina kaydiriniz.
        //not bir elementin genisligini nasil alirsin? int genislik=cubuk.getsize().with;


    }
}
