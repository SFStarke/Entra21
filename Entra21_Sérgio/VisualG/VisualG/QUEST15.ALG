Algoritmo "Quest15"
//               Aluno: Sérgio Felipe Starke
//15- Faça um algoritmo em que o usuário irá fornecer a receita e
//as despesas de uma empresa e obtenha como resultado o
//lucro e o percentual das despesas em relação a receita
Var
     receita, despesa, lucro, porcDespesa: real
     
Inicio
     escreval("Calculo do lucro e porcentual das despesas.")
     escreval("###########################################")
     escreval
     escreva ("Informe sua receita: R$")
     leia(receita)
     limpatela
     escreval("Calculo do lucro e porcentual das despesas.")
     escreval("###########################################")
     escreval
     escreval("Informe sua despesa: R$")
     leia(despesa)
     limpatela
     lucro <- receita - despesa
     porcDespesa <- (despesa*100) / receita
     escreval("Seu lucro foi de R$",lucro)
     escreval("Seu percentual de despesa em relação a receita foi de ",porcDespesa,"%")
     
     
     

Fimalgoritmo