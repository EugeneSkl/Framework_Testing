package test;

import org.openqa.selenium.WebElement;
import page.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExistedItemInFastByeTest extends CommonConditions{
    @Test
    public void inputExistedItemInFastBye() {
        String url = "https://pudra.by/";

        WebElement existedItem = new LandingPage(driver, url)
                .openPage()
                .clickOnFastBye()
                .checkInputForFastBye("Подарочный набор с экстрактом гуараны Sweet")
                .getExistedItem();
        Assert.assertTrue(existedItem.getAttribute("text").contains("Подарочный набор с экстрактом гуараны Sweet"));
    }
}
