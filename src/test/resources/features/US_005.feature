@US005
  Feature: US_005

    Scenario: TC_001  Her sayfa altında address, navigation, my account kısımları görünmeli

      Given Kullanici "tr_yos" sayfasina gider
      When Kullanici sign in olur
    And Sayfa altında Address, navigation ve my account kısımlarının göründüğünü doğrular
    And Her sayfada olduğunu doğrular
    And Sayfayi kapatir



