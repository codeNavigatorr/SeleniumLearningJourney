package Odev_actions;

import Utility.BaseDriver;
import Utility.Myfunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class soru002 extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");
        Myfunction.Bekle(10);


        //students
        WebElement std1 = driver.findElement(By.xpath("//li[text()='Student A']"));
        WebElement std2 = driver.findElement(By.xpath("//li[text()='Student B']"));
        WebElement std3 = driver.findElement(By.xpath("//li[text()='Student C']"));
        WebElement std4 = driver.findElement(By.xpath("//li[text()='Student D']"));
        WebElement std5 = driver.findElement(By.xpath("//li[text()='Student E']"));
        WebElement std6 = driver.findElement(By.xpath("//li[text()='Student F']"));
        WebElement std7 = driver.findElement(By.xpath("//li[text()='Student G']"));
        WebElement std8 = driver.findElement(By.xpath("//li[text()='Student H']"));
        WebElement std9 = driver.findElement(By.xpath("//li[t ext()='Student I']"));
        WebElement std10 = driver.findElement(By.xpath("//li[text()='Student J']"));
        WebElement std111 = driver.findElement(By.xpath("//li[text()='Student K']"));
        WebElement std12 = driver.findElement(By.xpath("//li[text()='Student L']"));
        WebElement std13 = driver.findElement(By.xpath("//li[text()='Student M']"));
        WebElement std14 = driver.findElement(By.xpath("//li[text()='Student N']"));
        WebElement std15 = driver.findElement(By.xpath("//li[text()='Student O']"));
        WebElement std16 = driver.findElement(By.xpath("//li[text()='Student P']"));
        WebElement std17 = driver.findElement(By.xpath("//li[text()='Student Q']"));
        WebElement std18 = driver.findElement(By.xpath("//li[text()='Student R']"));
        WebElement std19 = driver.findElement(By.xpath("//li[text()='Student S']"));
        WebElement std20 = driver.findElement(By.xpath("//li[text()='Student T']"));
        WebElement std21 = driver.findElement(By.xpath("//li[text()='Student U']"));

        //teams
        WebElement teama = driver.findElement(By.id("box1"));
        WebElement teamb = driver.findElement(By.id("box2"));
        WebElement teamc = driver.findElement(By.id("box3"));
        WebElement teamd = driver.findElement(By.id("box4"));
        WebElement teame = driver.findElement(By.id("box5"));

        Actions aksiyonlar=new Actions(driver);

        BekleKapat();


    }
}
