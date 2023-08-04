@US004
  Feature: US_004

  Scenario: TC_001 "Are You Already Working With Us?" yazısının olduğu doğrulanmalı.

    Given Kullanici "tr_yos" sayfasina gider
    When  Kullanici sign in olur
    And   sayfa sonunda Are You Already Working With Us? yazısının olduğunu dogrular
    And  Subscribe butonunun olduğu ve tıklanabilir olduğu doğrular
    And  subscribe kutusuna email girer
    And Sayfayi kapatir




