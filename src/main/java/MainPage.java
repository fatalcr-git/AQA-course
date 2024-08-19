import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    public WebDriver driver;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"cookie-agree\"]")
    private WebElement cookieAgree;

    @FindBy(xpath = "//div[@class='pay__wrapper']/h2")
    private WebElement formTitle;

    @FindBy(xpath = "//a[contains(@href, 'oplaty')]")
    private WebElement aboutServiceButton;

    @FindBy(xpath = "//*[@id='connection-phone']")
    private WebElement numberField;

    @FindBy(xpath = "//*[@id='connection-sum']")
    private WebElement sumField;

    @FindBy(xpath = "//*[@id='connection-email']")
    private WebElement emailField;

    @FindBy(xpath = "//*[@id=\"pay-connection\"]/button")
    private WebElement continueButton;

    @FindBy(xpath = "//*[@class='bepaid-app']")
    private WebElement paidFrame;

    @FindBy(xpath = "//img[@alt='Visa']")
    private WebElement visaImg;

    @FindBy(xpath = "//img[contains(@alt, 'By')]")
    private WebElement verifiedByVisaImg;

    @FindBy(xpath = "//div[@class='pay__partners']//img[@alt='MasterCard']")
    private WebElement masterCardImg;

    @FindBy(xpath = "//img[contains(@alt, 'Code')]")
    private WebElement masterCardSecureImg;

    @FindBy(xpath = "//div[@class='pay__partners']//img[@alt='Белкарт']")
    private WebElement belkartImg;


    public boolean isVisaImgDisplayed() {
        return visaImg.isDisplayed();
    }

    public boolean isVerifiedByVisaImgDisplayed() {
        return verifiedByVisaImg.isDisplayed();
    }

    public boolean isMasterCardImgDisplayed() {
        return masterCardImg.isDisplayed();
    }

    public boolean isMasterCardSecureImgDisplayed() {
        return masterCardSecureImg.isDisplayed();
    }

    public boolean isBelkartImgDisplayed() {
        return belkartImg.isDisplayed();
    }

    public void clickCookieAgree() {
        cookieAgree.click();
    }

    public String getAboutServiceButton() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", aboutServiceButton);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, 'oplaty')]")));
        return aboutServiceButton.getAttribute("href");
    }

    public void inputPhone(String phone) {
        numberField.sendKeys(phone);
    }

    public void inputSum(String sum) {
        sumField.sendKeys(sum);
    }

    public void inputEmail(String email) {
        emailField.sendKeys(email);
    }

    public void clickContinueButton() {

        continueButton.click();
    }

    public String getFormTittle() {
        return formTitle.getText();
    }

    public void goToMainPage() {
        driver.get("https://www.mts.by/");
    }

}
