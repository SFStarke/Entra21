Algoritmo "Quest15"
//               Aluno: S?rgio Felipe Starke
//15- Fa?a um algoritmo em que o usu?rio ir? fornecer a receita e
//as despesas de uma empresa e obtenha como resultado o
//lucro e o percentual das despesas em rela??o a receita
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
     escreval("Seu percentual de despesa em rela??o a receita foi de ",porcDespesa,"%")
     
     
     

Fimalgoritmo