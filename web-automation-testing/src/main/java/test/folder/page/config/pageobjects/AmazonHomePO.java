package test.folder.page.config.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.folder.page.config.WebDriverFactory;

public class AmazonHomePO {
    final String searchBarInput = "//input[contains(@aria-label,'Search Amazon')]";
    final String searchButton = "//input[contains(@value,'Go')]";
    final String searchProduct = "lg tv 65";

    WebDriver driver = WebDriverFactory.getDriver();
    WebDriverWait wait =WebDriverFactory.getWait();

    public void setSearchBarInput(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(searchBarInput)));
        driver.findElement(By.xpath(searchBarInput)).sendKeys(searchProduct);

    }

    public void clickSearchButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(searchButton)));
        driver.findElement(By.xpath(searchButton)).click();
    }

}
