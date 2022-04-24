package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class SeeAllExchangesPage {
    public SeeAllExchangesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"mainMenu\"]/div/a[1]/button")
    public WebElement dashboardButton;

    @FindBy(xpath = "//a[@href='/wizard']//button[@type='button']//span")
    public WebElement addExchangeButton;

    @FindBy(xpath = "//div[@role='document']//button[2]")
    public WebElement remindMeLaterButton;

    /**__________ All Exchanges __________*/

    @FindBy(xpath ="//div[contains(text(), 'AAX')]")
    public WebElement aaxExchangeButton;

    @FindBy(xpath = "//div[contains(text(), 'AscendEX Futures')]")
    public WebElement ascendEXFuturesExchangeButton;

    @FindBy(xpath = "//div[contains(text(), 'Binance')]")
    public WebElement binanceExchangeButton;

    @FindBy(xpath = "//div[contains(text(), 'Binance Futures')]")
    public WebElement binanceFuturesExchangeButton;

    @FindBy(xpath = "//div[contains(text(), 'Bitfinex')]")
    public WebElement bitfinexExchangeButton;

    @FindBy(xpath = "//div[contains(text(), 'BitMEX')]")
    public WebElement bitMEXExchangeButton;

    @FindBy(xpath = "//div[contains(text(), 'ByBit')]")
    public WebElement byBitExchangeButton;

    @FindBy(xpath = "//div[contains(text(), 'Coinbase')]")
    public WebElement coinbaseExchangeButton;

    @FindBy(xpath = "//div[contains(text(), 'FTX')]")
    public WebElement ftxExchangeButton;

    @FindBy(xpath = "//div[contains(text(), 'FTX US')]")
    public WebElement ftxUSExchangeButton;

    @FindBy(xpath = "//div[contains(text(), 'KuCoin')]")
    public WebElement kuCoinExchangeButton;

    @FindBy(xpath = "//div[contains(text(), 'Phemex')]")
    public WebElement phemexExchangeButton;


}
