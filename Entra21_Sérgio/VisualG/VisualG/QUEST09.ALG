Algoritmo "Quest09"

Var
   nome: caracter
   horaTrabalho, filho, porcento: inteiro
   valorHora, salarioBase,salarioBruto: real

Inicio
     escreval("           C?lculo de Sal?rio.")
     escreval("**********************************************")
     escreva("Nome do Funcion?rio: ")
     leia(nome)
     limpatela
     escreva("Seu Trabalho ? de quantas horas? ")
     leia(horaTrabalho)
     limpatela
     escreva("Qual ? o valor por hora de trabalho? ")
     leia(valorHora)
     limpatela
     escreva("Possui filhos? Quantos? ")
     leia(filho)
     porcento <- filho * 3
     limpatela
     salarioBase <- (valorHora * horaTrabalho)
     salarioBruto <- salarioBase + (salarioBase * (porcento / 100))
     escreval("O sal?rio do Funcion?rio ",nome," ? de R$",salarioBruto)
     
Fimalgoritmo