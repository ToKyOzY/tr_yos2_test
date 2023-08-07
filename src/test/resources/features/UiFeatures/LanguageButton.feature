
@Language

Feature: Language button

  Scenario: Sayfa dilini degistirebilir

    When Kullanici "tr_yos" sayfasina gider
    Then Kullanici sign in olur
    And  Ana sayfadaki on tane dili tek tek degistirip dogrular
    And Sayfayi kapatir
