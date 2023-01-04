package modules.web.chModules;

import constants.web.chConstants.Constant;
import pages.web.chPages.GoalsPage;
import pages.web.chPages.LoginPages;
import utilities.KeywordUtil;

public class GoalsModule {
    public static void passingNewCredentials() {
        KeywordUtil.setValueWeb(LoginPages.emailTextField, Constant.EMAIL);
        KeywordUtil.setValueWeb(LoginPages.passwordTextField, Constant.PASSWORD);
    }

    public static void fetchMainBalance() {
        Constant.MAIN_BALANCE = KeywordUtil.getText(GoalsPage.mainAmount);
        System.out.println(Constant.MAIN_BALANCE);
        Constant.DATA = Constant.MAIN_BALANCE.split("\\$");
        Constant.mainBalance = Double.parseDouble(Constant.DATA[1]);
    }

    public static void isGoalBalanceVisible() {
        KeywordUtil.isWebElementsVisible(GoalsPage.goalsBalance, "Goal Balance");
        System.out.println(KeywordUtil.getText(GoalsPage.goalsBalance));
    }

    public static void verifyEmptyBalance(String data) {
        KeywordUtil.textVerification(GoalsPage.goalAmount, data);
    }

    public static void verifySubtextOfNewAccount() {
        KeywordUtil.textAssertionContains(GoalsPage.goalNewSubtext, Constant.SUBTEXT_NEW_ACCOUNT_GOALS);
    }

    public static void verifyHeadingOfNewAccount(String arg0) {
        KeywordUtil.textAssertionContains(GoalsPage.goalNewHeading, arg0);
    }

    public static void clickOnAddFundsButton() {
        KeywordUtil.click(GoalsPage.addFundsButton,"Add Funds button");
    }

    public static void verifyTransferMoneyPopupVisible() {
        KeywordUtil.isWebElementsVisible(GoalsPage.transferMoneyHeading,"Transfer Money popup");
    }

    public static void verifyCrossIconIsVisible() {
        KeywordUtil.isWebElementsVisible(GoalsPage.crossIcon,"Cross icon inside Transfer Money popup");
    }

    public static void isFromAccountDropdownVisible() {
        KeywordUtil.isWebElementsVisible(GoalsPage.fromAccount,"From Account dropdown");
    }

    public static void isToAccountDropdownVisible() {
        KeywordUtil.isWebElementsVisible(GoalsPage.toAccount,"To Account dropdown");
    }

    public static void selectsMainAccountInFrom() {
        KeywordUtil.click(GoalsPage.fromAccount,"From Account dropdown");
        KeywordUtil.click(GoalsPage.mainAccount,"Main Account");
    }

    public static void selectsGoalsInToDropdown() {
        KeywordUtil.click(GoalsPage.toAccount,"To Account dropdown");
        KeywordUtil.click(GoalsPage.goalsAccount,"Goals Account");
    }

    public static void verifyTransferNowButtonDisabled() {
        KeywordUtil.isButtonEnabled(GoalsPage.transferNowButton,"Transfer Now button");
    }

    public static void passingAmountGreaterThanMainBalance() {
        Constant.MAIN_BALANCE = String.valueOf(Constant.mainBalance+.01);
        KeywordUtil.setValueWeb(GoalsPage.amountField,Constant.MAIN_BALANCE);
    }

    public static void clickOnTransferMoneyButton() {
        KeywordUtil.click(GoalsPage.transferNowButton,"Transfer Now button");
    }

    public static void verifyInsufficientErrorVisible() {
        KeywordUtil.isWebElementsVisible(GoalsPage.inSufficentMessage,"Insufficient Balance error message");
        KeywordUtil.textVerification(GoalsPage.inSufficentMessage,Constant.INSUFFICIENT_AMOUNT_MESSAGE);
    }

    public static void clickOnCrossIcon() {
        KeywordUtil.click(GoalsPage.crossIcon,"Cross icon inside Transfer Money popup");
    }

    public static void verifyGoalsPageVisible() {
        KeywordUtil.isWebElementsVisible(GoalsPage.addFundsButton,"Add Funds button");
    }

    public static void passingLessAmountThanMainAmount() {
        Constant.MAIN_BALANCE = String.valueOf(Constant.mainBalance);
        KeywordUtil.setValueWeb(GoalsPage.amountField,Constant.MAIN_BALANCE);
    }
}
