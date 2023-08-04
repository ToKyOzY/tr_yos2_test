
@US007
Feature: US_007

  Scenario: TC_001 Departments sayfasında olunduğu doğrulanmalı.

    Given Kullanici "tr_yos" sayfasina gider
    When  Kullanici sign in olur
    And   Departments butonuna tıklar
    And   Departments sayfasında olduğu doğrulanır
    And Sayfayi kapatir


  Scenario: TC_002 3 tane şehir, üni ve departman seçilip sıralanmalı ve istenilen şekilde sıralndığı doğrulanmalı

    Given Kullanici "tr_yos" sayfasina gider
    When  Kullanici sign in olur
    And  Departments butonuna tıklar
    And  3 tane şehir, uni ve departman seçer
    And  seçilenlerin sıralandığı doğrulanır
    And Sayfayi kapatir


  Scenario: TC_003 Min vemax price doldurulabilmeli

    Given Kullanici "tr_yos" sayfasina gider
    When  Kullanici sign in olur
    And  Departments butonuna tıklar
    And Sayfayi kapatir


  Scenario: TC_004 Seçilen üniler compare(karşılaştırma) yapılabilmeli
    Given Kullanici "tr_yos" sayfasina gider
    When  Kullanici sign in olur
   And   Departments butonuna tıklar
   And   3 tane şehir, uni ve departman seçer
   And   Seçilen uniler için compare butonuna tıklar
   And   Karşılaştırma yapildigini doğrulanır
    And Sayfayi kapatir


  Scenario: TC_005 Favori butonu olmalı tıklanabilmeli

    Given Kullanici "tr_yos" sayfasina gider
    When  Kullanici sign in olur
    And  Departments butonuna tıklar
    And  Sayfada sıralanan ünilerde favari butonuna tıklanır ve favori lambasının yandığı doğrulanır
    And Sayfayi kapatir




