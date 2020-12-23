package page;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GiftCardPage extends AbstractPage {
    @FindBy(xpath = "//input[@class='form-control']")
    private WebElement salesInput;

    @FindBy(xpath = "//button[@class='btn-pink'][contains(text(), 'КУПИТЬ')]")
    private WebElement byeButton;

    @FindBy(xpath = "//label[@class='error']")
    private WebElement labelForMistake;


    public GiftCardPage(WebDriver driver, String url) {
        super(driver, url);
    }

    public GiftCardPage openPage() {
        driver.get(url);
        logger.info("opened page with address: " + url);
        return this;
    }

    public GiftCardPage checkInadmissableSum(String sum) {
        salesInput.sendKeys(sum);
        clickOn(byeButton);
        logger.info("sent sum which is lower than limit");
        return this;
    }

    public WebElement getLabelForMistake() {
        return labelForMistake;
    }
}
