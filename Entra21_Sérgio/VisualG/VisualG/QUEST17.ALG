Algoritmo "Quest17"
 //               Aluno: Sérgio Felipe Starke
//         Crie um algoritmo que imprima na tela as seguintes informações:
//a. A quantia que José pagou pelas ações;
//b. O valor da comissão que José pagou ao seu corretor quando ele comprou as ações;
//c. A quantia pela qual José vendeu as ações;
//d. A quantia de comissão que José pagou ao seu corretor quando ele vendeu as ações;
//e. Mostre a quantia que José ganhou ao vender as ações e pagar o corretor.
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
      escreval("José pagou a importância de R$",acaoCompra," na compra das ações.")
      escreval
      escreval("A comissão do corretor pela compra das ações foi de R$", taxaCompra)
      escreval("______________________________________________________________")
      escreval
      escreval("A venda das ações de José combinam na importância de R$",acaoVenda)
      escreval
      escreval("A comissão do corretor pela venda das ações foi de R$",taxaVenda)
      escreval("**************************************************************")
      escreval
      escreval("Pela venda das ações, José teve um retorno de R$",acaoVenda - acaoCompra)
      escreval("Sua despesa pelas comissões foram de .........R$",taxaCompra + taxaVenda)
Fimalgoritmo