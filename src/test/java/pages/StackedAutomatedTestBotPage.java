package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class StackedAutomatedTestBotPage {
   public StackedAutomatedTestBotPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.=\" Purchase \"]")
    public WebElement purchaseButton;
}
