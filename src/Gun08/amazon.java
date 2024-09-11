package Gun08;

import Utility.Myfunction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazon {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com.tr/");
        Myfunction.Bekle(5);

        WebElement nutella=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        nutella.sendKeys("nuttela");
        Myfunction.Bekle(3);

        WebElement click=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        click.click();
        System.out.println(click.getText());

        Myfunction.Bekle(4);
        driver.quit();

    }
}
