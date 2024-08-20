@Filter
Feature: User Can all filter

  @filter_tanggal_kirim
  Scenario Outline: Filter tanggal kirim 
    Given User on dashboard page
    When User click antrian pengirim
    And User select filter tanggal kirim
    Then User successfully view tanggal kirim list


    Examples: 
      | Tanggal Kirim |
      | 20/08/2024 		|
      
  @filter_no_polisi
  Scenario Outline: Filter nomor polisi
    Given User on dashboard page
    When User click antrian pengirim
    And User select filter nomor polisi
    Then User successfully view nomor polisi list

    Examples: 
      | Nomor Polisi	|
      | B 9090 B			|
      
   @filter_spk_eksternal
  Scenario Outline: Filter spk eksternal
    Given User on dashboard page
    When User click antrian pengirim
    And User select filter spk eksternal
    Then User successfully view spk eksternal list

    Examples: 
      | spk eksternal |
      |  B 9090 B				|
      
   @filter_spk_internal
  Scenario Outline: Filter spk internal
    Given User on dashboard page
    When User click antrian pengirim
    And User select filter spk internal
    Then User successfully view spk internal list

    Examples: 
      | spk internal	|
      |  B 9090 B				|
      
   @filter_tanpa_spk
  Scenario Outline: Filter tanpa spk
    Given User on dashboard page
    When User click antrian pengirim
    And User select filter tanpa spk
    Then User successfully view tanpa spk list

    Examples: 
      | spk internal	|
      |  B 9090 B			|