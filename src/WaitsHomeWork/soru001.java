package WaitsHomeWork;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class soru001 extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("page-top")));
        WebElement scrool = driver.findElement(By.id("page-top"));
        new Actions(driver)
                .scrollToElement(scrool)
                .build()
                .perform();
        for (int i = 0; i < 5; i++) {
            int randomNumber1 = (int) (Math.random() * 100);
            int randomNumber2 = (int) (Math.random() * 100);

            WebElement firstNumber = driver.findElement(By.id("number1Field"));
            firstNumber.clear();
            firstNumber.sendKeys(String.valueOf(randomNumber1));

            WebElement secondNumber = driver.findElement(By.id("number2Field"));
            secondNumber.clear();
            secondNumber.sendKeys(String.valueOf(randomNumber2));

            WebElement operation = driver.findElement(By.id("selectOperationDropdown"));
            Select menu1 = new Select(operation);
            menu1.selectByValue("1");
             wait.until(ExpectedConditions.elementToBeClickable(By.id("calculateButton")));
            WebElement calculatte = driver.findElement(By.id("calculateButton"));
            calculatte.click();

            WebElement answer = driver.findElement(By.id("numberAnswerField"));
            System.out.println("Islem Sonucu = " + answer.getText());

            WebElement clear = driver.findElement(By.id("page-top"));
            clear.click();
           // driver.navigate().refresh();
            wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("numberAnswerField"), "0"));


        }
            BekleKapat();


    }
}
