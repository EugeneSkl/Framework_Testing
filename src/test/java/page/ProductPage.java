package page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import util.StringUtils;

import java.util.Arrays;
import java.util.List;

public class ProductPage extends AbstractPage {
    @FindBy(xpath = "//button[text()='В КОРЗИНУ']")
    private WebElement addToBasketLink;

    @FindBy(xpath = "//h3[text()'Товар добавлен в Вашу корзину']")
    private WebElement popupWindowHeader;

    public ProductPage(WebDriver driver, String url) {
        super(driver, url);
    }

    public ProductPage openPage() {
        driver.get(url);
        logger.info("opened page with address: " + url);

        return this;
    }

    public ProductPage clickOnAddToBasketLink() {
        clickOn(addToBasketLink);
        logger.info("clicked on addToBasket link");

        return this;
    }


    public WebElement getPopupWindowHeader() {
        return popupWindowHeader;
    }
}
