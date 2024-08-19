import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BalancePage {
    public WebDriver driver;

    public BalancePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    // услуги связи
    @FindBy(xpath = "//*[@id='connection-phone']")
    private WebElement connectionPhoneNumberPlaceHolder;

    @FindBy(xpath = "//*[@id='connection-sum']")
    private WebElement connectionSumPlaceHolder;

    @FindBy(xpath = "//*[@id='connection-email']")
    private WebElement connectionEmailPlaceHolder;
    // домашний интернет
    @FindBy(xpath = "//*[@id='internet-phone']")
    private WebElement internetPhonePlaceHolder;

    @FindBy(xpath = "//*[@id='internet-sum']")
    private WebElement internetSumPlaceHolder;

    @FindBy(xpath = "//*[@id='internet-email']")
    private WebElement internetEmailPlaceHolder;
    // рассрочка
    @FindBy(xpath = "//*[@id='score-instalment']")
    private WebElement instalmentScorePlaceHolder;

    @FindBy(xpath = "//*[@id='instalment-sum']")
    private WebElement instalmentSumPlaceHolder;

    @FindBy(xpath = "//*[@id='instalment-email']")
    private WebElement instalmentEmailPlaceHolder;
    // задолженность
    @FindBy(xpath = "//*[@id='score-arrears']")
    private WebElement arrearsScorePlaceHolder;

    @FindBy(xpath = "//*[@id='arrears-sum']")
    private WebElement arrearsSumPlaceHolder;

    @FindBy(xpath = "//*[@id='arrears-email']")
    private WebElement arrearsEmailPlaceHolder;

    @FindBy(xpath = "//div[@class='pay-description__cost']//span")
    private WebElement payDescriptionCost;

    @FindBy(xpath = "//div[@class='pay-description__text']")
    private WebElement payDescriptionNumber;

    @FindBy(xpath = "//button[@class='colored disabled']")
    private WebElement payButtonCost;

    @FindBy(xpath = "//label[contains(@class, 'ng-tns-c46-1')]")
    private WebElement cardField;

    @FindBy(xpath = "//label[contains(@class, 'ng-tns-c46-4')]")
    private WebElement validityPeriodField;

    @FindBy(xpath = "//label[contains(@class, 'ng-tns-c46-5')]")
    private WebElement cvcField;

    @FindBy(xpath = "//label[contains(@class, 'ng-tns-c46-3')]")
    private WebElement holderNameField;

    @FindBy(xpath = "//*[contains(@src, 'assets/images/payment-icons/card-types/visa-system.svg')]")
    private WebElement visaLogo;

    @FindBy(xpath = "//*[contains(@src, 'assets/images/payment-icons/card-types/mastercard-system.svg')]")
    private WebElement mastercardLogo;

    @FindBy(xpath = "//*[contains(@src, 'assets/images/payment-icons/card-types/belkart-system.svg')]")
    private WebElement belkartLogo;

    @FindBy(xpath = "//*[contains(@src, 'assets/images/payment-icons/card-types/maestro-system.svg')]")
    private WebElement maestroLogo;

    @FindBy(xpath = "//*[contains(@src, 'assets/images/payment-icons/card-types/mir-system-ru.svg')]")
    private WebElement mirLogo;

    public boolean isVisaLogoDisplayed() {
        return visaLogo.isDisplayed();
    }

    public boolean isMastercardLogoDisplayed() {
        return mastercardLogo.isDisplayed();
    }

    public boolean isBelkartLogoDisplayed() {
        return belkartLogo.isDisplayed();
    }

    public boolean isMirLogoDisplayed() {
        Wait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@src, 'assets/images/payment-icons/card-types/mir-system-ru.svg')]")));
        return mirLogo.isDisplayed();
    }

    public boolean isMaestroLogoDisplayed() {
        Wait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[contains(@src, 'maestro')]")));
        return maestroLogo.isDisplayed();
    }

    public String getConnectionPhoneNumberPlaceHolder() {
        return connectionPhoneNumberPlaceHolder.getAttribute("placeholder");
    }

    public String getConnectionSumPlaceHolder() {
        return connectionSumPlaceHolder.getAttribute("placeholder");
    }

    public String getConnectionEmailPlaceHolder() {
        return connectionEmailPlaceHolder.getAttribute("placeholder");
    }

    public String getInternetPhonePlaceHolder() {
        return internetPhonePlaceHolder.getAttribute("placeholder");
    }

    public String getInternetSumPlaceHolder() {
        return internetSumPlaceHolder.getAttribute("placeholder");
    }

    public String getInternetEmailPlaceHolder() {
        return internetEmailPlaceHolder.getAttribute("placeholder");
    }

    public String getInstalmentScorePlaceHolder() {
        return instalmentScorePlaceHolder.getAttribute("placeholder");
    }

    public String getInstalmentSumPlaceHolder() {
        return instalmentSumPlaceHolder.getAttribute("placeholder");
    }

    public String getInstalmentEmailPlaceHolder() {
        return instalmentEmailPlaceHolder.getAttribute("placeholder");
    }

    public String getArrearsScorePlaceHolder() {
        return arrearsScorePlaceHolder.getAttribute("placeholder");
    }

    public String getArrearsSumPlaceHolder() {
        return arrearsSumPlaceHolder.getAttribute("placeholder");
    }

    public String getArrearsEmailPlaceHolder() {
        return arrearsEmailPlaceHolder.getAttribute("placeholder");
    }

    public String getCardFieldPlaceholder() {
        return cardField.getText();
    }

    public String getValidityPeriodPlaceholder() {
        return validityPeriodField.getText();
    }

    public String getCvcFieldPlaceholder() {
        return cvcField.getText();
    }

    public String getHolderNameFieldPlaceholder() {
        return holderNameField.getText();
    }

    public String getPayDescriptionCost() {
        return payDescriptionCost.getText();
    }

    public String getPayDescriptionNumber() {
        return payDescriptionNumber.getText();
    }

    public String getPayButtonCost() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='colored disabled']")));
        return payButtonCost.getText();
    }




}
