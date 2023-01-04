package constants.andriod.agConstants;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Constants {
    public static final String[] articles = {"How can I earn rewards?", "How do I redeem my rewards?", "How do Cash Back rewards work?",
            "What is Visa SavingsEdge Cash Back?", "What are Personalized Offers?"};
    public static final DecimalFormat DF = new DecimalFormat("0.00");
    public static final String PO_BOX = "P.O. Box";
    public static final String CONFIRM_ADDRESS = "Confirm Address";
    public static final String ATM_FINDER_TEXT = "ATM Finder";
    public static final String MOVE_MONEY = "Move Money";
    public static final String DIRECT_DEPOSIT = "Direct Deposit";
    public static final String PROFILE_SETTINGS = "Profile Settings";
    public static final String HELP = "Help";
    public static final String PASSWORD = "Payfare@1";
    public static final String GETTING_STARTED_TEXT = "Getting Started";
    public static final String PROFILE_AND_ACCOUNT_TEXT = "Profile & Account";
    public static final String CARD_ISSUES_TEXT = "Card Issues";
    public static final String VIRTUAL_CARD_TEXT = "Virtual Card";
    public static final String ATM_WITHDRAWAL_TEXT = "ATM Withdrawal";
    public static final String REWARDS_TEXT = "Rewards";
    public static final String PAYOUTS_AND_TRANSACTIONS_TEXT = "Payouts & Transactions";
    //More-Help
    //Getting Started
    public static final String NEED_MORE_HELP_BUTTON = "Need More Help?";
    public static final String VIRTUAL_CARD_ARTICLE = "Using virtual card with Apple Pay or Google Pay";
    //DashBoard
    public static final String NEARBY_ATM_BUTTON = "Nearby ATM";
    public static final String DIRECT_DEPOSIT_BUTTON = "Direct Deposit";
    public static final String STATEMENTS_BUTTON = "Statements";
    public static final String GET_HELP_BUTTON = "Get Help";
    public static final String GOAL_TILE_TITLE = "Goal";
    public static final String REWARDS_TILE_TITLE = "Rewards";
    //Bottom Navigation
    public static final String HOME_BUTTON = "Home";
    //Help Search Bar
    public static final String HOW_DO_I_CHECK_TEXT = "how do i check";
    //Info Pop - ATM Finder
    public static final String INFO_POPUP_CONTENT = "A fee may be charged and promptly returned for applicable free ATM locations.";
    //Bottom Sheet : ATM Finder
    public static final String BOTTOM_SHEET_TITLE = "Filters";
    //Text to Search Bar : ATM Finder
    public static final String STANFORD = "Stanford";
    //Move money : ACH Transfer
    public static final String SEND_MONEY_TITLE = "Send Money";
    public static final String RECIPIENT_TITLE = "Recipient";
    public static final String RECIPIENT_SAVE_BUTTON = "Save";
    public static final String RECIPIENT_FIRST_NAME = "First Name";
    public static final String ADD_RECIPIENT = "Add Recipient";
    public static final String EDIT_RECIPIENT = "Edit Recipient";
    public static final String FIRST_NAME = "John";
    public static final String LAST_NAME = "Kennedy";
    public static final String MOBILE_NUMBER = "2255599991";
    public static final String MOBILE_NUMBER_MASKED = "(225) 559-9991";
    public static final String NEW_MOBILE_NUMBER = "2225559999";
    public static final String NEW_MOBILE_NUMBER_MASKED = "(222) 555-9999";
    public static final String BANK_NAME = "Stride";
    public static final String NEW_BANK_NAME = "SBI";
    public static final String CHECKING_ACCOUNT = "Checking Account";
    public static final String ACCOUNT_NUMBER = "12345551";
    public static final String ROUTING_NUMBER = "021000021";
    public static final String UPDATED_ROUTING_NUMBER = "063216608";
    public static final String NICK_NAME = "Mr.President";
    public static final String DELETE_BUTTON = "Delete";
    public static final String DUPLICATE_RECIPIENT_TITLE = "Error";
    public static final String DUPLICATE_RECIPIENT_SUBTEXT = "Unable to add recipient. The recipient already exists.";
    public static final String SAVE_BUTTON = "Save";
    //new recipient
    public static final String NEW_FIRST_NAME = "Charles";
    public static final String NEW_LAST_NAME = "Lee";
    public static final String NEW_ACCOUNT_NUMBER = "12345556";
    public static final String MAX_FIRST_NAME = "TatsukiFujimoto";
    public static final String MAX_NICK_NAME = "TatsukiFujimotoSensei";
    public static final String SUBTEXT_HELP_SEND_MONEY = "Transfer funds to someone in the U.S., free of charge. Limits apply when transferring funds from your Artist Growth Wallet card:\n" + "￭ $2000/day, 3 transfers/day (a day is any 24-hour period)\n" + "￭ $5000/month, 30 transfers/month (a month is any 30-day period)\n" + "Transfer time is next business day if sent before midnight Pacific Time.\n" + "\n" + "Transfers typically take between 1-5 business days.";
    public static final String HEADING_HELP_SEND_MONEY = "Are there transfer limits?";
    public static final String SEND_MONEY_BOTTOM_TEXT = "By tapping \"Continue\" you confirm the information you’ve entered is accurate. \n" + " \n" + "Funds cannot be tracked and erroneous transfers cannot be reversed. \n" + " \n" + "Ensure the recipient details are entered correctly before proceeding.";
    public static final String TRXN_SUCCESS_SUBTEXT = "You've successfully made a transfer!";
    public static final String AMOUNT_TEN = "$1.00";
    public static final String AMOUNT_CONSTANT = "$10.00";
    public static final String AMOUNT_CONSTANT_99 = "$99.99";
    public static final String LIMIT_EXCEEDS_TITLE = "Limit Exceeded";
    public static final String LIMIT_EXCEEDS_TEXT = "You have reached your 24 hour or 30 day limit.";
    //Transfer Between Accounts
    public static final String TRANSFER_BETWEEN_ACCOUNTS = "Transfer Money";
    public static final String MAIN_ACCOUNTS = "Main Account";
    public static final String GOALS = "Goal";
    public static final String LOW_AMOUNT = "1";
    public static final String TRANSFER_SCREEN_BOTTOM_SHEET_TEXT = "By tapping ‘Confirm,’ you confirm the \n" + "information you’ve entered is accurate.";
    public static final String OPTIONAL_MESSAGE = " Utilized via automation ";
    public static final String BRAMPTON = "Brampton";
    public static final String NO_RESULTS = "No results";
    public static final String HELP_DIALOG_TITLE = "Need more help? Try these links";
    public static final String ACCOUNT_INFO_SUBTEXT = "Use the details below when setting up direct deposit payments for any purpose, such as salaries and wages, payment of bills, taxes, and other government charges.";
    //Transaction History
    public static final String DIALOG_PENDING_TITLE = "Pending Transactions";
    public static final String DIALOG_POSTED_TITLE = "Posted Transactions";
    public static final String DIALOG_PENDING_SUBTEXT = "Amounts of pending transactions may not be final and are determined by the merchants. Contact the merchant directly for any questions regarding pending transactions.";
    public static final String DIALOG_POSTED_SUBTEXT = "Posted transactions have been fully processed. Amounts in posted transactions are final.";
    public static final String FILTER_TITLE = "Filter Transactions";
    public static final String REWARD_REDEMPTION_TRANSACTION = "Rewards Redemption";
    public static final String PAYOUT_TRANSACTIONS = "Transfer from Account to Goal";
    //Rewards - VSE
    public static final String DISCLAIMER_VSE = "Rewards subject to eligibility and offers may change without notice";
    public static final String BOTTOM_SHEET_HELP_TITLE = "Need More Help?";
    public static final String BOTTOM_SHEET_HELP_SUBTEXT = "See Frequently Asked Questions about Visa SavingsEdge rewards. \n" + "\n" + "Still need help? Contact Visa Global Customer Care Services :1-888-466-9227";
    public static final ArrayList<String> QUICK_SERVICES = new ArrayList<>(Arrays.asList("Nearby ATM", "Direct Deposit", "Statements", "Get Help"));
    public static final String ACTIVE = "Active";
    public static final String LOCKED = "Locked";
    public static final String EXPLORE_ALL_OFFER = "Explore All Offers";
    public static final String LOCATION_HEADING = "Allow Artist Growth Wallet access to your location?";
    public static final String LOCATION_CONTENT = "Artist Growth Wallet needs location permission to show you nearby offers.";
    public static final String ERROR_CONTENT = "A network error was\n" + "detected. Please try again.";
    public static final String SYSTEM_SUBTEXT = "Allow Artist Growth to access this device’s location?";
    public static final String RESEND_CODE_LINK = "Didn't receive your code?";
    public static final String data = "222555";
    public static final String NEW_NICK_NAME = "Templar";
    public static final String SAVINGS_ACCOUNT = "Savings Account";
    public static final String REWARDS_DISCLAIMER = "Rewards subject to eligibility and offers may change without notice";
    public static final String USER_NAME = "John Smith";
    public static final String EDIT_EMAIL_SUBTEXT = "Enter your new email address and we’ll email you a verification code to verify.";
    public static final String INCORRECT_OTP = "111111";
    public static final String CONTACT_NUMBER = "3434646464";
    public static final String REWARDS_TRXN_TITLE = "Reward Transaction Details";
    public static HashMap<String, String> dataMap;
    public static Double USER_INPUT;
    public static String CARD_NO = "";
    public static String EXPIRY_DATE = "";
    public static String CVV = "";
    public static String CARD_STATUS = "";
    public static String CARD_TOGGLE = "";
    public static String MAIN_ACCOUNT_BALANCE;
    public static String REDEEM_BALANCE;
    public static String NO_TRANSACTION_MESSAGE = "You can earn cash back when you shop at hundreds of brands with your Artist Growth Wallet Card";
    public static String DATE;
    public static String MAIN_BALANCE_AMOUNT;
    public static double DIFFERENCE_MAIN_AMOUNT;
    public static String TRANSACTION_BEFORE, DATE_OF_TRANSACTIONS_AFTER, DATE_OF_TRANSACTIONS_BEFORE, TRANSACTION_AFTER, DATE_FROM, DATE_TO;
    public static String F2ACODEVALUE = "222555";
    public static String PASSWORD_INCORRECT = "Payfare111";
    public static String INCORRECT_2FA = "123456";
    public static String SIGNIN_TEXT = "Sign In";
    public static String LOGOUT_TEXT = "Logout";
    public static String Statements = "Statements";
    public static String Details = "Details";
    public static String PIN = "1234";
    public static String INFO = "1234";
}
