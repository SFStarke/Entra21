package ListaDoisEntradaSaida;
//Compra e venda ação...

public class Quest18 {
public static void main(String[] args) {
	double totLucroVenda, totLucroCompra, totLucro;
    double uniAcaoCompra, uniAcaoVenda, totCompra, totVenda, comicaoCompra, comicaoVanda, porcentoComicao;
    int quantAcao;
    
    quantAcao = 1000;
    uniAcaoCompra = 32.87;
    uniAcaoVenda = 33.92;
    porcentoComicao = 0.02;
    
    totCompra = uniAcaoCompra * quantAcao;
    totVenda = uniAcaoVenda * quantAcao;
    comicaoCompra = totCompra * porcentoComicao;
    comicaoVanda = totVenda * porcentoComicao;
    totLucroVenda = totVenda - comicaoVanda;
    totLucroCompra = totCompra + comicaoCompra;
    totLucro = totLucroVenda - totLucroCompra;
    
    System.out.println("Valor total da compra; "+ totCompra);
    System.out.println("Valor da comissão compra: "+ comicaoCompra);
    System.out.println("Valor total venda: "+ totVenda);
    System.out.println("Valor da comissão venda: "+ comicaoVanda);
    System.out.println("Lucro ou prejuizo: "+ totLucro); 
}
}
