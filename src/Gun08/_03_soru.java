package Gun08;

import Utility.BaseDriver;
import Utility.Myfunction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_soru extends BaseDriver {
    @Test
    public void Test1()
    {
//       Test Senaryosu
//        1- https://www.ebay.co.uk/  sayfasına gidiniz
//        2- Kategorilerden Baby seçeneğini seçiniz.
//        3- Arama butonuna tıklatınız.
//        4- Sonuçları çıktığı ekranda sol başlık
//            kısmında Baby kelimesinin geçtiğini doğrulayınız

        driver.get("https://www.ebay.co.uk/");
        Myfunction.Bekle(3);
        WebElement baby=driver.findElement(By.xpath("//select[@id='gh-cat']"));

        Select kategori=new Select(baby);
        kategori.selectByIndex(3);
        Myfunction.Bekle(2);

        WebElement click=driver.findElement(By.xpath("//input[@type='submit']"));
        click.click();
        BekleKapat();
       WebElement  baslik=driver.findElement(By.xpath("//span[@class='b-pageheader__text']"));
       Assert.assertTrue("Aranilan kelime bulunamadi",baslik.getText().contains("Baby"));

    }
}
