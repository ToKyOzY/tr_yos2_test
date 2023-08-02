
  Feature: US_004

  Scenario: TC_001 "Are You Already Working With Us?" yazısının olduğu doğrulanmalı.

    Given Kullanici "tr_yos" sayfasina gider
    When  Kullanici sign in olur
    Then  HomePage sayfasına gider
    And   sayfa sonunda "Are You Already Working With Us?" yazısının olduğunu dogrular
    And Sayfayi kapatir


  Scenario: TC_002 Subscribe butonu tıklanabilir olmalı

      When Kullanici "tr_yos" sayfasina gider
      Then Kullanici sign in olur
      And  HomePage sayfasına gider
      And  Subscribe butonunun olduğu ve tıklanabilir olduğu doğrulThen
    And Sayfayi kapatir


    Scenario: TC_003 Email girilebilmeli

   Given Kullanici "tr_yos" sayfasina gider
    When Kullanici sign in olur
    Then HomePage sayfasına gider
    And  subscribe kutusuna email girer
      And Sayfayi kapatir



