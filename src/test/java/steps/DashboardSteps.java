package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import utils.JavascriptUtils;
import static steps.PageInitializer.*;
import java.util.ArrayList;
import java.util.Arrays;

public class DashboardSteps {
    /**
     * __________ Connect Exchange Steps __________
     */

    @When("a user is on the exchange page")
    public void a_user_is_on_the_exchange_page() {
        dashboardPage.exchangeIconButton.click();
    }

    @When("if the Safety First pop up displays then the user clicks the Remind me later button")
    public void if_the_Safety_First_pop_up_displays_then_the_user_clicks_the_Remind_me_later_button() throws InterruptedException {
        try {
            JavascriptUtils.jsScrollIntoView(seeAllExchangesPage.remindMeLaterButton);
            JavascriptUtils.jsClick(seeAllExchangesPage.remindMeLaterButton);
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @When("a user clicks add exchange")
    public void a_user_clicks_add_exchange() throws InterruptedException {
        Thread.sleep(1000);
        JavascriptUtils.jsClick(seeAllExchangesPage.addExchangeButton);
        Thread.sleep(1000);
    }

    @Then("exchanges {string}, {string}, {string}, {string}, {string},{string}, {string}, {string}, {string}, {string}, {string}, {string} are displayed")
    public void exchanges_and_are_displayed(String AAX, String AscendExFutures, String Binance, String BinanceFutures, String Bitfinex, String BitMEX, String ByBit, String Coinbase, String FTX, String FTXUS, String KuCoin, String Phemex) throws InterruptedException {
        //storing all exchanges into an array of strings to iterate through
        String[] nameOfExchanges = {AAX, AscendExFutures, Binance, BinanceFutures, Bitfinex, BitMEX, ByBit, Coinbase, FTX, FTXUS, KuCoin, Phemex};
        int exchangeCount = 0;

        //adding exchange names into a set
        ArrayList<String> listOfExchangeStrings = new ArrayList<>(Arrays.asList(nameOfExchanges));

        //asserting each exchange matches the list of exchanges to string
        for (String listOfExchange :  listOfExchangeStrings) {
            Thread.sleep(1000);
            Assert.assertEquals(listOfExchange,seeAllExchangesPage.aaxExchangeButton.getText().trim());
            Thread.sleep(1000);
            Assert.assertEquals(listOfExchange,seeAllExchangesPage.ascendEXFuturesExchangeButton.getText().trim());
            Assert.assertEquals(listOfExchange,seeAllExchangesPage.binanceExchangeButton.getText().trim());
            Assert.assertEquals(listOfExchange,seeAllExchangesPage.binanceFuturesExchangeButton.getText().trim());
            Assert.assertEquals(listOfExchange,seeAllExchangesPage.bitfinexExchangeButton.getText().trim());
            Assert.assertEquals(listOfExchange,seeAllExchangesPage.bitMEXExchangeButton.getText().trim());
            Assert.assertEquals(listOfExchange,seeAllExchangesPage.byBitExchangeButton.getText().trim());
            Assert.assertEquals(listOfExchange,seeAllExchangesPage.coinbaseExchangeButton.getText().trim());
            Assert.assertEquals(listOfExchange,seeAllExchangesPage.ftxExchangeButton.getText().trim());
            Assert.assertEquals(listOfExchange,seeAllExchangesPage.ftxUSExchangeButton.getText().trim());
            Assert.assertEquals(listOfExchange,seeAllExchangesPage.kuCoinExchangeButton.getText().trim());
            Assert.assertEquals(listOfExchange,seeAllExchangesPage.phemexExchangeButton.getText().trim());
        }
    }

}
