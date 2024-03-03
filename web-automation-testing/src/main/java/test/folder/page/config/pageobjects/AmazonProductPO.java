package test.folder.page.config.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.folder.page.config.WebDriverFactory;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AmazonProductPO {
//    final String productBrand = "//span[contains(@id,'productTitle')]";
    final String screenSize = "//tr[@class='a-spacing-small po-display.size']";
    final String screenSizeValue = "Screen Size 40 Inches";
    final String brandName = "//tr[@class='a-spacing-small po-brand']";
    final String brandNameValue = "Brand Hisense";


    WebDriver driver = WebDriverFactory.getDriver();
    WebDriverWait wait =WebDriverFactory.getWait();


    public String getScreenSize(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(screenSize)));
        return driver.findElement(By.xpath(screenSize)).getText();
    }

    public  String getBrandName(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(brandName)));
        return driver.findElement(By.xpath(brandName)).getText();
    }

    public void verifyScreenSize(){
        assertEquals (getScreenSize(),(screenSizeValue));
    }

    public void verifyBrandName(){
        assertEquals (getBrandName(),(brandNameValue));
    }

}
