package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.lang.ArrayUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.Driver;
import utils.JavascriptUtils;
import java.io.IOException;
import java.util.Arrays;
import static steps.PageInitializer.dashboardPage;
import static steps.PageInitializer.stacksPage;
import static utils.CommonMethods.takeScreenshot;
import static utils.CommonMethods.waitForVisibility;


public class StacksPageSteps {
    //static data collections used for access throughout methods in this class
    public static double[] highestToLowestStacks = new double[dashboardPage.listOfStacks.size()];

    @When("a user is on the dashboard and clicks the Stacks tab")
    public void a_user_is_on_the_dashboard_and_clicks_the_Stacks_tab() {
        dashboardPage.stacksTab.click();
    }

    @Then("the Stacks tab is empty and the {string} button displays")
    public void the_Stacks_tab_is_empty_and_the_button_displays(String exploreStacksButton) throws IOException, InterruptedException {
        Thread.sleep(1000);
        takeScreenshot("STK_2363/2472_EmptyStacksTab");
        Assert.assertEquals(exploreStacksButton,dashboardPage.exploreStacksButton.getText().trim());
    }

    @Then("a static list of cards at the bottom of the Stacks tab displays the top seven stacks")
    public void a_static_list_of_cards_at_the_bottom_of_the_Stacks_tab_displays_the_top_seven_stacks() throws IOException, InterruptedException {
        int stacksCount = 0;
        String value1="";
        String value2="";
        String value3="";

        System.out.println("------------------TOP STACKS LIST ON DASHBOARD PAGE STACKS TAB------------------");
        //iterating through the list of stacks, taking a screenshot and printing the stack name
        for (WebElement stacks : dashboardPage.listOfStacks) {
            stacksCount++;
            waitForVisibility(stacks);
            JavascriptUtils.jsScrollIntoView(stacks);
            //printing stack to console
            System.out.print("\nStack " + stacksCount + " = " + stacks.getText().trim() + "\n");
            //retrieving double value of pnl from stack card text
            value1 = stacks.getText().trim();
            StringBuilder sb1 = new StringBuilder(value1);
            sb1.reverse();
            value2=sb1.substring(1,6);
            StringBuilder sb2 = new StringBuilder(value2);
            value3= String.valueOf(sb2.reverse());
            double pnlValue = Double.parseDouble(value3);
            highestToLowestStacks[stacksCount - 1] = pnlValue;
            //taking 2 screen shots to view all cards
            if (stacksCount == 1) {
                takeScreenshot("STK_2363/2472_Stacks_" + stacksCount+"-3");
            }
            if (stacksCount == 7) {
                takeScreenshot("STK_2363/2472_Stacks_4-" + stacksCount);
            }
        }
    }
    @Then("the Stack cards are listed left-to-right by highest PnL for the selected time period")
    public void the_Stack_cards_are_listed_left_to_right_by_highest_PnL_for_the_selected_time_period() throws IOException, InterruptedException {
        System.out.println("------------------PNL VALUES LARGEST TO SMALLEST------------------");
        System.out.println("\nCompare with printed values from Top Stacks to verify Stack cards are listed left-to-right by highest PnL.\n");
        int stacksCounted = 1;
        Arrays.sort(highestToLowestStacks);
        ArrayUtils.reverse(highestToLowestStacks);
        for(double highLowPnl: highestToLowestStacks){
            System.out.print(stacksCounted+". "+highLowPnl+"\n");
            stacksCounted++;
        }
        System.out.println();
    }

    @Then("a hover shadow is captured in screenshot when a user hovers over a Stack")
    public void a_hover_shadow_is_captured_in_screenshot_when_a_user_hovers_over_a_Stack() throws IOException, InterruptedException {
        Thread.sleep(1000);
        Actions action = new Actions(Driver.getDriver());
        JavascriptUtils.jsScrollIntoView(stacksPage.secondStackCard);
        action.moveToElement(stacksPage.secondStackCard).perform();
        takeScreenshot("STK_2363/2472_HoverShadowOnStack");
        action.moveToElement(stacksPage.secondStackCard).perform();
    }

    @When("a user clicks on a stack card, the stack's details page is opened, {string} displays")
    public void a_user_clicks_on_a_stack_card_the_stack_s_details_page_is_opened_displays(String stackComposition) throws IOException {
        stacksPage.secondStackCard.click();
        waitForVisibility(stacksPage.stacksCompositionText);
        Assert.assertEquals(stackComposition,stacksPage.stacksCompositionText.getText());
        takeScreenshot("STK_2363/2472_StackDetailsPage");
    }

    @When("a user is on the dashboard page and clicks on the Explore Stacks button")
    public void a_user_is_on_the_dashboard_page_and_clicks_on_the_Explore_Stacks_button() {
        JavascriptUtils.jsScrollIntoView(dashboardPage.dashboardTextButton);
        JavascriptUtils.jsClick(dashboardPage.dashboardTextButton);
        JavascriptUtils.jsClick(dashboardPage.exploreStacksButton);
    }

    @Then("the stacks tab of the market place is opened and the {string} text displays")
    public void the_stacks_tab_of_the_market_place_is_opened_and_the_text_displays(String standardStacks) throws IOException {
        waitForVisibility(stacksPage.stacksTitleText);
        Assert.assertEquals(standardStacks,stacksPage.stacksTitleText.getText());
        takeScreenshot("STK_2363/2472_StacksMarketPlacePage");
    }

}
