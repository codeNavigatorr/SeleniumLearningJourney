package Gun09;

import Utility.BaseDriver;
import Utility.Myfunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _05_actiondreganddrop extends BaseDriver {
    @Test
    public void Test1(){

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Actions aksiyonlar=new Actions(driver);
        Myfunction.Bekle(3);

        WebElement oslo=driver.findElement(By.id("box1"));
        WebElement norvey=driver.findElement(By.id("box10z"));


        //1.yontem
      //  aksiyonlar.dragAndDrop(oslo,norvey).build().perform();
        //osluyu norveye birak bu yontem hizli oldugu icin site cvp veremeyebilir



        //2.yontem
        //daha saglikli
        aksiyonlar.clickAndHold(oslo).build().perform();
        aksiyonlar.moveToElement(norvey).release().build().perform();
        BekleKapat();

    }
}
