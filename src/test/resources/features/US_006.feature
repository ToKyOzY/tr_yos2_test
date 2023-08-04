@US006
Feature: US_006

  Scenario: TC_001 Universitelerin alfabetik olarak sırralandığı doğrulanır

      Given Kullanici "tr_yos" sayfasina gider
      When Kullanici sign in olur
      Then Universities butonuna tıklar
      And Universities sayfa başlığını doğrular
      And Unilerin default sıralandığını doğrular
        And Sayfayi kapatir

Scenario: TC_002 Sıralanan üniversitelerde adres, tel no, şehir ve navigasyon işareti olduğu doğrulanır

    Given Kullanici "tr_yos" sayfasina gider
   When Kullanici sign in olur
  And Universities butonuna tıklar
  And Sıralanan üniversitelerde adres, tel no, şehir ve navigasyon işareti olduğu doğrulanır
  And Sayfayi kapatir

Scenario: TC_003 kayıtlı bütün ünileri görebilmek için sayfa numaralarının olduğu doğrulanır

    Given Kullanici "tr_yos" sayfasina gider
     When Kullanici sign in olur
  And Universities butonuna tıklar
  And Sayfa altında kayıtlı bütün ünileri görebilmek için sayfa numaralarının olduğu doğrulanır
  And Sayfayi kapatir


