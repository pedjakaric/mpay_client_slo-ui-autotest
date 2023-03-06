package stepDefinitions;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pageObjects.HomePagePO;
import stepDefinitions.base.RobotThread;

import java.awt.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.halcom.properties.Properties.TIMEOUT_FOR_ELEMENT_TO_APPEAR;

public class HomePageSteps {
    HomePagePO homePage = new HomePagePO();
    String currentlySelectedClientID;
    String newSelectedClientID;



    @And("homepage Header buttons - HomeIcon, PRODUCTS, E-INVOICES, ARCHIVE, OFFERS - should be visible")
    public void homepageHeaderButtonsHomeiconProductsEivoicesArchiveOffersShouldBeVisible() {
        homePage.HomeIconButton.shouldBe(visible);
        homePage.PRODUCTSButton.shouldBe(visible).click();
        homePage.PRODUCTSAccountsButton.shouldBe(visible);
        homePage.PRODUCTSCardsButton.shouldBe(visible);
        homePage.PRODUCTSCardAccountsButton.shouldBe(visible);
        homePage.EINVOICESButton.shouldBe(visible).click();
        homePage.EINVOICESReceivedButton.shouldBe(visible);
        homePage.EINVOICESIssuedButton.shouldBe(visible);
        homePage.ARCHIVEButton.shouldBe(visible).click();
        homePage.ARCHIVEStandardPaymentsButton.shouldBe(visible);
        homePage.ARCHIVEMassPaymentsButton.shouldBe(visible);
        homePage.ARCHIVESDDPaymentsButton.shouldBe(visible);
        homePage.OFFERSButton.shouldBe(visible);
    }

    @And("MultiPay logo should be visible")
    public void multipayLogoShouldBeVisible() {
        homePage.MultiPayLogo.shouldBe(visible);
    }

    @And("Client Selector drop down list should be visible")
    public void clientSelectorDropDownListShouldBeVisible() {
        homePage.ClientSelectorDropDownList.shouldBe(visible);
    }

    @And("CloudIcon, UserProfileIcon & Logout buttons should be visible")
    public void cloudiconUserProfileIconLogoutButtonsShouldBeVisible() {
        homePage.CloudIconButton.shouldBe(visible);
        homePage.UserProfileIconButton.shouldBe(visible);
        homePage.LogoutButton.shouldBe(visible);
    }

    @And("GridView & ListView buttons should be visible")
    public void gridviewListViewButtonsShouldBeVisible() {
        homePage.GridViewButton.shouldBe(visible);
        homePage.ListViewButton.shouldBe(visible);
    }


    @And("PaymentsPlusIcon, E-InvoicesIcon, TransactionsIcon, StatementsIcon, MoreIcon, SwiftReceiptsIcon & DetailsIcon should be visible")
    public void paymentsplusiconEInvoicesIconTransactionsIconStatementsIconMoreIconSwiftReceiptsIconDetailsIconShouldBeVisible() {
        homePage.PaymentsPlusIconButton.shouldBe(visible);
        homePage.EInvoicesIconButton.shouldBe(visible);
        homePage.TransactionsIconButton.shouldBe(visible);
        homePage.StatementsIconButton.shouldBe(visible);
        homePage.MoreIconButton.shouldBe(visible).click();
        homePage.SwiftReceiptsIconButton.shouldBe(visible);
        homePage.DetailsIconButton.shouldBe(visible);
    }

    @And("footer Slovenščina & English buttons should be visible")
    public void footerSlovenščinaEnglishButtonsShouldBeVisible() {
        homePage.SlovenscinaFooterButton.shouldBe(visible);
        homePage.EnglishFooterButton.shouldBe(visible);
    }

    @And("footer Contact phone number, email & website should be visible")
    public void footerContactPhoneNumberEmailWebsiteShouldBeVisible() {
        homePage.ContactPhoneNumberFooter.shouldBe(visible);
        homePage.ContactEmailFooter.shouldBe(visible);
        homePage.ContactWebsiteFooter.shouldBe(visible);

    }

    @And("footer Location company name, address & city should be visible")
    public void footerLocationCompanyNameAddressCityShouldBeVisible() {
        homePage.LocationCompanyNameFooter.shouldBe(visible);
        homePage.LocationCompanyAddressFooter.shouldBe(visible);
        homePage.LocationCompanyCityFooter.shouldBe(visible);
    }

    @And("footer Quick links Privacy policy, Supported banks & User-portal should be visible")
    public void footerQuickLinksPrivacyPolicySupportedBanksUserPortalShouldBeVisible() {
        homePage.QuickLinksPrivacyPolicyFooter.shouldBe(visible);
        homePage.QuickLinksSupportedBanksFooter.shouldBe(visible);
        homePage.QuickLinksUserPortalFooter.shouldBe(visible);
    }

    @And("footer Support Contact center and FAQ buttons should be visible")
    public void footerSupportContactCenterAndFAQButtonsShouldBeVisible() {
        homePage.SupportContactCenterFooter.shouldBe(visible);
        homePage.SupportFAQFooter.shouldBe(visible);
    }



    @When("click on the Client Selector drop down list")
    public void clickOnTheClientSelectorDropDownList() throws Exception {
        Thread.sleep(1000);
        homePage.ClientSelectorDropDownList.click(ClickOptions.withTimeout(Duration.ofSeconds(TIMEOUT_FOR_ELEMENT_TO_APPEAR)));
    }

    @And("click on a company that is not currently selected")
    public void clickOnACompanyThatIsNotCurrentlySelected() throws Exception {
        Thread.sleep(1000);
        if (homePage.ClientSelectorDropDownList.getAttribute("title").contains("MULTIBANK")) {
            homePage.SecondClientInClientClientSelector.click(ClickOptions.withTimeout(Duration.ofSeconds(TIMEOUT_FOR_ELEMENT_TO_APPEAR)));
        }else {
            homePage.FirstClientInClientClientSelector.click(ClickOptions.withTimeout(Duration.ofSeconds(TIMEOUT_FOR_ELEMENT_TO_APPEAR)));
        }

    }

    @Then("company's name on the Home Page should be the same as the name in the Client Selector field")
    public void companySNameOnTheHomePageShouldBeTheSameAsTheNameInTheClientSelectorField() throws InterruptedException {
        Thread.sleep(1000);
        homePage.ClientNameOnHomePage.shouldHave(text(homePage.ClientSelectorDropDownList.getAttribute("title")));
    }

    @And("click on the company that was initially selected")
    public void clickOnTheCompanyThatWasInitiallySelected() throws Exception {
        Thread.sleep(1000);
        if (homePage.ClientSelectorDropDownList.getAttribute("title").contains("MULTIBANK")) {
            homePage.SecondClientInClientClientSelector.click(ClickOptions.withTimeout(Duration.ofSeconds(TIMEOUT_FOR_ELEMENT_TO_APPEAR)));
        }else {
            homePage.FirstClientInClientClientSelector.click(ClickOptions.withTimeout(Duration.ofSeconds(TIMEOUT_FOR_ELEMENT_TO_APPEAR)));
        }
        Thread.sleep(10000);
    }
}
