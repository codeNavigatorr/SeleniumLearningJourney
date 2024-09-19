package Gun13;

import Utility.BaseDriver;
import Utility.Myfunction;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.devtools.idealized.Javascript;

public class _01_javaScript_scroolToBy extends BaseDriver {
    @Test
    public void Test() {

        driver.get("https://www.selenium.dev/selenium/web/alerts.html");
        Myfunction.Bekle(2);

        JavascriptExecutor js = (JavascriptExecutor) driver;//driverden bi tane olustur
        js.executeScript("window.scrollTo(0,500)");// dikeyde 500 px scrol yap
        Myfunction.Bekle(2);

        js.executeScript("window.scrollBy(0,500)");// bulundugu yerden dikeyde 500 px scroll yap
        Myfunction.Bekle(2);


        js.executeScript("window.scrollBy(0,-500)");//bulungugu  yerden 500 px geri gel


        BekleKapat();


    }
}
