Algoritmo "Quest17"
 //               Aluno: S?rgio Felipe Starke
//         Crie um algoritmo que imprima na tela as seguintes informa??es:
//a. A quantia que Jos? pagou pelas a??es;
//b. O valor da comiss?o que Jos? pagou ao seu corretor quando ele comprou as a??es;
//c. A quantia pela qual Jos? vendeu as a??es;
//d. A quantia de comiss?o que Jos? pagou ao seu corretor quando ele vendeu as a??es;
//e. Mostre a quantia que Jos? ganhou ao vender as a??es e pagar o corretor.
Var
   compraCadaAcao, acaoCompra, acaoVenda, vendaCadaAcao ,taxaCompra, taxaVenda: real
   totalAcao: inteiro
Inicio
//totalAcao <- 1000
//compraCadaAcao <- 32.87
//vendaCadaAcao  <- 33.92
//acaoCompra <- compraCadaAcao *  totalAcao
//acaoVenda  <- vendaCadaAcao *  totalAcao
      acaoCompra <- 32870
      acaoVenda  <- 33920
      taxaCompra <- (acaoCompra * 2) / 100
      taxaVenda  <- (acaoVenda * 2) / 100
      escreval("**************************************************************")
      escreval("Jos? pagou a import?ncia de R$",acaoCompra," na compra das a??es.")
      escreval
      escreval("A comiss?o do corretor pela compra das a??es foi de R$", taxaCompra)
      escreval("______________________________________________________________")
      escreval
      escreval("A venda das a??es de Jos? combinam na import?ncia de R$",acaoVenda)
      escreval
      escreval("A comiss?o do corretor pela venda das a??es foi de R$",taxaVenda)
      escreval("**************************************************************")
      escreval
      escreval("Pela venda das a??es, Jos? teve um retorno de R$",acaoVenda - acaoCompra)
      escreval("Sua despesa pelas comiss?es foram de .........R$",taxaCompra + taxaVenda)
Fimalgoritmo