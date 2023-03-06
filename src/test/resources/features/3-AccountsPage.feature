@regression
@accounts-page

Feature: MULTIPAY CLIENT SLO - ACCOUNTS PAGE

  #todo trenutno ima samo jedan račun na kompaniji, proveriti sa više računa, dodati još neku proveru...
  @smoke
  Scenario: Check the existence of the List of accounts within selected client - client have 1 account
    Given homepage Header buttons - Payments, Import files, My folder - should be visible
    When click on the PRODUCTS button
    And from the opened menu click on the Accounts button
    Then Client name and account, Current balance and Available balance fields should be visible
    And PaymentsPlusIcon, E-InvoicesIcon, TransactionsIcon, StatementsIcon, MoreIcon, SwiftReceiptsIcon & DetailsIcon should be visible

    #todo
  Scenario: Check the existence of the List of accounts within selected client - client have more than 1 account

    #todo sa 2 ili vise accounta napraviti

  Scenario: Account transactions - check the existence of elements - client have 1 account
    Given homepage Header buttons - Payments, Import files, My folder - should be visible
    When click on the PRODUCTS button
    And from the opened menu click on the Accounts button
    And click the Transactions button located on account field
    And account selector should be disabled



  Scenario: Booked Account transactions - check the existence of elements - client have 1 account
    Given homepage Header buttons - Payments, Import files, My folder - should be visible
    When click on the PRODUCTS button
    And from the opened menu click on the Accounts button
    And click the Transactions button located on account field
    Then Booked TAB is selected by default
    And click on a Date Picker button & define the longest possible period
    And list of transactions should be displayed


