package test.folder.page.config.business.object;

import test.folder.page.config.pageobjects.AmazonHomePO;
import test.folder.page.config.pageobjects.AmazonProductPO;
import test.folder.page.config.pageobjects.AmazonResultsPO;

public class AmazonBO {

    AmazonHomePO amazonHomePO = new AmazonHomePO();
    AmazonResultsPO amazonResultsPO = new AmazonResultsPO();
    AmazonProductPO amazonProductPO = new AmazonProductPO();

    public void searchProductAndClickSearch(){
        amazonHomePO.setSearchBarInput();
        amazonHomePO.clickSearchButton();
    }

    public void chooseThirdItem(){
        amazonResultsPO.clickThirdProduct();
    }

    public void verifyScreenSizeBO(){
        amazonProductPO.verifyScreenSize();
    }

    public void verifyBrandNameBO(){
        amazonProductPO.verifyBrandName();
    }
}
