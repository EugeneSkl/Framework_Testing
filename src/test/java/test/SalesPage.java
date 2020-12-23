package test;

import org.openqa.selenium.WebElement;
import page.GiftCardPage;
import page.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class SalesPage extends CommonConditions{
    @Test
    public void addSneakersToBasketListTest() {
        String url = "https://pudra.by/gift-card/";

        WebElement actualResults = new GiftCardPage(driver, url)
                .openPage()
                .checkInadmissableSum("100")
                .getLabelForMistake();

        Assert.assertTrue(actualResults.getAttribute("text").contains("Минимальная сумма - 30 BYN"));
    }
}
