@tag
Feature: Tela de Cadastro

  @tag1
  Scenario: Efetuar Cadastro válido
  
    Given que acesse o site "http://www.automationpractice.pl/index.php?"
    And clico em Sig in
    When preencho o campo Email address
    And clico no botao Create an account
    And preencho as requisicoes
    And clico em Register
    Then efetuara o login e aparecera a "Your account has been created."