package pageObjects;


import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AccountsPagePO {
    public SelenideElement AccountsClientName = $x("/html/body/div[5]/div/div[3]/div/div/div[2]/div[2]/div[1]");
    public SelenideElement AccountsClientAccountIban = $x("/html/body/div[5]/div/div[3]/div/div/div[2]/div[2]/div[2]");
    public SelenideElement AccountsClientAccountCurrentBalance = $x("/html/body/div[5]/div/div[3]/div/div/div[3]/div/div[1]");
    public SelenideElement AccountsClientAccountAvalaibleBalance = $x("/html/body/div[5]/div/div[3]/div/div/div[4]/div/div[1]");
    public SelenideElement AccountsBookedTransactions  = $x("/html/body/div[5]/div/div[2]/ul/li[1]");
    public SelenideElement TransactionsPeriodPickerBox = $(Selectors.by("id", "periodpicker-box"));
    public SelenideElement TransactionsPeriodPickerBoxDateFrom = $(Selectors.by("id", "dateFromStr"));
    public SelenideElement TransactionsPeriodPickerBoxCurrentMonth = $x("/html/body/div[5]/div/div[3]/form/div[1]/div[1]/div/div[2]/div[2]/ul/div/div/div/div[1]/div[1]/div/div/ul/li[1]/div/div[1]/table/thead/tr[1]/th[2]");
    public SelenideElement TransactionsPeriodPickerBoxCurrentYear = $x("/html/body/div[5]/div/div[3]/form/div[1]/div[1]/div/div[2]/div[2]/ul/div/div/div/div[1]/div[1]/div/div/ul/li[1]/div/div[2]/table/thead/tr/th[2]");
    public SelenideElement TransactionsPeriodPickerBox2021Year = $x("/html/body/div[5]/div/div[3]/form/div[1]/div[1]/div/div[2]/div[2]/ul/div/div/div/div[1]/div[1]/div/div/ul/li[1]/div/div[3]/table/tbody/tr/td/span[4]");
    public SelenideElement TransactionsPeriodPickerBox2021December = $x("/html/body/div[5]/div/div[3]/form/div[1]/div[1]/div/div[2]/div[2]/ul/div/div/div/div[1]/div[1]/div/div/ul/li[1]/div/div[2]/table/tbody/tr/td/span[12]");
    public SelenideElement TransactionsPeriodPickerBox2021DecemberFirst = $x("/html/body/div[5]/div/div[3]/form/div[1]/div[1]/div/div[2]/div[2]/ul/div/div/div/div[1]/div[1]/div/input");

    public SelenideElement TransactionsPeriodPickerBoxCustomFilterApplyButton = $(Selectors.by("id", "custom_filter_apply"));



}
