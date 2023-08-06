
@US003
Feature: US_003 Home


  Scenario: TC_001 HomePage'de karışık üniversite sıralaması görülmeli.

      When Kullanici "tr_yos" sayfasina gider
      Then Kullanici sign in olur
      And  HomePage'de oldugunu dogrular
      And  Default halinde uni siralndigini gorur
      And  Sayfayi kapatir
@cc
  Scenario: TC_002 Şehir seçilebilmeli, şehire göre üniversite ve bölüm aratılabilmeli.

    Given Kullanici "tr_yos" sayfasina gider
      When Kullanici sign in olur
      Then Search butonunun oldugunu dogrular
      And  Sehir, uni ve departmen aratir
      And  Departments sayfasina yonlendirdigini dogrular
      And  Sayfayi kapatir

