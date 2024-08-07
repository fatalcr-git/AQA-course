import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
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
        Assert.assertTrue(mainPage.isVisaImgDisplayed());
        Assert.assertTrue(mainPage.isMasterCardImgDisplayed());
        Assert.assertTrue(mainPage.isMasterCardSecureImgDisplayed());
        Assert.assertTrue(mainPage.isVerifiedByVisaImgDisplayed());
        Assert.assertTrue(mainPage.isBelkartImgDisplayed());
    }

    @Test()
    public void aboutServiceButtonTest() {
        String expectedLink = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        mainPage.clickAboutServiceButton();
        Assert.assertEquals(driver.getCurrentUrl(), expectedLink);
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
        driver.switchTo().frame(0);
        mainPage.clickCancelButton();
        driver.switchTo().parentFrame();
    }
}
