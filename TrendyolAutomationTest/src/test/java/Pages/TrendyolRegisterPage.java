package Pages;
import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TrendyolRegisterPage {
    static WebDriver driver;
    Util.ElementHelper elementHelper;
    WebDriverWait wait;

    public TrendyolRegisterPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHelper = new ElementHelper(driver);}

    By mailBox = By.xpath("//div/input[@id='register-email']");
    By passwordBox = By.xpath("//div/input[@id='register-password-input']");

    By checkboxMarketing = By.xpath("//div[ @class='marketing-checkbox']");
    By checkboxPersonal = By.xpath("//div[@class='personal-checkbox']//div[@class='ty-mgr-2 ty-relative ty-checkbox-container']//*[name()='svg']");
    By checkboxCaptcha = By.xpath("//div[@class='personal-checkbox']//div[@class='ty-mgr-2 ty-relative ty-checkbox-container']//*[name()='svg']");
   //By checkboxCaptcha = By.xpath("//div[@class='recaptcha-checkbox-borderAnimation']");
    By signupButton = By.xpath("//div//button[@type='submit']");
    By clickAcceptButton = By.xpath("//div/button[@id='onetrust-accept-btn-handler']");
    By errorMessageBox = By.xpath("//div[@id = 'error-box-wrapper']");
    By errorMessageBoxCaptcha = By.xpath("//div[@class = 'captcha-box-wrapper']");
    By femaleButton = By.xpath("//div/button[ @class='q-gray q-fluid q-button-medium q-button female   border-right-none']");
    By maleButton = By.xpath("//div/button[ @class='q-gray q-fluid q-button-medium q-button male  ']");
    By googleButton = By.xpath("//div[ @style='background-color: rgb(241, 66, 54);']");
    By facebookButton = By.xpath("//div[ @style='background-color: rgb(76, 110, 168);']");
    By facebookemailbox = By.xpath("//div/input[@id = 'email']");
    By facebookpasswordbox = By.xpath("//div/input[@id = 'pass']");
    By facebookloginbutton = By.xpath("//div/button[@id = 'loginbutton']");
    public void userAtRegisterPage() {
        driver.get("https://www.trendyol.com/uyelik?cb=https%3A%2F%2Fwww.trendyol.com%2F%3Fysclid%3Dlk1m2ff5ex471810017");
    }

    public void enterAInvalidEmailField(String invalidmail) {
        //driver.findElement(mailBox).click();
        elementHelper.click(mailBox);
        elementHelper.sendKey(mailBox,invalidmail);
    }

    public void enterAValidPasswordField(String password) {
        //driver.findElement(passwordBox).click();
        elementHelper.click(passwordBox);
        elementHelper.sendKey(passwordBox,"validpassword123");
    }

    public void clickOnTheCaptcha() {
        //driver.findElement(checkboxCaptcha).click();
        elementHelper.click(checkboxCaptcha);
    }

    public void clickOnTheSignUp() {
        //driver.findElement(signupButton).click();
        elementHelper.click(signupButton);
    }

    public void enterAValidEmailField(String mail) {
        //driver.findElement(mailBox).click();
        elementHelper.click(mailBox);
        elementHelper.sendKey(mailBox,"semanur@gmail.com");
    }

    public void enterAInvalidPasswordFieldLessThanCharacters(String invalidlesspassword) {
        //driver.findElement(passwordBox).click();
        elementHelper.click(passwordBox);
        elementHelper.sendKey(passwordBox,"smnrkz");

    }

    public void enterTheRegisteredMail(String registeredmail) {
        //driver.findElement(mailBox).click();
        elementHelper.click(mailBox);
        elementHelper.sendKey(mailBox,"semanur@gmail.com");
    }

    public void enterAInvalidPasswordFieldMoreThanCharacters(String invalidmorepassword) {
        //driver.findElement(passwordBox).click();
        elementHelper.click(passwordBox);
        elementHelper.sendKey(passwordBox,"semanurkızılsemanurkızılsemanurkızılsemanurkızılsemanurkızıl12345");
    }

    public void enterAInvalidPasswordFieldThereAreNoNumbers(String nonumberpassword) {
        //driver.findElement(passwordBox).click();
        elementHelper.click(passwordBox);
        elementHelper.sendKey(passwordBox,"smnrkzl");
    }

    public void enterAInvalidPasswordFieldThereAreNoLetters(String noletters) {
        //driver.findElement(passwordBox).click();
        elementHelper.click(passwordBox);
        elementHelper.sendKey(passwordBox,"9959959");
    }

    public void clickOnTheAcceptButton() {
        //driver.findElement(clickAcceptButton).click();
        elementHelper.click(clickAcceptButton);
    }

    public void clickOnTheCheckboxMarketing() {
        //driver.findElement(checkboxMarketing).click();
        elementHelper.click(checkboxMarketing);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");
    }

    public void clickOnTheCheckboxPersonal() {
        //driver.findElement(checkboxPersonal).click();
        elementHelper.click(checkboxPersonal);
    }

    public void checkMessageAboutMail() {
        elementHelper.checkVisible(errorMessageBox);
    }

    public void checkMessageAboutPassword() {
        elementHelper.checkVisible(errorMessageBox);
    }

    public void checkMessageAboutCaptcha() {
        elementHelper.checkVisible(errorMessageBoxCaptcha);
    }

    public void clickOnTheFemaleGender() {
       // driver.findElement(femaleButton).click();
        elementHelper.click(femaleButton);
    }

    public void clickOnTheMaleGender() {
        //driver.findElement(maleButton).click();
        elementHelper.click(maleButton);
    }

    public void clickOnTheSignUpWithGoogleButton() {
        //driver.findElement(googleButton).click();
        elementHelper.click(googleButton);
    }

    public void clickOnTheSignUpWithFacebookButton() {
        //driver.findElement(facebookButton).click();
        elementHelper.click(facebookButton);
    }

    public void enterAValidFacebookEmailField() {
        //driver.findElement(facebookemailbox).click();
        elementHelper.click(facebookemailbox);
        elementHelper.sendKey(facebookButton,"hiyot86187@lukaat.com");
    }

    public void enterAValidFacebookPasswordField() {
        //driver.findElement(facebookpasswordbox).click();
        elementHelper.click(facebookpasswordbox);
        elementHelper.sendKey(facebookpasswordbox,"runameslizik21");
    }

    public void clickOnTheSignUpFacebook() {
        //driver.findElement(facebookloginbutton).click();
        elementHelper.click(facebookloginbutton);
    }


    //eposta doğrulama = //div/input[@class='ty-bg-beige ty-input ty-textbox ty-bordered ty-input-small']
    //eposta girişi = //div/input[@id='register-email']
    //pasword girişi = //div/input[@id='register-password-input']
    //female gender = //div/button[ @class='q-gray q-fluid q-button-medium q-button female   border-right-none']
    //male gender =   //div/button[ @class='q-gray q-fluid q-button-medium q-button male  ']
    //checkbox marketing = //div[ @class='marketing-checkbox']
    //checkbox personal = //div[ @class='personal-checkbox']
    //captcha = //div[ @class='rc-anchor-center-item rc-anchor-checkbox-holder']
    //sign up button = //div//button[@type='submit']



}
