package pageObjects;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class HomePagePO {

    //homepage Header buttons - Payments, Import files, My folder - should be visible
    public SelenideElement PaymentsHeaderButton = $x("/html/body/nav/div/div[3]/div/ul[1]/li[1]/a");
    public SelenideElement ImportFilesHeaderButton = $(Selectors.by("id", "btn-import-payments"));
    public SelenideElement MyFolderButton = $(Selectors.by("id", "btn-my-folder"));

    //homepage Header buttons - HomeIcon, PRODUCTS, E-INVOICES, ARCHIVE, OFFERS - should be visible"
    public SelenideElement HomeIconButton = $(Selectors.by("id", "common_label_home"));
    public SelenideElement PRODUCTSButton = $(Selectors.by("id", "multibank_authorization_title"));
    public SelenideElement PRODUCTSAccountsButton = $x("/html/body/nav/div/div[3]/div/ul[2]/li[2]/div/a[1]/span");
    public SelenideElement PRODUCTSCardsButton = $x("/html/body/nav/div/div[3]/div/ul[2]/li[2]/div/a[2]/span");
    public SelenideElement PRODUCTSCardAccountsButton = $x("/html/body/nav/div/div[3]/div/ul[2]/li[2]/div/a[3]/span");
    public SelenideElement EINVOICESButton = $x("/html/body/nav/div/div[3]/div/ul[2]/li[3]/a");
    public SelenideElement EINVOICESReceivedButton = $(Selectors.by("id", "einvoices_list_received"));
    public SelenideElement EINVOICESIssuedButton = $(Selectors.by("id", "einvoices_list_issued"));
    public SelenideElement ARCHIVEButton = $x("/html/body/nav/div/div[3]/div/ul[2]/li[4]/a");
    public SelenideElement ARCHIVEStandardPaymentsButton = $(Selectors.by("id", "multibank_payments_archive_menu_label_standard"));
    public SelenideElement ARCHIVEMassPaymentsButton = $(Selectors.by("id", "multibank_payments_archive_menu_label_mp"));
    public SelenideElement ARCHIVESDDPaymentsButton = $(Selectors.by("id", "multibank_payments_archive_menu_label_sdd"));
    public SelenideElement OFFERSButton = $(Selectors.by("id", "djp_menu"));

    //MultiPay logo should be visible
    public SelenideElement MultiPayLogo = $x("/html/body/nav/div/div[1]/ul[1]/div/a");

    //Client Selector drop down list should be visible
    public SelenideElement ClientSelectorDropDownList = $(Selectors.by("id", "select2-clientSelector-container"));


    public SelenideElement ClientSelectorClickedDropDownList = $(Selectors.by("id", "clientSelector"));

    //CloudIcon, UserProfileIcon & Logout buttons should be visible
    public SelenideElement CloudIconButton = $(Selectors.by("id", "async_queue_button_image"));
    public SelenideElement UserProfileIconButton = $x("/html/body/nav/div/div[1]/ul[2]/a[1]");
    public SelenideElement LogoutButton = $x("/html/body/nav/div/div[1]/ul[2]/a[2]");

    //GridView & ListView buttons should be visible
    public SelenideElement GridViewButton = $x("/html/body/div[5]/div/div[2]/a[1]/div");
    public SelenideElement ListViewButton = $x("/html/body/div[5]/div/div[2]/a[2]/div");

    //PaymentsPlusIcon, E-InvoicesIcon, TransactionsIcon, StatementsIcon, MoreIcon, SwiftReceiptsIcon & DetailsIcon should be visible
    public SelenideElement PaymentsPlusIconButton = $x("/html/body/div[5]/div/div[3]/div/div/div[5]/div/div[1]/div[2]/a/img");
    public SelenideElement EInvoicesIconButton = $x("/html/body/div[5]/div/div[3]/div/div/div[5]/div/div[2]/img");
    public SelenideElement TransactionsIconButton = $x("/html/body/div[5]/div/div[3]/div/div/div[5]/div/div[3]/img");
    public SelenideElement StatementsIconButton = $x("/html/body/div[5]/div/div[3]/div/div/div[5]/div/div[4]/img");
    public SelenideElement MoreIconButton = $x("/html/body/div[5]/div/div[3]/div/div/div[5]/div/div[5]/div[2]/a/img");
    public SelenideElement SwiftReceiptsIconButton = $x("/html/body/div[5]/div/div[3]/div/div/div[5]/div/div[5]/div[2]/div/a[1]");
    public SelenideElement DetailsIconButton = $x("/html/body/div[5]/div/div[3]/div/div/div[5]/div/div[5]/div[2]/div/a[2]");

    //footer Slovenščina & English buttons should be visible
    public SelenideElement SlovenscinaFooterButton = $x("/html/body/footer[1]/div/div[1]/div[1]/a");
    public SelenideElement EnglishFooterButton = $x("/html/body/footer[1]/div/div[1]/div[2]/a");

    //footer Contact phone number, email & website should be visible
    public SelenideElement ContactPhoneNumberFooter = $x("/html/body/footer[1]/div/div[2]/div[1]/div/div/a");
    public SelenideElement ContactEmailFooter = $x("/html/body/footer[1]/div/div[2]/div[2]/div/div/a");
    public SelenideElement ContactWebsiteFooter = $(Selectors.by("id", "www_halcom_com"));

    //footer Location company name, address & city should be visible
    public SelenideElement LocationCompanyNameFooter = $x("/html/body/footer[1]/div/div[3]/div/div/div[1]/div/a");
    public SelenideElement LocationCompanyAddressFooter = $x("/html/body/footer[1]/div/div[3]/div/div/div[2]/div/a");
    public SelenideElement LocationCompanyCityFooter = $x("/html/body/footer[1]/div/div[3]/div/div/div[3]/div/a");

    //footer Quick links Privacy policy, Supported banks & User-portal should be visible
    public SelenideElement QuickLinksPrivacyPolicyFooter = $x("/html/body/footer[1]/div/div[4]/div/div/div/div/a[1]");
    public SelenideElement QuickLinksSupportedBanksFooter = $x("/html/body/footer[1]/div/div[4]/div/div/div/div/a[2]");
    public SelenideElement QuickLinksUserPortalFooter = $x("/html/body/footer[1]/div/div[4]/div/div/div/div/a[3]");

    //footer Support Contact center and FAQ buttons should be visible
    public SelenideElement SupportContactCenterFooter = $x("/html/body/footer[1]/div/div[5]/div/div/a[1]");
    public SelenideElement SupportFAQFooter = $x("/html/body/footer[1]/div/div[5]/div/div/a[2]");

    //company's name on the Home Page should be the same as the name in the Client Selector field
    public SelenideElement ClientNameOnHomePage = $x("/html/body/div[5]/div/h1");


    //click on a company that is not currently selected
    public SelenideElement FirstClientInClientClientSelector = $x("/html/body/span/span/span[2]/ul/li[1]");
    public SelenideElement SecondClientInClientClientSelector = $x("/html/body/span/span/span[2]/ul/li[2]");











}
