package Gun13;

import Utility.BaseDriver;
import Utility.Myfunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _03_scrollToElement extends BaseDriver {
    @Test
    public void Test()
    {
        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");
        Myfunction.Bekle(2);

        JavascriptExecutor js=(JavascriptExecutor) driver;

        WebElement iframe=driver.findElement(By.name("nested_scrolling_frame"));


        js.executeScript("arguments[0].scrollIntoView();",iframe);//tum sayfayi scrol yap en alta in

        BekleKapat();


    }
}
