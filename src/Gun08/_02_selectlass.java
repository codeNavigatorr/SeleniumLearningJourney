package Gun08;

import Utility.BaseDriver;
import Utility.Myfunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_selectlass extends BaseDriver {
    @Test
    public void Test1()
    {
        driver.get("https://www.amazon.com.tr/");
        Myfunction.Bekle(2);
WebElement webmenu=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

        Select ddmenu=new Select(webmenu);

        ddmenu.selectByIndex(2);
        Myfunction.Bekle(2);
        ddmenu.selectByVisibleText("Evcil Hayvan Malzemeleri");
        Myfunction.Bekle(2);
        ddmenu.selectByValue("search-alias=grocery");
        Myfunction.Bekle(2);
        System.out.println(ddmenu.getOptions().size());

        for (WebElement secenek:ddmenu.getOptions())
        {
            System.out.println(secenek.getText());
            BekleKapat();
        }





    }
}
