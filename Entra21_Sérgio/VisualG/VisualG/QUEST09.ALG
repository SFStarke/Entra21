Algoritmo "Quest09"

Var
   nome: caracter
   horaTrabalho, filho, porcento: inteiro
   valorHora, salarioBase,salarioBruto: real

Inicio
     escreval("           Cálculo de Salário.")
     escreval("**********************************************")
     escreva("Nome do Funcionário: ")
     leia(nome)
     limpatela
     escreva("Seu Trabalho é de quantas horas? ")
     leia(horaTrabalho)
     limpatela
     escreva("Qual é o valor por hora de trabalho? ")
     leia(valorHora)
     limpatela
     escreva("Possui filhos? Quantos? ")
     leia(filho)
     porcento <- filho * 3
     limpatela
     salarioBase <- (valorHora * horaTrabalho)
     salarioBruto <- salarioBase + (salarioBase * (porcento / 100))
     escreval("O salário do Funcionário ",nome," é de R$",salarioBruto)
     
Fimalgoritmo