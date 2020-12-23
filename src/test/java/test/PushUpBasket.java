package test;

import org.openqa.selenium.WebElement;
import page.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.ProductPage;

import java.util.List;

public class PushUpBasket extends CommonConditions{
    @Test
    public void checkSearchOfOutventureJacketResultsTest() {
        String url = "https://pudra.by/catalog/body/nyou/podarochnyj-nabor-nyou-s-ekstraktom-guarany";

        WebElement pushUpHeaderForBasket = new ProductPage(driver, url)
                .openPage()
                .clickOnAddToBasketLink()
                .getPopupWindowHeader();

        Assert.assertTrue(pushUpHeaderForBasket.getAttribute("text").contains("Товар добавлен в Вашу корзину"));
    }
}
