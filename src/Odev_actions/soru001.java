package Odev_actions;

import Utility.BaseDriver;
import Utility.Myfunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class soru001 extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");
        Myfunction.Bekle(5);

        //sehirler
        WebElement oslo = driver.findElement(By.id("a1"));
        WebElement rome = driver.findElement(By.id("a10"));
        WebElement madrid = driver.findElement(By.id("a6"));
        WebElement nairobi = driver.findElement(By.id("a13"));
        WebElement santiago = driver.findElement(By.id("a11"));
        WebElement stockholm = driver.findElement(By.id("a2"));
        WebElement hanoi = driver.findElement(By.id("a15"));
        WebElement washington = driver.findElement(By.id("a4"));
        WebElement london = driver.findElement(By.id("a8"));
        WebElement paris = driver.findElement(By.id("a5"));
        WebElement kualalumpur = driver.findElement(By.id("a14"));
        WebElement copenhagen = driver.findElement(By.id("a3"));
        WebElement athens = driver.findElement(By.id("a7"));
        WebElement newdelhi = driver.findElement(By.id("a12"));
        WebElement vienna = driver.findElement(By.id("a9"));


        //ulkeler
        WebElement greece = driver.findElement(By.id("q7"));
        WebElement denmak = driver.findElement(By.id("q3"));
        WebElement sweden = driver.findElement(By.id("q2"));
        WebElement malaysia = driver.findElement(By.id("q14"));
        WebElement norway = driver.findElement(By.id("q1"));
        WebElement italy = driver.findElement(By.id("q10"));
        WebElement vietnam = driver.findElement(By.id("q15"));
        WebElement france = driver.findElement(By.id("q5"));
        WebElement kenya = driver.findElement(By.id("q13"));
        WebElement chile = driver.findElement(By.id("q11"));
        WebElement india = driver.findElement(By.id("q12"));
        WebElement unutedkingdim = driver.findElement(By.id("q8"));
        WebElement austria = driver.findElement(By.id("q9"));
        WebElement unitedstates = driver.findElement(By.id("q4"));
        WebElement spain = driver.findElement(By.id("q6"));

        Actions aksiyonlar = new Actions(driver);

        aksiyonlar.clickAndHold(oslo).build().perform();
        aksiyonlar.moveToElement(norway).release().build().perform();

        aksiyonlar.clickAndHold(rome)
                .build().perform();
        aksiyonlar.moveToElement(italy)
                .release().build().perform();

        aksiyonlar.clickAndHold(madrid)
                .build().perform();
        aksiyonlar.moveToElement(spain)
                .release().build().perform();


        aksiyonlar.clickAndHold(nairobi)
                .build().perform();
        aksiyonlar.moveToElement(kenya)
                .release().build().perform();


        aksiyonlar.clickAndHold(santiago)
                .build().perform();
        aksiyonlar.moveToElement(chile)
                .release().build().perform();


        aksiyonlar.clickAndHold(stockholm)
                .build().perform();
        aksiyonlar.moveToElement(sweden)
                .release().build().perform();


        aksiyonlar.clickAndHold(hanoi)
                .build().perform();
        aksiyonlar.moveToElement(vietnam)
                .release().build().perform();


        aksiyonlar.clickAndHold(washington)
                .build().perform();
        aksiyonlar.moveToElement(unitedstates)
                .release().build().perform();


        aksiyonlar.clickAndHold(london)
                .build().perform();
        aksiyonlar.moveToElement(unutedkingdim)
                .release().build().perform();


        aksiyonlar.clickAndHold(paris)
                .build().perform();
        aksiyonlar.moveToElement(france)
                .release().build().perform();


        aksiyonlar.clickAndHold(kualalumpur)
                .build().perform();
        aksiyonlar.moveToElement(malaysia)
                .release().build().perform();


        aksiyonlar.clickAndHold(copenhagen)
                .build().perform();
        aksiyonlar.moveToElement(denmak)
                .release().build().perform();


        aksiyonlar.clickAndHold(athens)
                .build().perform();
        aksiyonlar.moveToElement(greece)
                .release().build().perform();


        aksiyonlar.clickAndHold(newdelhi)
                .build().perform();
        aksiyonlar.moveToElement(india)
                .release().build().perform();


        aksiyonlar.clickAndHold(vienna)
                .build().perform();
        aksiyonlar.moveToElement(austria)
                .release().build().perform();

        Myfunction.Bekle(4);
        driver.quit();


    }
}
