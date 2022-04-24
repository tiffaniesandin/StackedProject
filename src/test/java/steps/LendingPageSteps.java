package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.Driver;
import utils.JavascriptUtils;
import static steps.PageInitializer.*;
import java.io.IOException;

import static utils.CommonMethods.takeScreenshot;
import static utils.CommonMethods.waitForVisibility;

public class LendingPageSteps {
    @When("a user is on the dashboard and clicks the Lending tab")
    public void a_user_is_on_the_dashboard_and_clicks_the_Lending_tab() {
        waitForVisibility(dashboardPage.lendingTab);
        dashboardPage.lendingTab.click();
    }

    @Then("an empty Lending tab state, an array of coins and an {string} button displays")
    public void an_empty_Lending_tab_state_an_array_of_coins_and_an_button_displays(String exploreLendingButton) throws InterruptedException, IOException {
        waitForVisibility(lendingPage.exploreLendingButton);
        takeScreenshot("STK_2363/2472_LendingPageTab");
        Assert.assertEquals(exploreLendingButton,lendingPage.exploreLendingButton.getText().trim());
    }

    @When("a user hovers on a coin, it's icon becomes larger and shows the current APY% that the coin has available on FTX")
    public void a_user_hovers_on_a_coin_it_s_icon_becomes_larger_and_shows_the_current_APY_that_the_coin_has_available_on_FTX() throws IOException {
        Actions action = new Actions(Driver.getDriver());
        int firstCoinCount = 0;
        int lastCoinCount = lendingPage.listOfCoinIcons.size();
        System.out.println("------------------LIST OF LENDING COIN APIS------------------");
        for(WebElement coin: lendingPage.listOfCoinIcons){
            JavascriptUtils.jsScrollIntoView(coin);
            action.moveToElement(coin).perform();
            System.out.println(coin.getText());
            firstCoinCount++;
            //taking 2 screenshots of all lending coins
            if(firstCoinCount==1){
                JavascriptUtils.jsScrollIntoView(coin);
                takeScreenshot("STK_2363/2473_TopRowOfLendingCoins");
            }
            if(firstCoinCount==lastCoinCount){
                JavascriptUtils.jsScrollIntoView(coin);
                takeScreenshot("STK_2363/2473_BottomRowOfLendingCoins");
            }
        }
    }

    @When("a user clicks on the Explore Lending button")
    public void a_user_clicks_on_the_Explore_Lending_button() {
        JavascriptUtils.jsScrollIntoView(lendingPage.exploreLendingButton);
        lendingPage.exploreLendingButton.click();
    }

    @Then("the lending tab of the market place is opened and the {string} button displays")
    public void the_lending_tab_of_the_market_place_is_opened_and_the_button_displays(String connectFTXExchange) {
        waitForVisibility(lendingPage.connectFTXExchangeButton);
        Assert.assertEquals(connectFTXExchange,lendingPage.connectFTXExchangeButton.getText().trim());
    }
}
