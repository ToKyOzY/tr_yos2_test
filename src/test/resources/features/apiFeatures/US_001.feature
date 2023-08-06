
@api1
Feature: US001 KUllanici bilgileri api ile dogrulama

  Scenario: TC_001
    When kullanici pathparams ayarlamasini yapar
    Then kullanici accountlarin bilgilerini alir
    And  kullanici alinan bilgilerin dogrulamasini yapar