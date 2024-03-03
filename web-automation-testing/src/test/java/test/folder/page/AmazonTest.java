package test.folder.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import test.folder.page.config.TestBase;
import test.folder.page.config.WebDriverFactory;
import test.folder.page.config.business.object.AmazonBO;

import java.time.Duration;

import static org.testng.Assert.*;

public class AmazonTest extends TestBase {
    WebDriver driver;
    WebDriverWait wait;

    AmazonBO amazonBO;

    @BeforeClass(alwaysRun = true)
    public void initEnv() {
        driver = WebDriverFactory.getDriver();
        wait = WebDriverFactory.getWait();
        amazonBO = new AmazonBO();
    }

    @Test(alwaysRun = true, priority = 1)
    public void amazonTest() throws InterruptedException {
        amazonBO.searchProductAndClickSearch();
        amazonBO.chooseThirdItem();
        amazonBO.verifyScreenSizeBO();
        amazonBO.verifyBrandNameBO();
    }
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@aria-label,'Search Amazon')]")));
//        driver.findElement(By.xpath("//input[contains(@aria-label,'Search Amazon')]")).sendKeys("lg tv 65");
//
//        driver.findElement(By.xpath("//input[contains(@value,'Go')]")).click();
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(@class,'a-size-medium a-color-base a-text-normal')])[3]")));
//        driver.findElement(By.xpath("(//span[contains(@class,'a-size-medium a-color-base a-text-normal')])[3]")).click();
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@id,'productTitle')]")));
//
//        Thread.sleep(2000);
//        String text = driver.findElement(By.xpath("//tr[@class='a-spacing-small po-display.size']")).getText();
//        assertTrue(text.contains("Screen Size 65 Inches"));
//
//        String text1 = driver.findElement(By.xpath("//tr[@class='a-spacing-small po-brand']")).getText();
//        assertTrue(text1.contains("Brand LG"));
//    }
}
