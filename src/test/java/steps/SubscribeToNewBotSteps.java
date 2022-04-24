package steps;


import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;

import static steps.PageInitializer.*;

public class SubscribeToNewBotSteps {
    @Then("Click on the robot head icon from left navigation panel")
    public void click_on_the_robot_head_icon_from_left_navigation_panel() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(dashboardPage.botIcon));
        dashboardPage.botIcon.click();
        Assert.assertEquals("Bots | Stacked", Driver.getDriver().getTitle());
    }

    @Then("Click on the Bots tab")
    public void click_on_the_Bots_tab() {
        botsPage.botsTab.click();
        Assert.assertEquals("Bots | Stacked",Driver.getDriver().getTitle());
    }

    @Then("Click on any Bot")
    public void click_on_any_Bot() {
        botsPage.stackedAutomatedTestBot.click();
        Assert.assertEquals("Stacked Automated Test Bot | Stacked",Driver.getDriver().getTitle());
    }

    @Then("Click the purchase button")
    public void click_the_purchase_button() {
        stackedAutomatedTestBotPage.purchaseButton.click();

    }

    @Then("Fill all required fields")
    public void fill_all_required_fields() {

    }

    @Then("Click the subscribe button")
    public void click_the_subscribe_button() {

    }

    @Then("Return To the Stacked site")
    public void return_To_the_Stacked_site() {

    }
}
