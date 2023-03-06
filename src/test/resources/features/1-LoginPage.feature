@regression
@login-page

Feature: MULTIPAY CLIENT SLO - LOGIN PAGE



  Scenario: Analyze existence of all relevant UI elements on login page
    Given go to the MPay Client login page at the @URL
    And check the visibility of the Certificate button
    And check the visibility of the Login button Certificate
    And check the visibility of the Register button
    And check the visibility of the Slovenščina button
    And check the visibility of the English button
    And check the visibility of the Contact Center button
    And check the visibility of the Supported Banks button
    And check the visibility of the How To Join button
    And click on the Halcom One button
    And check the visibility of the Halcom One Username input field
    And check the visibility of the Login button Halcom One
    And click on the Certificate button

  @smoke @final
  Scenario: Perform successfully login
    Given go to the MPay Client login page at the @URL
    And click on the Login button
    And type @CERT_PIN code in the plugout popup window and press Enter button
    Then homepage Header buttons - Payments, Import files, My folder - should be visible


