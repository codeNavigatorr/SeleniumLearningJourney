package Gun07;

import Utility.BaseDriver;
import Utility.Myfunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_soru extends BaseDriver {
    @Test
    public void Test1() {
        //        Senaryo
//        1- https://www.saucedemo.com/
//        2- login işlemini yapınız.
//        3- Sauce Labs Backpack  a tıklatın ve sepete ekletin.
//        4- Sonra geri dönün (Back to products e tıklatın)
//        5- Sauce Labs Bolt T-Shirt  a tıklatın ve sepete ekleyin.
//        6- sepete tıklatın
//        7- CheckOut a tıklatın
//        8- kullanıcı bilgilerini doldurup Continue ya tıklatın
//        9- Burada her bir eşyanın ücretlerinin toplamının aşağıdaki
//        Item total e eşit olup olmadığını Assert ile test ediniz.
//
//        Bu soruda tamamen XPATH kullanılacaktır.
        //    Assert.assertTrue(urunFiyatToplamlam == itemTotal)

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().fullscreen();
        Myfunction.Bekle(5);

        WebElement name = driver.findElement(By.xpath("//input[@id='user-name']"));
        name.sendKeys("standard_user");
        Myfunction.Bekle(2);

        WebElement passord = driver.findElement(By.xpath("//input[@id='password' and @name='password']"));
        passord.sendKeys("secret_sauce");
        Myfunction.Bekle(2);

        WebElement login = driver.findElement(By.xpath("//input[@data-test='login-button']"));
        login.click();
        Myfunction.Bekle(2);

        WebElement click = driver.findElement(By.xpath("//*[@id='item_4_title_link']/div"));
        click.click();
        Myfunction.Bekle(2);

        WebElement add = driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));
        add.click();
        Myfunction.Bekle(2);

        driver.navigate().back();

        WebElement clicktisort = driver.findElement(By.xpath("//*[@data-test='item-1-title-link']/div"));
        clicktisort.click();
       Myfunction.Bekle(2);

        WebElement add2 = driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));
        add2.click();
        Myfunction.Bekle(2);

        WebElement sepet = driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));
        sepet.click();
        Myfunction.Bekle(2);

        WebElement checkout = driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium checkout_button ']"));
        checkout.click();
        Myfunction.Bekle(2);

        WebElement firtname = driver.findElement(By.xpath("//div[@class='form_group']/input[@class='input_error form_input' and @id='first-name']"));
        firtname.sendKeys("yusuf");
        Myfunction.Bekle(2);

        WebElement lastname = driver.findElement(By.xpath("//input[@class='input_error form_input' and @placeholder='Last Name']"));
        lastname.sendKeys("ucucu");
        Myfunction.Bekle(2);

        WebElement postcode = driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']"));
        postcode.sendKeys("ct93yh");
        Myfunction.Bekle(2);

        WebElement continue1=driver.findElement(By.xpath("//input[@class='submit-button btn btn_primary cart_button btn_action' and @id='continue']"));
        continue1.click();
        Myfunction.Bekle(2);



        BekleKapat();

    }
}
