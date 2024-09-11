package Gun08;

import Utility.BaseDriver;
import Utility.Myfunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _04_soru extends BaseDriver {

    @Test
    public void Test()
    {
//        Test Senaryosu
//        1- https://www.facebook.com/  sayfasına gidiniz
//        2- CreateNewAccount a tıklatınız.
//        3- Açılan yeni pencerede isim, soyisim ve emaili giriniz.
//        4- Doğum tarihinizi Select sınıfı ile seçiniz

        driver.get("https://www.facebook.com/");
        Myfunction.Bekle(15);

        WebElement create=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
        create.click();
        Myfunction.Bekle(2);

        WebElement name=driver.findElement(By.xpath("//input[@name='firstname']"));
        name.sendKeys("Yusuf");
        Myfunction.Bekle(2);

        WebElement surname=driver.findElement(By.xpath("//input[@aria-label='Soyadın']"));
        surname.sendKeys("ucucu");
        Myfunction.Bekle(2);

        WebElement phone=driver.findElement(By.xpath("//input[@aria-label='Cep telefonu numarası veya e-posta']"));
        phone.sendKeys("00000000");
        Myfunction.Bekle(2);

     WebElement password=driver.findElement(By.xpath("//input[@type='password' and @class='inputtext _58mg _5dba _2ph-']"));
     password.sendKeys("123456789");
     Myfunction.Bekle(2);

     WebElement gun=driver.findElement(By.xpath("//select[@aria-label='Gün']"));
        Select menu=new Select(gun);
        menu.selectByIndex(12);
        Myfunction.Bekle(2);

        WebElement ay=driver.findElement(By.xpath("//select[@aria-label='Ay']"));
        Select menu2=new Select(ay);
        menu2.selectByIndex(5);
        Myfunction.Bekle(2);

        WebElement yil=driver.findElement(By.xpath("//select[@aria-label='Yıl']"));
        Select menu3=new Select(yil);
        menu3.selectByValue("2022");
        BekleKapat();




    }
}
