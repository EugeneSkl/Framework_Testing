package test;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.LandingPage;

public class CheckLinkMenuItems extends CommonConditions{
    @Test
    public void sendFeedbackWithNotAllObligatoryFieldsFilledTest() {
        String url = "https://pudra.by/";

        WebElement headerMenuItemForMan = new LandingPage(driver, url)
                .openPage()
                .clickOnMenuItem()
                .getHeaderMenuItemForMan();

        Assert.assertTrue(headerMenuItemForMan.getAttribute("text").contains("ДЛЯ МУЖЧИН "));
    }
}
