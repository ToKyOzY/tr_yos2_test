
@US003
Feature: US_003


  Scenario: TC_001 HomePage'de karışık üniversite sıralaması görülmeli.

      When Kullanici "tr_yos" sayfasina gider
      Then Kullanici sign in olur
      And  HomePage'de oldugunu dogrular
      And  Default halinde uni siralndigini gorur
      And  Sayfayi kapatir

  Scenario: TC_002 Şehir seçilebilmeli, şehire göre üniversite ve bölüm aratılabilmeli.

    Given Kullanici "tr_yos" sayfasina gider
      When Kullanici sign in olur
      Then Search butonunun oldugunu dogrular
      And  Sehir aratir
      And  Sehire gore uni aratir
      Then Uniye gore bolum aratir
      And  Dogru siralandigini dogrular
      And  Departments sayfasina yonlendirdigini dogrular
      And  Sayfayi kapatir

