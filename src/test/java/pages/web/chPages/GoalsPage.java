package pages.web.chPages;

import org.openqa.selenium.By;

public class GoalsPage {
    public static By goalsBalance = By.xpath("(//h6[text()='Goals Account']/preceding::h6)[6]");
    public static By goalAmount = By.xpath("//span[text()='Add Funds']//parent::button/preceding::h1/span");
    public static By goalNewHeading = By.cssSelector("div>div>h4");
    public static By goalNewSubtext = By.cssSelector("div>div>div>span:nth-child(5)");
    public static By transferMoneyHeading = By.cssSelector("h2>div>h1");
    public static By crossIcon = By.cssSelector("h2>div>button");
    public static By addFundsButton = By.cssSelector("div>div>div>span:nth-child(5)");
    public static By fromAccount = By.cssSelector("#fromAccountIndex-label+div");
    public static By mainAccount = By.cssSelector("ul>li");
    public static By goalsAccount = By.cssSelector("ul>li");
    public static By toAccount = By.cssSelector("#toAccountIndex-label+div");
    public static By amountField = By.cssSelector("div input#amount");
    public static By transferNowButton = By.xpath("//span[text()='Transfer Now']/parent::button");
    public static By inSufficentMessage = By.cssSelector("#form-dialog-title + div>div>span");

    public static By mainAmount = By.cssSelector("main>div>div:nth-child(2) div:nth-child(2) h6>span");
}
