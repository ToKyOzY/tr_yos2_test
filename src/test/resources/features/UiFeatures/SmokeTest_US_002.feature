
@smoke
Feature: US_002 Login

  Background:
    Given Kullanici "tr_yos" sayfasina gider
    When Kullanici sign in butonuna tiklar

 @aa
  Scenario: TC_001 Giriş yapmak için başarı mesajını doğrulayan, geçerli bir "User Name" ve "Password" olmalıdır.


     Then Gecerli email girer
      And Gecerli password girer
      And Login butonuna tiklar
      And Homepage sayfasinda oldugunu dugrular
      And Sayfayi kapatir
@bb
  Scenario: TC_002 Kullanıcının mevcut kimlik bilgilerini her zaman kullanabileceği, "Save Password" seçeneği olmalıdır


    Then  Save password butonunun gorunur ve tiklanabilir oldugunu dogrular
    And Sayfayi kapatir

  Scenario: TC_003 Eğer şifre unutulursa diye "forget password?" seçeneği olmalıdır.


    Then  forget password butonunun gorunur ve tiklanabilir oldugunu dogrular
     And  forget password butonunun sifre yenileme sayfasina yonlendirdigini dogrular
    And Sayfayi kapatir

  Scenario: TC_004 "Don't have an account yet? Sign Up" seçeneği olmalıdır.


    Then Don't have an account yet? Sign Up kisminin oldugu ve signup butonunun tiklanabilir oldugunu dogrular
     And Sign up butonuna tiklaninca dogru yonlendirdigini dogrular
    And Sayfayi kapatir


