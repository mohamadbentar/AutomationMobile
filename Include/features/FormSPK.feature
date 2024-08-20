@tanpaSPK
Feature: User Can Fill Form

  @tanpaSPKForm
  Scenario Outline: User can Add Data Mobil Tanpa SPK
    Given User on dashboard page tanpa SPK
    When User click antrian pengirim tanpa SPK
    And User fill in the form data tanpa SPK
    Then User successfully view data tanpa SPK

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |