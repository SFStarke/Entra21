Algoritmo "Quest18"
 //               Aluno: Sérgio Felipe Starke
//19-Faça um algoritmo que informando uma hora qualquer, retorne
//quantos minutos e segundos correspondem a hora informada.
Var
    hora, minuto, segundo: real
    
Inicio
   Escreval("Converta hora para minutos e segundos:")
   escreval("####################################")
   escreval
   escreva("Digite uma determinada hora: ")
   leia(hora)
   limpatela
   minuto  <- hora * 60
   segundo <- minuto * 60
   escreval(hora," h correspondem á:",minuto," Minutos e/ou ",segundo," Segundos.")
   escreval("__________________________________________________________________")
   escreval("     Portanto; Seria verdade a frase de Albert Einstein?")
   escreval("Falta de tempo é desculpa daqueles que perdem tempo por falta de métodos.")
   escreval("__________________________________________________________________")

Fimalgoritmo