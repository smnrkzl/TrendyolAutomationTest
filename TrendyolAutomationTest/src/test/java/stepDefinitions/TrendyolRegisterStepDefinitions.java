package stepDefinitions;

import Pages.TrendyolRegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class TrendyolRegisterStepDefinitions {

    WebDriver driver = DriverFactory.getDriver();
    TrendyolRegisterPage trendyolRegisterPage = new TrendyolRegisterPage(driver);
    @Given("User at register page")
    public void userAtRegisterPage() {
        trendyolRegisterPage.userAtRegisterPage();
    }

    @When("Enter a invalid {string} email field")
    public void enterAInvalidEmailField(String invalidmail) {
        trendyolRegisterPage.enterAInvalidEmailField(invalidmail);
    }

    @When("Enter a valid {string} password field")
    public void enterAValidPasswordField(String password) {
        trendyolRegisterPage.enterAValidPasswordField(password);
    }



    @When("Click on the captcha")
    public void clickOnTheCaptcha() {
        trendyolRegisterPage.clickOnTheCaptcha();
    }

    @When("Click on the sign up")
    public void clickOnTheSignUp() {
        trendyolRegisterPage.clickOnTheSignUp();
    }

    @When("Enter a valid {string} email field")
    public void enterAValidEmailField(String mail) {
        trendyolRegisterPage.enterAValidEmailField(mail);
    }

    @When("Enter a invalid {string} password field\\(Less than {int} characters)")
    public void enterAInvalidPasswordFieldLessThanCharacters(String invalidlesspassword, int arg1) {
        trendyolRegisterPage.enterAInvalidPasswordFieldLessThanCharacters(invalidlesspassword);
    }


    @When("Enter a valid {string} email field\\(Enter the registered mail)")
    public void enterAValidEmailFieldEnterTheRegisteredMail(String registeredmail) {
        trendyolRegisterPage.enterTheRegisteredMail(registeredmail);
    }



    @When("Enter a invalid {string} password field\\(More than {int} characters)")
    public void enterAInvalidPasswordFieldMoreThanCharacters(String invalidmorepassword, int arg1) {
        trendyolRegisterPage.enterAInvalidPasswordFieldMoreThanCharacters(invalidmorepassword);
    }

    @When("Enter a invalid {string} password field\\(There are no numbers)")
    public void enterAInvalidPasswordFieldThereAreNoNumbers(String nonumberpassword) {
        trendyolRegisterPage.enterAInvalidPasswordFieldThereAreNoNumbers(nonumberpassword);
    }

    @When("Enter a invalid {string} password field\\(There are no letters)")
    public void enterAInvalidPasswordFieldThereAreNoLetters(String noletters) {
        trendyolRegisterPage.enterAInvalidPasswordFieldThereAreNoLetters(noletters);
    }

    @When("Click on the accept button")
    public void clickOnTheAcceptButton() {
        trendyolRegisterPage.clickOnTheAcceptButton();
    }

    @When("Click on the checkboxMarketing")
    public void clickOnTheCheckboxMarketing() {
        trendyolRegisterPage.clickOnTheCheckboxMarketing();
    }

    @When("Click on the checkboxPersonal")
    public void clickOnTheCheckboxPersonal() {
        trendyolRegisterPage.clickOnTheCheckboxPersonal();
    }

    @Then("Check {string} message about mail")
    public void checkMessageAboutMail(String arg0) {
        trendyolRegisterPage.checkMessageAboutMail();
    }

    @Then("Check {string} message about password")
    public void checkMessageAboutPassword(String arg0) {
        trendyolRegisterPage.checkMessageAboutPassword();
    }

    @Then("Check {string} message about captcha")
    public void checkMessageAboutCaptcha(String arg0) {
        trendyolRegisterPage.checkMessageAboutCaptcha();
    }

    @When("Click on the female gender")
    public void clickOnTheFemaleGender() {
        trendyolRegisterPage.clickOnTheFemaleGender();
    }

    @When("Click on the male gender")
    public void clickOnTheMaleGender() {
        trendyolRegisterPage.clickOnTheMaleGender();
    }

    @When("Click on the sign up with google button")
    public void clickOnTheSignUpWithGoogleButton() {
        trendyolRegisterPage.clickOnTheSignUpWithGoogleButton();
    }

    @Then("Select an email address")
    public void selectAnEmailAddress() {
    }

    @When("Click on the sign up with facebook button")
    public void clickOnTheSignUpWithFacebookButton() {
        trendyolRegisterPage.clickOnTheSignUpWithFacebookButton();
    }

    @When("Enter a valid {string} facebook email field")
    public void enterAValidFacebookEmailField(String arg0) {
        trendyolRegisterPage.enterAValidFacebookEmailField();
    }

    @When("Enter a valid {string} facebook password field")
    public void enterAValidFacebookPasswordField(String arg0) {
        trendyolRegisterPage.enterAValidFacebookPasswordField();
    }

    @Then("Click on the sign up facebook")
    public void clickOnTheSignUpFacebook() {
        trendyolRegisterPage.clickOnTheSignUpFacebook();
    }
}
