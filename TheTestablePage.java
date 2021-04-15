import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

class TheTestablePage extends PageObject{

    private final String NAME = "Name";
    private final String EMAIL = "testing@testing.testing";
    private final String PHONE = "77696969";

    @FindBy(xpath= "/html/body/div[2]/div/div/div[2]/div[2]/div/a")
    private WebElement scrollDown;

    @FindBy(xpath = "//*[@id=\"cf\"]/div/div/div/div/p[3]/a[1]/i")
    private WebElement facebook;

    @FindBy(id = "androidSubmit")
    private WebElement submitLogin;

    @FindBy(id = "menuToggle")
    private WebElement menu;
    @FindBy(xpath = "//*[@id=\"description\"]/div/div/div[1]/div[2]/div[1]/h2")
    private WebElement text;

    public TheTestablePage(WebDriver driver) {
        super(driver);
    }

    public void getFacebookLocation(){
        this.facebook.getLocation();
    }
    public void getMenuSize(){
        this.menu.getSize();
    }
    public void getText(){
        this.text.getText();
    }


    public void pressSubmitButton(){
        this.submitLogin.click();
    }
    public void scrollDownClick(){
        this.scrollDown.click();
    }
    public void getScrollDownSize(){
        this.scrollDown.getSize();
    }
}