package Lista1Puc;/*
Desenvolver um programa para calcular a Composição de Lucros .
 Um problema comum na área financeira é a determinação da quantia
  que será acumulada em uma conta bancária depois de
   n anos, conhecendo-se a quantia inicial depositada, e os
  rendimentos anuais dessa conta, r por cento ao ano. A resposta a essa questão

Obs.: usando a função potencial pow(base,expoente) da diretiva #include <math.h>

F  =  p * pow ( (1+i) , n);

Seguindo os passos:
1. Declarar as variáveis
2. Ler os valores de p(principal), r(taxa de lucro) e n(número de anos)
3. Calcular a representação decimal da taxa de lucro(i) : i = r/100
4. Determinar a quantia que será acumulada: F = p(1 + i)
5. Exibir o valor F calculado.
 */
import java.util.Scanner;

public
class Lista1Exercicio09 {
    public static
    void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double ValorPrincipal,TaxaDeLucro,NumeroDeMeses,LucroGerado,SaldoTotalGerado;

        System.out.println("Digite o valor do investimento para simular o seu lucro: ");
        ValorPrincipal=ler.nextDouble();
        System.out.println("Informe a Taxa de lucro : ");
        TaxaDeLucro=ler.nextDouble();
        System.out.println("informe a quantia de meses: ");
        NumeroDeMeses=ler.nextDouble();
        TaxaDeLucro= TaxaDeLucro/100;
        LucroGerado=(ValorPrincipal*TaxaDeLucro)*NumeroDeMeses;
        SaldoTotalGerado=ValorPrincipal+LucroGerado;



        System.out.println("Voce investiu "+ValorPrincipal+ "durante "+NumeroDeMeses+"meses e o lucro gerado durante esses meses foi de "+LucroGerado+"e o Saldo de sua conta + lucro gerado é de "+SaldoTotalGerado );






    }
}
