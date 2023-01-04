package modules.android.agModules;

import constants.web.chConstants.Constant;
import pages.android.agPages.LoginPage;
import pages.android.agPages.SplashPage;
import mobileutil.MobileKeywords;
import constants.andriod.agConstants.*;

public class LoginModule {
    public static void validatingLoginScreen() {
        //Element Visible
        MobileKeywords.isMobileElementVisible(LoginPage.rememberMeToggle, "Remember Me Toggle ");
        MobileKeywords.isMobileElementVisible(LoginPage.touchIdToggle, "Touch ID Toggle ");

        //Element Disabled
        MobileKeywords.isMobileElementDisabled(SplashPage.signInButton, "Sign In Button ");

        //Element Text Verification and Visibility
        MobileKeywords.isMobileElementTextMatching(LoginPage.loginEmail, "Email", "Email placeholder ");
        MobileKeywords.isMobileElementTextMatching(LoginPage.loginPassword, "Password", "Password placeholder ");
        MobileKeywords.isMobileElementTextMatching(LoginPage.forgotPasswordLink, "Forgot Password?", "Forgot Password Link ");
        MobileKeywords.isMobileElementTextMatching(LoginPage.rememberMeLabel, "Remember Email", "Remember Email Label ");
        MobileKeywords.isMobileElementTextMatching(LoginPage.touchIDLabel, "Touch ID", "Touch ID label ");
    }

    public static void enterDetails() {
        //Passing values
        MobileKeywords.writeInInput(LoginPage.loginEmail, Constants.dataMap.get("Email"), Constants.dataMap.get("Email")); //EMAIL_106 //EMAIL_124 //EMAIL
        MobileKeywords.writeInInput(LoginPage.loginPassword, Constants.dataMap.get("Password"), Constants.dataMap.get("Password"));
        MobileKeywords.isMobileElementEnabled(SplashPage.signInButton, "Sign In button");
    }
}
