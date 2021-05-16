package Lista1Puc;/*
O custo do seguro contra granizo numa comunidade típica de fazendeiros  é 3,5%  do  valor de cobertura
 solicitado (para cada  acre), multiplicado pelo  número  de acres  plantados.  Supondo  que as
  possibilidades de colheita sejam limitadas a milho, feijão e café, faça um programa para ler
  a cobertura desejada e o número de acres plantados para cada uma das três plantações e calcular
 o custo de seguro para cada produto e o custo total do seguro para o cliente.
 */
import java.util.Scanner;
public class Lista1Exercicio04 {
    public static
    void main(String[] args) {

        double milho,feijao,cafe;
        double custoTotal,custo1,custo2,custo3;
        Scanner ler = new Scanner(System.in);

        System.out.println("informe o valor de milho : ");
        milho=ler.nextDouble();
        System.out.println("informe o valor de feijão : ");
        feijao=ler.nextDouble();
        System.out.println("informe o valor de café: ");
        cafe=ler.nextDouble();


        custo1= milho * 3.5 / 100;
        custo2= feijao * 3.5 / 100;
        custo3= cafe * 3.5 / 100;
        custoTotal=custo1+custo2+custo3;
        System.out.println(custoTotal);


    }
}
