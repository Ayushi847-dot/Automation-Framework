package pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PageFactory.AppiumFieldDecorator;
import org .openqa.selenium.support.FindBy;
import org .openqa.selenium.support.PageFactory;

//LoginPage=For handling login related actions
//HomePage= For handling post login  actions like navigation
public class LoginPage{
    private AppiumDriver<MobileElement> driver;

    //Locators
    @FindBy(id="username")
    private MobileElement usernameField;

     @FindBy(id="password")
      private MobileElement passwordField;

       @FindBy(id="LoginButton")
      private MobileElement LoginButton;

    //Constructor to initialize the driver
    public LoginPage(AppiumDriver<MobileElement> driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);

    }
    //Actions
    public void enterUsername(String username){
        usernameField.sendKeys(username);
    }
     public void enterPassword(String password){
        usernameField.sendKeys(password);
    }
     public void clickLogin(){
        LoginButton.click
    }
}