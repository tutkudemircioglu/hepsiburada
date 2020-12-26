@login_sayfası
Feature: Login Test Senaryoları

  Scenario: Başarılı login testi
    Given Hepsiburada anasayfada giriş yap veya üye ol butonuna tıklanır
    When Hepsiburada anasayfada giriş yap butonuna tıklanır
    And Giriş ekranında eposta alanına "tutkudemirciogl@gmail.com" yazılır
    And Giriş ekranında şifre alanına "Kelimelika22!" yazılır
    And Giriş ekranında giriş yap butonuna tıklanır
    Then Giriş yapmış kullanıcı için ana ekran kontrol edilir

  Scenario: Başarısız login testi
    Given Hepsiburada anasayfada giriş yap veya üye ol butonuna tıklanır
    When Hepsiburada anasayfada giriş yap butonuna tıklanır
    And Giriş ekranında eposta alanına "tutkudemirciogl@gmail.com" yazılır
    And Giriş ekranında şifre alanına "Kelimelika22!!" yazılır
    And Giriş ekranında giriş yap butonuna tıklanır
    Then Kullanıcının giriş yapamadığı kontrol edilir

  Scenario Outline: login sonrası search
    Given Hepsiburada anasayfada giriş yap veya üye ol butonuna tıklanır
    When Hepsiburada anasayfada giriş yap butonuna tıklanır
    And Giriş ekranında eposta alanına "tutkudemirciogl@gmail.com" yazılır
    And Giriş ekranında şifre alanına "Kelimelika22!" yazılır
    And Giriş ekranında giriş yap butonuna tıklanır
    And Hepsiburada anasayfada search alanına <product> yazılır
    And Hepsiburada anasayfada search butonuna tıklanır
    When Aratılan ürününün imajları kontrol edilir

    Examples:
      | product          |
      | bilgisayar       |
      | telefon          |

  Scenario: screenshots için fail test
    Given Hepsiburada anasayfada giriş yap veya üye ol butonuna tıklanır
    When Hepsiburada anasayfada giriş yap butonuna tıklanır
    And Giriş ekranında eposta alanına "tutkudemirciogl@gmail.com" yazılır
    And Giriş ekranında şifre alanına "Kelimelika22" yazılır
    And Giriş ekranında giriş yap butonuna tıklanır
    Then Giriş yapmış kullanıcı için ana ekran kontrol edilir




