Algoritmo "Quest01"
//Questão_1: Escreva um algoritmo que exiba a idade de um usuário qualquer.
Var
// Seção de Declarações das variáveis
      dataAtual, dataNasc: inteiro
      anos: inteiro
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
      escreval("Quer saber sua idade?")
      escreva("Qual foi o ano que você nasceu? ")
      leia (dataNasc)
      escreval("")
      escreva("Em que ano estamos? ")
      leia(dataAtual)
      escreval("")
      anos <- dataAtual - dataNasc
      escreval("")
      limpatela
      escreval("Você tem ",anos," anos de idade.")
Fimalgoritmo
