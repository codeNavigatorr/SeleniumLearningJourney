package Gun13;

import Utility.BaseDriver;
import Utility.Myfunction;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _02_scroolBottomOfThePage extends BaseDriver {
    @Test
    public void Test()
    {
        driver.get("https://www.selenium.dev/selenium/web/alerts.html");
        Myfunction.Bekle(2);

        JavascriptExecutor js=(JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//tum sayfayi scrol yap en alta in
        Myfunction.Bekle(2);

        js.executeScript("window.scrollTo(0,0)");// 0 noktasindan basa don
        BekleKapat();


    }

}
