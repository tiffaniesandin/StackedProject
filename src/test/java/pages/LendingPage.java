package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class LendingPage {
    public LendingPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//a[@href='/strategies/lending']")
    public WebElement exploreLendingButton;

    @FindBy(xpath="//div[contains(@class, \"coin-wrapper coin-wrapper\")]")
    public List<WebElement> listOfCoinIcons;

    @FindBy(xpath="//div[@class=\"available-coins\"]//div[@class=\"icon-wrap icon-rounded\"]")
    public List<WebElement> listOfCoinIconText;

    @FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]")
    public WebElement connectFTXExchangeButton;
}
