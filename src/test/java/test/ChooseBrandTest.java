package test;

import org.openqa.selenium.WebElement;
import page.GiftCardPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.LandingPage;

public class ChooseBrandTest extends CommonConditions{
    @Test
    public void chooseBrand() {
        String url = "https://pudra.by/";

        WebElement keywordsMetaTag = new LandingPage(driver, url)
                .openPage()
                .clickOnBrands()
                .getAaBrand();
        Assert.assertTrue(keywordsMetaTag.getAttribute("text").contains("AA"));
    }
}
