package test.folder.page.config.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.folder.page.config.WebDriverFactory;

public class AmazonResultsPO {
    final String thirdProduct = "(//span[contains(@class,'a-size-medium a-color-base a-text-normal')])[3]";
    WebDriver driver = WebDriverFactory.getDriver();
    WebDriverWait wait =WebDriverFactory.getWait();

    public void clickThirdProduct(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(thirdProduct)));
        driver.findElement(By.xpath(thirdProduct)).click();
    }
}
