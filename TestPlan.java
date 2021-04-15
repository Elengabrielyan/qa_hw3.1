import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestPlan {
    private static WebDriver driver;

    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
        driver = new ChromeDriver();
        submitForm();
    }
    @Test(testName = "Search a specific job")
    public static void submitForm(){
        driver.get(Utils.BASE_URL);
        TheTestablePage webPage = new TheTestablePage(driver);
        webPage.getMenuSize();
        webPage.scrollDownClick();
        webPage.getFacebookLocation();
        webPage.getScrollDownSize();
        webPage.getText();
        webPage.pressSubmitButton();

    }

    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}