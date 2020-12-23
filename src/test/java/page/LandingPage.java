package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class LandingPage extends AbstractPage {
    @FindBy(xpath = "//a[@class='i-gift'][contains(text(), 'АКЦИИ')]")
    private WebElement linkToPromotions;

    @FindBy(xpath = "//a[@class='i-sale'][contains(text(), 'СКИДКИ')]")
    private WebElement linkToSales;

    @FindBy(xpath = "//a[@href='/discount'][contains(text(), 'Система скидок')]")
    private WebElement salesCategory;

    @FindBy(xpath = "//a[@href='#modalQuick']")
    private WebElement fastBye;

    @FindBy(xpath = "//a[@href='/brand'][contains(text(), 'БРЕНДЫ')]")
    private WebElement BrandsLink;

    @FindBy(xpath = "//input[@name='fnameReceiptGoods']")
    private WebElement inputForFastBye;

    @FindBy(xpath = "//span[@class='catalog-brands-name'][contains(text(), 'AA')]")
    private WebElement aaBrand;

    @FindBy(xpath = "//span[@class='modal-goods-content-name']")
    private WebElement existedItem;

    @FindBy(xpath = "//a[@href='/catalog/for-men'][contains(text(), 'AA')]")
    private WebElement menuItemForMan;

    @FindBy(xpath = "//h1[@class='b-title'][contains(text(), 'ДЛЯ МУЖЧИН')]")
    private WebElement headerMenuItemForMan;


    public LandingPage(WebDriver driver, String url) {
        super(driver, url);
    }

    public LandingPage openPage() {
        driver.get(url);
        logger.info("opened page with address: " + url);

        return this;
    }

    public LandingPage clickOnSales() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", linkToSales);
        return this;
    }

    public LandingPage clickOnBrands() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", BrandsLink);
        return this;
    }

    public LandingPage clickOnFastBye() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", fastBye);
        return this;
    }

    public LandingPage checkInputForFastBye(String item) {
        inputForFastBye.sendKeys(item);
        logger.info("input existed item");
        return this;
    }

    public LandingPage clickOnMenuItem(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", menuItemForMan);
        return this;
    }

    public WebElement getAaBrand() {
        return aaBrand;
    }

    public WebElement getSalesPage() {
        return salesCategory;
    }

    public WebElement getExistedItem() { return  existedItem; }

    public WebElement getHeaderMenuItemForMan() {
        return headerMenuItemForMan;
    }
}
