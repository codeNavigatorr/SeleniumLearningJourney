package Gun12;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _03_soru extends BaseDriver {
    @Test
    public void Test()
    {
        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");


        WebElement placeholder=driver.findElement(By.xpath("//div[text()='Placeholder']"));
        System.out.println(placeholder.getText());


    driver.switchTo().frame(0);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='checkbox']")));
    WebElement scroo1=driver.findElement(By.xpath("//input[@type='checkbox']"));
    new Actions(driver)
            .scrollToElement(scroo1)
            .build()
            .perform();

        WebElement click=driver.findElement(By.xpath("//input[@type='checkbox']"));
        click.click();


        WebElement txt1=driver.findElement(By.xpath("//td[text()='First row']"));
        System.out.println(txt1.getText());


        driver.switchTo().parentFrame();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//footer[text()='IFrame Above']")));
        WebElement scroll2=driver.findElement(By.xpath("//footer[text()='IFrame Above']"));
        new Actions(driver)
                .scrollToElement(scroll2)
                .build()
                .perform();
        WebElement frame=driver.findElement(By.xpath("//footer[text()='IFrame Above']"));
        System.out.println(frame.getText());
        Assert.assertTrue("Yaziya ulasilmadi",frame.getText().equals("IFrame Above"));
        BekleKapat();

}}


