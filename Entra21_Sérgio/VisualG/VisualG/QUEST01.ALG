Algoritmo "Quest01"
//Quest?o_1: Escreva um algoritmo que exiba a idade de um usu?rio qualquer.
Var
// Se??o de Declara??es das vari?veis
      dataAtual, dataNasc: inteiro
      anos: inteiro
Inicio
// Se??o de Comandos, procedimento, fun??es, operadores, etc...
      escreval("Quer saber sua idade?")
      escreva("Qual foi o ano que voc? nasceu? ")
      leia (dataNasc)
      escreval("")
      escreva("Em que ano estamos? ")
      leia(dataAtual)
      escreval("")
      anos <- dataAtual - dataNasc
      escreval("")
      limpatela
      escreval("Voc? tem ",anos," anos de idade.")
Fimalgoritmo
