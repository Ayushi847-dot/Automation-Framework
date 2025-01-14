package tests;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapibilities;


public class LoginTest{
     private AppiumDriver<MobileElement> driver;

     @BeforeClass
     public void setUp() throws MalformedURLException{
        //setup Appium
        DesiredCapibilities caps=new DesiredCapabilities();
        caps.setcapability("platformName","Android");
        caps.setcapability("deviceName","emulator-5554");
        caps.setcapability("app","/path/to/your/app.apk");

        driver=new AndroidDriver<>(new URL("https://localhost:4723/wd/hub"),caps);
} 
@Test
public void testLogin(){
    LoginPage loginPage=new LoginPage(driver);
    HomePage homePage=new HomePage(driver);
    //Perform Login 
    //-----Step 1: Enter the username
    loginPage.enterUsername("testUser");
    //---Step 2: Enter the pssword
    loginPage.enterPassword("password123")
    loginPage.clickLogin();
    //---Step 3: Navigate to the homepage post login and click on the navigation button
    homePage.clickNavigationButton();

}

@AfterClass
public void tearDown(){
    if(driver !=null){
        driver.quit();
            }
}
}
