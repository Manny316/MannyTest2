package test.folder.page.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class TestBase {

    @BeforeClass
    @Parameters({"url","timeout.duration"})
    public void openBrowser(String url,String timeout){
        WebDriver driver  = new ChromeDriver();
        WebDriverFactory.setDriver(driver);
        driver.manage().window().maximize();
        driver.navigate().to(url);
        WebDriverFactory.setWait(new WebDriverWait(driver , Duration.ofSeconds(Integer.parseInt(timeout))));
    }

    @AfterClass(alwaysRun = true)
    public void close(){
        WebDriverFactory.getDriver().close();
    }
}
