package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.AccountsPagePO;
import pageObjects.HomePagePO;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class AccountsPageSteps {
    HomePagePO homePage = new HomePagePO();
    AccountsPagePO accountsPage = new AccountsPagePO();

    @When("click on the PRODUCTS button")
    public void clickOnTheProductsButton() {
        homePage.PRODUCTSButton.click();
    }

    @And("from the opened menu click on the Accounts button")
    public void fromTheOpenedMenuClickOnTheAccountsButton() {
        homePage.PRODUCTSAccountsButton.click();
    }

    @Then("Client name and account, Current balance and Available balance fields should be visible")
    public void clientNameAndAccountCurrentBalanceAndAvailableBalanceFieldsShouldBeVisible() {
        accountsPage.AccountsClientName.shouldBe(visible);
        accountsPage.AccountsClientName.shouldHave(text(homePage.ClientSelectorDropDownList.getAttribute("title")));

        accountsPage.AccountsClientAccountIban.shouldBe(visible);
        accountsPage.AccountsClientAccountCurrentBalance.shouldBe(visible);
        accountsPage.AccountsClientAccountAvalaibleBalance.shouldBe(visible);
    }

    @And("click the Transactions button located on account field")
    public void clickTheTransactionsButtonLocatedOnAccountField() {
        homePage.TransactionsIconButton.click();
    }

    @And("account selector should be disabled")
    public void accountSelectorShouldBeDisabled() {
        //todo videti kad mi se na nekoj firmi kreira jos jedan racun
    }

    @Then("Booked TAB is selected by default")
    public void bookedTABIsSelectedByDefault() {
        Assert.assertEquals(accountsPage.AccountsBookedTransactions.getAttribute("class"), ("tab active backbutton  "));

    }

    @And("click on a Date Picker button & define the longest possible period")
    public void clickOnADatePickerButtonDefineTheLongestPossiblePeriod() throws InterruptedException {
        accountsPage.TransactionsPeriodPickerBox.click();
        accountsPage.TransactionsPeriodPickerBoxDateFrom.click();
        accountsPage.TransactionsPeriodPickerBoxCurrentMonth.click();
        accountsPage.TransactionsPeriodPickerBoxCurrentYear.click();
        accountsPage.TransactionsPeriodPickerBox2021Year.click();
        accountsPage.TransactionsPeriodPickerBox2021December.click();
        accountsPage.TransactionsPeriodPickerBox2021DecemberFirst.click();
        accountsPage.TransactionsPeriodPickerBoxCustomFilterApplyButton.click();
        Thread.sleep(10000);
    }

    @And("list of transactions should be displayed")
    public void listOfTransactionsShouldBeDisplayed() {
    }

}
