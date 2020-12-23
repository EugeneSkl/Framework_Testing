package test;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.LandingPage;

public class OpenSalesLinkTest extends CommonConditions{
    @Test
    public void openSales() {
        String url = "https://pudra.by/";

        WebElement keywordsMetaTag = new LandingPage(driver, url)
                .openPage()
                .clickOnSales()
                .getSalesPage();

        Assert.assertTrue(keywordsMetaTag.getAttribute("text").contains("Система скидок"));
    }
}
