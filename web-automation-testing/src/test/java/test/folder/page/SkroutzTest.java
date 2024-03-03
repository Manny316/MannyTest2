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


import java.time.Duration;

public class SkroutzTest extends TestBase {
    WebDriver driver;
    WebDriverWait wait;

//    @BeforeClass()
//    public void openBrowser() throws InterruptedException {
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        Thread.sleep(1000);
//        driver.navigate().to("https://www.skroutz.gr/");
//        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//    }

    @BeforeClass(alwaysRun = true)
    public void initEnv() {
        driver = WebDriverFactory.getDriver();
        wait = WebDriverFactory.getWait();

    }

    @Test(alwaysRun = true,priority = 2)
    public void skroutzTest(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(.,'Συμφωνώ')]")));
        driver.findElement(By.xpath("//button[contains(.,'Συμφωνώ')]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='search']")));
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("iphone13");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='icon filter-option                                                  filter-checkbox'])[29]")));
        driver.findElement(By.xpath("(//a[@class='icon filter-option                                                  filter-checkbox'])[29]")).click();

    }

//    @AfterClass(alwaysRun = true)
//    public void closeBrowser(){
//        driver1.close();
//    }
}


