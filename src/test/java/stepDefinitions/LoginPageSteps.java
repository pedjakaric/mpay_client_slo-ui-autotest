package stepDefinitions;

import com.halcom.properties.Properties;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.HomePagePO;
import pageObjects.LoginPagePO;
import stepDefinitions.base.RobotThread;

import java.awt.*;
import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static com.halcom.properties.Properties.*;

public class LoginPageSteps {
    LoginPagePO loginPage = new LoginPagePO();
    HomePagePO homePage = new HomePagePO();



    @Given("go to the MPay Client login page at the @URL")
    public void go_to_the_m_pay_client_login_page_at_the_url() throws Exception {
        if(robotThreadStarted==false) {
            new RobotThread();
            robotThreadStarted = true;
        }
        open(getPropertyValue("URL", mPayClientPropertyFile));

    }
    @And("check the visibility of the Certificate button")
    public void check_the_visibility_of_the_certificate_button() {
        loginPage.certificateButton.shouldBe(visible);
    }
    @And("check the visibility of the Login button Certificate")
    public void check_the_visibility_of_the_login_button() {
        loginPage.loginButtonCertificate.shouldBe(visible);
    }
    @And("check the visibility of the Register button")
    public void check_the_visibility_of_the_register_button() {
        loginPage.registerButton.shouldBe(visible);
    }
    @And("check the visibility of the Slovenščina button")
    public void check_the_visibility_of_the_slovenscina_button() {
        loginPage.slovenscinaImageButton.shouldBe(visible);
        loginPage.slovenscinaTextButton.shouldBe(visible);
    }
    @And("check the visibility of the English button")
    public void check_the_visibility_of_the_english_button() {
        loginPage.englishImageButton.shouldBe(visible);
        loginPage.englishTextButton.shouldBe(visible);
    }
    @And("check the visibility of the Contact Center button")
    public void check_the_visibility_of_the_contact_center_button() {
        loginPage.contactCentarButton.shouldBe(visible);
    }
    @And("check the visibility of the Supported Banks button")
    public void check_the_visibility_of_the_supported_banks_button() {
        loginPage.supportedBanksButton.shouldBe(visible);
    }
    @And("check the visibility of the How To Join button")
    public void check_the_visibility_of_the_how_to_join_button() {
        loginPage.howToJoinButton.shouldBe(visible);
    }
    @And("click on the Halcom One button")
    public void click_on_the_halcom_one_button() throws InterruptedException {
        loginPage.halcomOneButton.click();
        Thread.sleep(3000);
    }
    @And("check the visibility of the Halcom One Username input field")
    public void check_the_visibility_of_the_halcom_one_username_input_field() {
        loginPage.halcomOneUsernameInputField.shouldBe(visible);
        loginPage.halcomOneUsernameInputField.sendKeys("test");
    }


    @And("check the visibility of the Login button Halcom One")
    public void checkTheVisibilityOfTheLoginButtonHalcomOne() {
        loginPage.loginButtonHalcomOne.shouldBe(visible);
    }

    @And("click on the Certificate button")
    public void clickOnTheCertificateButton() {
        loginPage.certificateButton.click();
    }

    @And("click on the Login button")
    public void clickOnTheLoginButton() {
        loginPage.loginButtonCertificate.click();
    }

    @And("type @CERT_PIN code in the plugout popup window and press Enter button")
    public void typeCERTPINCodeInThePlugoutPopupWindowAndPressEnterButton() throws Exception {
        //todo da li je dovoljan 20 sec testirati
        loginPage.appLoginPopUpCancelButton.shouldBe(visible, Duration.ofSeconds(Properties.TIMEOUT_FOR_ELEMENT_TO_APPEAR));
        Thread.sleep(2000);
        RobotThread.robotPressLeftOK(new Robot());
        RobotThread.robotEnterPin(new Robot(), getPropertyValue("CERT_PIN", mPayClientPropertyFile));
        RobotThread.robotPressEnter(new Robot());
    }


    @Then("homepage Header buttons - Payments, Import files, My folder - should be visible")
    public void homepageHeaderButtonsPaymentsImportFilesMyFolderShouldBeVisible() {
        homePage.PaymentsHeaderButton.shouldBe(visible, Duration.ofSeconds(Properties.TIMEOUT_FOR_ELEMENT_TO_APPEAR));
        homePage.ImportFilesHeaderButton.shouldBe(visible);
        homePage.MyFolderButton.shouldBe(visible);
    }


}
