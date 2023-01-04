package stepDefinitions.agMobile;

import modules.android.agModules.*;
import constants.andriod.agConstants.*;
import pages.android.agPages.SplashPage;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mobileutil.MobileKeywords;
import stepDefinitions.RunCukesTest;
import utilities.DriverUtil;
import utilities.HTMLReportUtil;
import utilities.KeywordUtil;
import utilities.LogUtil;

public class Login {
    @When("User enters two-factor Authentication code 2FA Code")
    public static void user_enters_two_factor_authentication_code_2fa_code() {
        EnteringOTPModule.verifyOTPCodeAdded();
    }

    @When("User taps on Sign In button in splash screen")
    public static void user_taps_on_sign_in_button_in_splash_screen() {
        StartingModule.startScreenSignIn();
    }

    @When("User taps on Sign In button")
    public static void user_taps_on_sign_in_button() {
        TapButtons.signInButtonTap();
    }

    @When("User taps on the Continue button")
    public static void user_taps_on_the_continue_button() {
        EnteringOTPModule.verifyContinueButtonOTP();
    }

    @Given("User launches the application")
    public void user_launches_the_application() {
        DriverUtil.invokeArtistGrowthApp();
    }

    @Then("Verify user lands on the login Page")
    public void verify_user_lands_on_the_login_page() {
        LoginModule.validatingLoginScreen();
    }

    @When("User enters the Email and Password")
    public void user_enters_the_email_and_password() {
        EnteringCredentials.loginPageCorrectCred1();
    }

    @When("2FA code is sent the to registered mobile")
    public void fa_code_is_sent_the_to_registered_mobile() {
        LogUtil.infoLog(Login.class, "2FA code cannot be verified");
    }

    @Then("Verify user is redirected to Enter your code page")
    public void verify_user_is_redirected_to_enter_your_code_page() {
        EnteringOTPModule.verifyOTPScreenVisible();
    }

    @When("User taps on the Continue button in forgot password")
    public void user_taps_on_the_continue_button_in_forgot_password() {
        TapButtons.continueButton();
    }

    @Then("Verify user is Logged in and redirected to the Homepage")
    public void verify_user_is_logged_in_and_redirected_to_the_homepage() {
        DashboardModule.validatingDashboard();
    }

    @When("User enters the Email and Incorrect_Password")
    public void user_enters_the_email_and_incorrect_password() {
        EnteringCredentials.enteringEmail();
        EnteringCredentials.enteringIncorrectPassword();
    }

    @Then("Verify user is able to see Invalid Credential message")
    public void verify_user_is_able_to_see_invalid_credential_message() {
        ErrorsPopupModule.invalidEmailPassErrror();
    }

    @When("User enter the Email and Password")
    public void user_enter_the_email_and_password() {
        EnteringCredentials.loginPageCorrectCred1();
    }

    @When("User taps on Remember Me button")
    public void user_taps_on_remember_me_button() {
        TapButtons.rememberMeToggle();
    }

    @When("User enters two-factor Authentication code")
    public void user_enters_two_factor_authentication_code() {
        EnteringOTPModule.enteringCode();
    }

    @When("User taps on the More button in the bottom nav")
    public void user_taps_on_more_button_in_the_bottom_nav() {
        TapButtons.bottomNavClick();
    }

    @When("User taps on Logout Option")
    public void user_taps_on_logout_option() {
        MobileKeywords.scrollAndClick(Constants.LOGOUT_TEXT);
    }

    @Then("Verify Email is already populated")
    public void verify_email_is_already_populated() {
        MobileKeywords.textAssertionContains(SplashPage.emailField, "@payfare.com");
    }

    @When("User enters the Email")
    public void user_enters_the_email() {
        EnteringCredentials.enteringEmail();
    }

    @When("User enters incorrect Password for the first time")
    public void user_enters_incorrect_password_for_the_first_time() {
        EnteringCredentials.enteringIncorrectPassword();
    }

    @When("User enters incorrect Password for the second time")
    public void user_enters_incorrect_password_for_the_second_time() {
        EnteringCredentials.enteringIncorrectPassword();
    }

    @When("User enters incorrect Password for the third time")
    public void user_enters_incorrect_password_for_the_third_time() {
        EnteringCredentials.enteringIncorrectPassword();
    }

    @Then("Verify user is able to see Account lock message")
    public void verify_user_is_able_to_see_account_lock_message() {
        MobileKeywords.textAssertion(SplashPage.accountLockedTitle, "Account Locked");
    }

    @Then("Verify user is able to see Account lock Message")
    public void verify_user_is_able_to_see_account_lock_Message() {
        MobileKeywords.isMobileElementVisible(SplashPage.lockAccountGotIiButton, "Got It button");
        MobileKeywords.taps(SplashPage.lockAccountGotIiButton, "Got It button");
    }

    @When("Tap on Forgot password")
    public void tap_on_forgot_password() {
        TapButtons.forgotPasswordReset1();
    }

    @When("Tap on Forgot password in login page")
    public void tap_on_forgot_password_in_login_page() {
        TapButtons.forgotPasswordResetLoginPage();
    }

    @Then("Enter the email address")
    public void enter_the_email_address() {
        StartingModule.forgotPasswordEmail();
        TapButtons.forgotPasswordEmailEnter();
    }

    @Then("Enter the verification code")
    public void enter_the_verification_code() {
        EnteringOTPModule.enteringCode();
        TapButtons.forgotPasswordReset2FAContinue();
    }

    @Then("answer the security question")
    public void answer_the_security_question() {
        StartingModule.securityQuestionSelectAnswer();
    }

    @Then("Enter the new password and confirm password fields")
    public void enter_the_new_password_and_confirm_password_fields() {
        ResetPasswordModule.passwordConfirmPassword();
    }

    @Then("Click on Save New Password")
    public void click_on_save_new_password() {
        ResetPasswordModule.continueNewPassword();
    }

    //TODO - Manage Card
    @Then("Verify user lands on Activate Your Card page")
    public void verify_user_lands_on_activate_your_card_page() {
        Virtual_ActivatePhysicalCardModule.activateCard();
    }

    @When("User taps on Not Now text button")
    public void user_taps_on_not_now_text_button() {
        Virtual_ActivatePhysicalCardModule.notNowTextButton();
    }

    @Then("Verify message text Manage Card is visible")
    public void verify_message_text_manage_card_is_visible() {
        Virtual_ActivatePhysicalCardModule.verifyTextManageCard();
    }

    @When("User taps on Activate Card button")
    public void user_taps_on_activate_card_button() {
        Virtual_ActivatePhysicalCardModule.tapActivateCard();
    }


    @Then("Verify user redirected to Activate Physical Card screen")
    public void verify_user_redirected_to_activate_physical_card_screen() {
        Virtual_ActivatePhysicalCardModule.activatePhysicalCard();
    }

    @When("User enters incorrect Last {int} digit of the Card received on user email")
    public void user_enters_incorrect_last_digit_of_the_card_received_on_user_email(Integer int1) {
        Virtual_ActivatePhysicalCardModule.incorrectCardNo();
    }

    @When("User enters incorrect Card Expiration Number received on user email")
    public void user_enters_incorrect_card_expiration_number_received_on_user_email() {
        Virtual_ActivatePhysicalCardModule.incorrectExpiryDate();
    }

    @When("Verify error for wrong card details is visible")
    public void verify_error_for_wrong_card_details_is_visible() {
        Virtual_ActivatePhysicalCardModule.wrongCardDetailsError();
    }
}
