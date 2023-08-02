
  Feature: US_005

    Scenario: TC_001  Her sayfa altında address, navigation, my account kısımları görünmeli

      Given Kullanici "tr_yos" sayfasina gider
      When Kullanici sign in olur
   Then  HomePage sayfasına gider
    And Sayfa altında Address, navigation ve my account kısımlarının göründüğünü doğrular
    And Her sayfada olduğunu doğrular
    And Sayfayi kapatir


    Scenario: TC_002  Address altında Email ve telefon numarası olmalı, tıklanabilir olmalı

      Given Kullanici "tr_yos" sayfasina gider
   When  Kullanici sign in olur
    Then HomePage sayfasına gider
    And  Address kısmında Email ve telefon numarası butonlarının göründüğünü ve tıklanabilir olduğunu doğrular
    And Sayfayi kapatir


    Scenario: TC_003  Navigation altında About Us,FAQs Page,Checkout,Contact,Blog butonları görünmeli, tıklanabilir olmalı, ilgili sayfaya bağlanmalı

      Given Kullanici "tr_yos" sayfasina gider
    When Kullanici sign in olur
    Then HomePage sayfasına gider
    And Sayfa altında Navigation kısında About Us,FAQs Page,Checkout,Contact,Blog butonları görünmeli
    And Navigation altında About Us,FAQs Page,Checkout,Contact,Blog butonları tıklanabilir olmalı, tek tek tıklanmalı
    And Navigation altında About Us,FAQs Page,Checkout,Contact,Blog butonları ilgili sayfaya bağlandığı doğrulanmalı
    And Sayfayi kapatir


    Scenario: TC_004  My Account altında My Profile,My Account,Favorites butonları görünmeli, tıklanabilir olamlı ve ilgili sayfaya yönlendirmeli

      Given Kullanici "tr_yos" sayfasina gider
    When Kullanici sign in olur
    Then HomePage sayfasına gider
    And Sayfa altında My Account altında My Profile,My Account,Favorites butonları görünmeli
    And My Account altında My Profile,My Account,Favorites butonları tıklanabilir olmalı
    And My Account altında My Profile,My Account,Favorites butonları ilgili sayfaya yönlendirmeli
    And Sayfayi kapatir
