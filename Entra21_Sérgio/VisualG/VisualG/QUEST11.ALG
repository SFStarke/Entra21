Algoritmo "Quest11"

Var
        pacote, avulsa: inteiro
        precoPacote, precoAvulso: real

Inicio
        escreval("           Revelação de fotos")
        escreval("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨")
        escreva("Informe o numero de fotos avulsas: ")
        leia(avulsa)
        limpatela
        escreva("Informe o numero de pacotes: ")
        leia(pacote)
        limpatela
        precoAvulso <- avulsa * 0.70
        precoPacote <- pacote * 44
        escreval("Revelação avulsa:    R$",precoAvulso)
        escreval("Revelação em pacote: R$", precoPacote)
        
Fimalgoritmo