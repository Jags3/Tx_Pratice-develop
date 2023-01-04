package stepDefinitions.chPortalWeb;

import modules.web.chModules.DashboardModule;
import modules.web.chModules.GoalsModule;
import modules.web.chModules.LoginModule;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Goals {
    @And("Logs into the website with new account")
    public void logsIntoTheWebsiteWithNewAccount() {
        GoalsModule.passingNewCredentials();
        LoginModule.clickOnSingIn();
        LoginModule.enteringCode();
        LoginModule.click2FAContinue();
    }

    @And("Goals balance is visible on the Dashboard")
    public void goalsBalanceIsVisibleOnTheDashboard() {
        GoalsModule.fetchMainBalance();
        GoalsModule.isGoalBalanceVisible();
    }

    @When("User clicks on the Goals tile")
    public void userClicksOnTheGoalsTile() {
        DashboardModule.clickOnGoalAccountTile();
    }

    @Then("Verify Goals balance is {string}")
    public void verifyGoalsBalanceIs$(String s) {
        GoalsModule.verifyEmptyBalance(s);
    }

    @And("The Add funds message is visible")
    public void theAddFundsMessageIsVisible() {
        GoalsModule.verifySubtextOfNewAccount();
    }

    @And("{string} heading is displayed")
    public void headingIsDisplayed(String arg0) {
        GoalsModule.verifyHeadingOfNewAccount(arg0);
    }

    @And("Clicks on Add Funds button")
    public void clicksOnAddFundsButton() {
        GoalsModule.clickOnAddFundsButton();
    }

    @Then("Verify Transfer Money popup is visible")
    public void verifyTransferMoneyPopupIsVisible() {
        GoalsModule.verifyTransferMoneyPopupVisible();
    }

    @And("Cross icon is visible")
    public void crossIconIsVisible() {
        GoalsModule.verifyCrossIconIsVisible();
    }

    @And("From drop-down is visible inside Transfer Money")
    public void fromDropDownIsVisibleInsideTransferMoney() {
        GoalsModule.isFromAccountDropdownVisible();
    }

    @And("To drop-down is visible inside Transfer Money")
    public void toDropDownIsVisibleInsideTransferMoney() {
        GoalsModule.isToAccountDropdownVisible();
    }

    @When("User selects Main Account in From drop-down")
    public void userSelectsMainAccountInFromDropDown() {
        GoalsModule.selectsMainAccountInFrom();
    }

    @Then("Verify User is able to select Goal Account in To drop-down only")
    public void verifyUserIsAbleToSelectGoalAccountInToDropDownOnly() {
        GoalsModule.selectsGoalsInToDropdown();
    }

    @And("Transfer Now button is disabled")
    public void transferNowButtonIsDisabled() {
        GoalsModule.verifyTransferNowButtonDisabled();
    }

    @When("User enters amount greater than Main Account balance")
    public void userEntersAmountGreaterThanMainAccountBalance() {
        GoalsModule.passingAmountGreaterThanMainBalance();
    }

    @Then("Verify Transfer Money is enabled")
    public void verifyTransferMoneyIsEnabled() {
        transferNowButtonIsDisabled();
    }

    @When("User clicks on Transfer Money button")
    public void userClicksOnTransferMoneyButton() {
        GoalsModule.clickOnTransferMoneyButton();
    }

    @Then("Verify insufficient balance message is shown")
    public void verifyInsufficientBalanceMessageIsShown() {
        GoalsModule.verifyInsufficientErrorVisible();
    }

    @When("User click on Cross icon")
    public void userClickOnCrossIcon() {
        GoalsModule.clickOnCrossIcon();
    }

    @Then("Verify user lands on Goals page")
    public void verifyUserLandsOnGoalsPage() {
        GoalsModule.verifyGoalsPageVisible();
    }

    @When("User selects Main and Goals account for respective dropdowns")
    public void userSelectsMainAndGoalsAccountForRespectiveDropdowns() {
        userSelectsMainAccountInFromDropDown();
        verifyUserIsAbleToSelectGoalAccountInToDropDownOnly();
    }

    @And("Enters amount equals or less than the main balance")
    public void entersAmountEqualsOrLessThanTheMainBalance() {
        GoalsModule.passingLessAmountThanMainAmount();
    }
}
