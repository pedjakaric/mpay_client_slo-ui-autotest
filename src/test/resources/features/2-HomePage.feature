@regression
@home-page

Feature: MULTIPAY CLIENT SLO - HOME PAGE



  Scenario: Analyze existence of all relevant UI elements on home page
    Given homepage Header buttons - Payments, Import files, My folder - should be visible
    And homepage Header buttons - HomeIcon, PRODUCTS, E-INVOICES, ARCHIVE, OFFERS - should be visible
    And MultiPay logo should be visible
    And Client Selector drop down list should be visible
    And CloudIcon, UserProfileIcon & Logout buttons should be visible
    And GridView & ListView buttons should be visible
    And PaymentsPlusIcon, E-InvoicesIcon, TransactionsIcon, StatementsIcon, MoreIcon, SwiftReceiptsIcon & DetailsIcon should be visible
    And footer Slovenščina & English buttons should be visible
    And footer Contact phone number, email & website should be visible
    And footer Location company name, address & city should be visible
    And footer Quick links Privacy policy, Supported banks & User-portal should be visible
    And footer Support Contact center and FAQ buttons should be visible

    @smoke @final
  Scenario: Check the functionality of Client Selector drop down list
      Given homepage Header buttons - Payments, Import files, My folder - should be visible
      When click on the Client Selector drop down list
      And click on a company that is not currently selected
      Then company's name on the Home Page should be the same as the name in the Client Selector field
      When click on the Client Selector drop down list
      And click on the company that was initially selected
      Then company's name on the Home Page should be the same as the name in the Client Selector field

