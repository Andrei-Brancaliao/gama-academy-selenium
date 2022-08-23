#language: pt
@Login @End2End
Funcionalidade: Login

  Contexto: 
    Dado 

  @RealizarLoginSucesso
  Esquema do Cenario: 
    Quando 
    Entao
 
    Exemplos: 
      | usuario                 | senha        |
      | standard_user           | secret_sauce |
