Algoritmo "Quest16"
//               Aluno: Sérgio Felipe Starke
//17- Faça um algoritmo que leia o nome e a idade de uma pessoal.
//Determine quantos dias aproximadamente esta pessoa já
//viveu. Escreva o nome da pessoa e o número de dias vividos
Var
     nome: caracter
     idade, vividos,ano: inteiro


Inicio
     ano <- 365
     escreval("Saiba quantos dias você já viveu:")
     escreval("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨")
     escreval
     escreva("Informe seu nome: ")
     leia(nome)
     limpatela
     escreva("Informe sua idade: ")
     leia(idade)
     limpatela
     vividos <- ano * idade
     escreval("O Sr(a) ",nome,", tem o total de ",vividos," dias")

Fimalgoritmo