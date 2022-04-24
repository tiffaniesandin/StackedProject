package steps;

import pages.*;

public class PageInitializer {
    /**
     * This class is an initializer class which will initialize all pages classes, used for organization
     * and limiting code redundancy (we don't have to create in object in each steps class for our classes).
     * This helps organize the naming conventions of our objects for our classes as well.
     */

    //declared public static variables of all page types

    public static DashboardPage dashboardPage = new DashboardPage();
    public static LoginPage loginPage = new LoginPage();
    public static BotsPage botsPage = new BotsPage();
    public static SeeAllExchangesPage seeAllExchangesPage = new SeeAllExchangesPage();
    public static StacksPage stacksPage = new StacksPage();
    public static LendingPage lendingPage = new LendingPage();
    public static StakingPage stakingPage = new StakingPage();

    public static StackedAutomatedTestBotPage stackedAutomatedTestBotPage = new StackedAutomatedTestBotPage();


}
