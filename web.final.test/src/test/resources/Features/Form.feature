@Formulario @End2End
Feature: Formulario

  @PreencherEnvioDeFormulario
  Scenario Outline: insercao de dados manuais com sucesso
    Given que o usuario esteja na pagina de formulario
    When o usuario inserir o "<primeiroNome>" no campo FirstName
    And inserir o "<sobrenome>" no campo LastName
    And inserir o "<email>" no campo Email
    And selecionar o "<genero>" no campo Gender
    And inserir o "<numeroTelefone>" no campo Mobile
    And selecionar a "<dataNascimento>" no campo Date of Birth
    And digitar a "<materiaLetra>" no camapo Subjects
    And selecionar a "<materia>" na lista exibida
    And selecionar o hobbie
    And enviar uma imagem
    And digitar o endereco no campo Current Address
    And selecionar o estado e a cidade
    And clicar no botao Submit
    Then sera exibido um popUp com os dados do formulario

    Examples: 
      | primeiroNome | sobrenome      | email            | genero | numeroTelefone | dataNascimento | materiaLetra | materia |
      | Anndrei      | Farto da Silva | andrei@gmail.com | female |     1957878806 | 07 07 1993   | m            | Maths    |
