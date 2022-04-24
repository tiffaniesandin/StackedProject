package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class BotsPage {

    public BotsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.=\" Bots \"]")
    public WebElement botsTab;

    @FindBy(xpath = "//div[.=\" Stacked Automated Test Bot \"]")
    public WebElement stackedAutomatedTestBot;
}
