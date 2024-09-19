package Gun11;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class _05_soru extends BaseDriver {
    @Test
    public void Test()
    {
 driver.get("https://www.google.com/");


        WebElement ara=driver.findElement(By.id("APjFqb"));
        new Actions(driver)
                .moveToElement(ara)
                .sendKeys("selenium")
                .sendKeys(Keys.ENTER)
                .build()
                .perform();
        wait.until(ExpectedConditions.urlContains("https://www.google.com/search?q=selenium&sca_esv=2f2828b3b0e1cf18&sca_upv=1&source=hp&ei=I3voZp7lNtOQxc8Pxcza0AY&iflsig=AL9hbdgAAAAAZuiJM40VMayuKiOvX1v6ytzwr9jmMrs_&ved=0ahUKEwjeguKHjsiIAxVTSPEDHUWmFmoQ4dUDCBY&uact=5&oq=selenium&gs_lp=Egdnd3Mtd2l6GgIYAyIIc2VsZW5pdW0yERAuGIAEGMcBGJgFGJkFGK8BMggQABiABBixAzIFEAAYgAQyCxAuGIAEGMcBGK8BMgUQABiABDIFEAAYgAQyCBAAGIAEGIsDMggQABiABBiLAzILEC4YgAQYxwEYrwEyCBAAGIAEGIsDSIb8DFDj5gxYivcMcAd4AJABAJgBqAGgAd0IqgEDMC44uAEDyAEA-AEBmAIPoALzCKgCCsICEBAAGAMY5QIY6gIYjAMYjwHCAhAQLhgDGOUCGOoCGIwDGI8BwgIXEAAYgAQYsQMYgwEYpgMY-AUYqAMYiwPCAhcQLhiABBixAxiDARimAxioAxiLAxibA8ICCxAAGIAEGLEDGIMBwgIOEAAYgAQYsQMYgwEYigXCAgQQABgDwgIFEC4YgATCAg4QABiABBixAxiDARiLA8ICCBAuGIAEGLEDwgIREC4YgAQYsQMY0QMYgwEYxwHCAgsQLhiABBixAxiDAcICFBAuGIAEGLEDGNEDGIMBGMcBGIoFwgIUEC4YgAQYsQMYqAMYmAMYmgMYiwPCAgsQABiABBixAxiLA8ICGhAuGIAEGKYDGMcBGJgFGKgDGJkFGIsDGK8BwgIUEC4YgAQYpgMYxwEYqAMYiwMYrwHCAhoQLhiABBimAxjHARiYBRioAxiaBRiLAxivAcICFxAuGIAEGLEDGIMBGKgDGIoFGIsDGO4FmAMEkgcDNy44oAfecw&sclient=gws-wiz"));
        WebElement selenium=driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
        selenium.click();



    }
}
