 @tag
Feature: Tela de Login

  @tag1
  Scenario: Efetuar Login Válido
  
    Given que acesse a url "http://www.automationpractice.pl/index.php?"
    And clico em no botao Sign in
    When preencher login e senha
    Then valido a mensagem "My account" 