Algoritmo "Quest12"
//               Aluno: Sérgio Felipe Starke
//12) - Escreva um algoritmo que armazene o valor 10 em uma variável A e o
//valor 20 em uma variável B. A seguir (utilizando apenas atribuições entre
//variáveis) troque os seus conteúdos fazendo com que o valor que está em
//A passe para B e vice-versa. Ao final, escreve os valores que ficaram
//armazenados nas variáveis.

Var
   a, b, troca: inteiro

Inicio
     a <- 10
     b <- 20
     b <- a
     a <- b
     escreval("A",a," | B",b)

Fimalgoritmo