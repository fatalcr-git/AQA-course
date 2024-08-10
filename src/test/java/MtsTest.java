import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class MtsTest {
    WebDriver driver;
    MainPage mainPage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get("https://www.mts.by");
        mainPage = new MainPage(driver);
        mainPage.clickCookieAgree();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void tittleTest() {
        String expectedTitle = "Онлайн пополнение\n" +
                "без комиссии";
        Assert.assertEquals(mainPage.getFormTittle(), expectedTitle);
    }

    @Test
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
        mainPage.clickAboutServiceButton();
        Assert.assertEquals(driver.getCurrentUrl(), expectedLink);

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

        mainPage.inputPhone(testNumber);
        mainPage.inputSum(testSum);
        mainPage.inputEmail(testMail);
        mainPage.clickContinueButton();
        Assert.assertTrue(mainPage.isPaidFrameDisplayed());
    }
}
