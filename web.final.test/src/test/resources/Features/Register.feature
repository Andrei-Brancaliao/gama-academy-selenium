@Register
Feature: Registro de novo usuario
  I want to use this template for my feature file

  @registrarSucesso
  Scenario Outline: Registrar com sucesso
    Given I am at the register page
    When I fill the first name as "<firstName>"
    And fill the last name as "<lastName>"
    And fill the username as "<username>"
    And fill the password as "<password>"
    And bypass the captcha
    And click on register
    Then it will show a successful register popUp

    Examples: 
      | firstName | lastName | username    | password |
      | andrei    | farto    | andreiteste |   123456 |
