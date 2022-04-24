package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import utils.ConfigurationReader;
import utils.Driver;

import static steps.PageInitializer.*;

public class LoginSteps {
    @Given("Exchange Connected User is logged in")
    public void valid_user_is_logged_in() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.emailAddressBox.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.captchaBox.sendKeys("");
        Thread.sleep(12000);
        loginPage.continueButton.click();
        Thread.sleep(2000);
        Assert.assertEquals("Dashboard | Stacked", Driver.getDriver().getTitle());
    }

    @Given("New User is logged in")
    public void newUserIsLoggedIn() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.emailAddressBox.sendKeys(ConfigurationReader.getProperty("username2"));
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("password2"));
        loginPage.captchaBox.sendKeys("");
        Thread.sleep(12000);
        loginPage.continueButton.click();
        Thread.sleep(2000);
        Assert.assertEquals("Dashboard | Stacked", Driver.getDriver().getTitle());
    }

    @Then("New User logs out")
    public void newUserLogsOut() throws InterruptedException {
        dashboardPage.profile.click();
        dashboardPage.logoutBtn.click();
        Assert.assertEquals("Stacked", Driver.getDriver().getTitle());
    }

    @Then("Exchange Connected User logs out")
    public void exchangeConnectedUserLogsOut() {
        dashboardPage.profile.click();
        dashboardPage.logoutBtn.click();
        Assert.assertEquals("Stacked", Driver.getDriver().getTitle());
    }
}
