package steps;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.io.IOException;

import static steps.PageInitializer.dashboardPage;
import static steps.PageInitializer.stakingPage;
import static utils.CommonMethods.takeScreenshot;
import static utils.CommonMethods.waitForVisibility;

public class StakingPageSteps {
    @When("a user is on the dashboard and clicks the Staking tab")
    public void a_user_is_on_the_dashboard_and_clicks_the_Staking_tab() {
        waitForVisibility(dashboardPage.stakingTab);
        dashboardPage.stakingTab.click();
    }

    @Then("an empty Staking tab state and the {string} button displays")
    public void an_empty_Staking_tab_state_and_the_button_displays(String exploreStakingButton) throws IOException {
        waitForVisibility(stakingPage.exploreStakingButton);
        takeScreenshot("STK_2363/2474_EmptyStakingState");
        Assert.assertEquals(exploreStakingButton,stakingPage.exploreStakingButton.getText().trim());
    }

    @When("a user clicks the Explore Staking button")
    public void a_user_clicks_the_Explore_Staking_button() {
        stakingPage.exploreStakingButton.click();
    }

    @Then("the staking tab of the market place is opened and the {string} button displays")
    public void the_staking_tab_of_the_market_place_is_opened_and_the_button_displays(String connectFTXExchangeButton) throws IOException {
        waitForVisibility(stakingPage.connectFTXExchangeButton);
        takeScreenshot("STK_2363/2474_StakingTabInMarketPlace");
        Assert.assertEquals(connectFTXExchangeButton,stakingPage.connectFTXExchangeButton.getText().trim());
    }
}
