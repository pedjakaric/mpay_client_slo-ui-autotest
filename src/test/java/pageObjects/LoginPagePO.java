package pageObjects;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPagePO {
    //get web elements(buttons, fields, messages...) from Login Page

    public SelenideElement certificateButton = $x("/html/body/div[2]/div/div/div[1]/div[1]/div[1]/ul/li[1]/a/div");

    //todo only 1 login button should be mapped. There are 2 now > loginButtonCertificate and loginButtonHalcomOne
    public SelenideElement loginButtonCertificate = $x("/html/body/div[2]/div/div/div[1]/div[1]/div[2]/div[1]/form/button");
    public SelenideElement loginButtonHalcomOne = $x("/html/body/div[2]/div/div/div[1]/div[1]/div[2]/div[2]/form/button");
    public SelenideElement registerButton = $x("/html/body/div[2]/div/div/div[1]/div[1]/div[2]/div[1]/a");
    public SelenideElement slovenscinaImageButton = $x("/html/body/div[2]/div/div/div[1]/div[2]/div[1]/a[1]");
    public SelenideElement slovenscinaTextButton = $x("/html/body/div[2]/div/div/div[1]/div[2]/div[1]/a[2]");
    public SelenideElement englishImageButton = $x("/html/body/div[2]/div/div/div[1]/div[2]/div[2]/a[1]");
    public SelenideElement englishTextButton = $x("/html/body/div[2]/div/div/div[1]/div[2]/div[2]/a[2]");
    public SelenideElement contactCentarButton = $(Selectors.by("id", "contact_us"));
    public SelenideElement supportedBanksButton = $(Selectors.by("id", "supported_banks"));
    public SelenideElement howToJoinButton = $(Selectors.by("id", "how_to_join"));
    public SelenideElement halcomOneButton = $x("/html/body/div[2]/div/div/div[1]/div[1]/div[1]/ul/li[2]/a");

    //postoje 2 elementa sa id-jem "visiblej_username" i ako ga trazimo po id-ju kaze da je hidden, posto je 1 element hidden
    // public SelenideElement halcomOneUsernameInputField = $(Selectors.by("id", "visiblej_username"));
    public SelenideElement halcomOneUsernameInputField = $x("/html/body/div[2]/div/div/div[1]/div[1]/div[2]/div[2]/input[2]");
    public SelenideElement appLoginPopUpCancelButton = $(Selectors.by("id", "nexusSignatureCancel"));



}
