package Lista1Puc;/*
Dona Joaninha é muito esquecida e sempre  paga suas contas depois da data do vencimento.
 Ela gostaria de ter um programa que lhe poupasse do trabalho de calcular o valor da
  multa e dos juros quando fosse pagar uma conta. Resolva  o problema de dona
  Joaninha: faça um programa que recebe o valor da conta, o número de dias
   em atraso e o valor da multa e  dos juros por dia de atraso. O
   programa deverá calcular o valor a ser pago. O programa
    deverá exibir a seguinte saída:
Valor da conta: ________
Dias em atraso:________
Total da multa: ________
Total de juros: ________
Total a pagar: _________

 */
import java.util.Scanner;

public class Lista1Exercicio06 {
    public static
    void main(String[] args) {


        double ValorDaConta,DiasEmAtraso,Totalpagar;
        double Multa,Juros;
        Scanner ler = new Scanner(System.in);
        System.out.println("informe o valor de sua conta : ");
        ValorDaConta=ler.nextDouble();
        System.out.println("A sua conta está atrasada durante quantos dias?: ");
        DiasEmAtraso=ler.nextDouble();

       Multa=ValorDaConta*0.002;


        Juros=(ValorDaConta*0.0033)*DiasEmAtraso;
        Totalpagar=ValorDaConta+Multa+Juros;


            System.out.println("O Valor da sua conta é :" + ValorDaConta);
            System.out.println("Dias em Atraso : " + DiasEmAtraso);
            System.out.println("O Valor da sua é multa de:" + Multa);
        System.out.println("O Valor da sua é do juros é de:"+Juros);
            System.out.println("O Valor total a pagar é de :" + Totalpagar);






    }
}
