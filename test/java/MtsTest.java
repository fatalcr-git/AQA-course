import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import java.util.concurrent.TimeUnit;

public class MtsTest {
    WebDriver driver;
    MainPage mainPage;
    BalancePage balancePage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().browserVersion("126.0").setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get("https://www.mts.by");
        mainPage = new MainPage(driver);
        mainPage.clickCookieAgree();
        balancePage = new BalancePage(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test()
    public void tittleTest() {
        String expectedTitle = "Онлайн пополнение\n" +
                "без комиссии";
        Assert.assertEquals(mainPage.getFormTittle(), expectedTitle);
    }

    @Test()
    public void logosTest() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(mainPage.isVisaImgDisplayed());
        softAssert.assertTrue(mainPage.isMasterCardImgDisplayed());
        softAssert.assertTrue(mainPage.isMasterCardSecureImgDisplayed());
        softAssert.assertTrue(mainPage.isVerifiedByVisaImgDisplayed());
        softAssert.assertTrue(mainPage.isBelkartImgDisplayed());
        softAssert.assertAll();
    }

    @Test()
    public void aboutServiceButtonTest() {
        String expectedLink = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        Assert.assertEquals(mainPage.getAboutServiceButton(), expectedLink);

    }

    @AfterMethod
    public void afterAboutServiceButtonTest() {
        mainPage.goToMainPage();
    }

    @Test()
    public void paymentTest() {
        String testNumber = "297777777";
        String testSum = "5";
        String testMail = "test@mail.ru";

        SoftAssert softAssert = new SoftAssert();
        mainPage.inputPhone(testNumber);
        mainPage.inputSum(testSum);
        mainPage.inputEmail(testMail);
        mainPage.clickContinueButton();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
                "//*[contains(@class, 'bepaid-app')]")));
        driver.switchTo().frame(1);
        softAssert.assertEquals("Оплатить 5.00 BYN", balancePage.getPayButtonCost());
        softAssert.assertEquals("5.00 BYN", balancePage.getPayDescriptionCost());
        softAssert.assertEquals("Оплата: Услуги связи Номер:375297777777", balancePage.getPayDescriptionNumber());
        softAssert.assertEquals("Номер карты", balancePage.getCardFieldPlaceholder());
        softAssert.assertEquals("CVC", balancePage.getCvcFieldPlaceholder());
        softAssert.assertEquals("Имя держателя (как на карте)", balancePage.getHolderNameFieldPlaceholder());
        softAssert.assertEquals("Срок действия", balancePage.getValidityPeriodPlaceholder());
        softAssert.assertTrue(balancePage.isVisaLogoDisplayed());
        softAssert.assertTrue(balancePage.isMastercardLogoDisplayed());
        softAssert.assertTrue(balancePage.isBelkartLogoDisplayed());
        softAssert.assertTrue(balancePage.isMirLogoDisplayed());
        softAssert.assertTrue(balancePage.isMaestroLogoDisplayed());

        softAssert.assertAll();
    }

    @Test()
    public void connectionPlaceHolderTest() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("Номер телефона", balancePage.getConnectionPhoneNumberPlaceHolder());
        softAssert.assertEquals("Сумма", balancePage.getConnectionSumPlaceHolder());
        softAssert.assertEquals("E-mail для отправки чека", balancePage.getConnectionEmailPlaceHolder());
        softAssert.assertAll();
    }

    @Test()
    public void internetPlaceHolderTest() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("Номер абонента", balancePage.getInternetPhonePlaceHolder());
        softAssert.assertEquals("Сумма", balancePage.getInternetSumPlaceHolder());
        softAssert.assertEquals("E-mail для отправки чека", balancePage.getInternetEmailPlaceHolder());
        softAssert.assertAll();
    }

    @Test()
    public void instalmentPlaceHolderTest() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("Номер счета на 44", balancePage.getInstalmentScorePlaceHolder());
        softAssert.assertEquals("Сумма", balancePage.getInstalmentSumPlaceHolder());
        softAssert.assertEquals("E-mail для отправки чека", balancePage.getInstalmentEmailPlaceHolder());
    }

    @Test()
    public void arrearsPlaceHolderTest() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("Номер счета на 2073", balancePage.getArrearsScorePlaceHolder());
        softAssert.assertEquals("Сумма", balancePage.getArrearsSumPlaceHolder());
        softAssert.assertEquals("E-mail для отправки чека", balancePage.getArrearsEmailPlaceHolder());
        softAssert.assertAll();
    }


}
