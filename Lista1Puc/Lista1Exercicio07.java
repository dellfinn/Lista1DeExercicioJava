package Lista1Puc;/*
 No  curso de Programação, a  nota final de um estudante é  calculada a partir de seu  desempenho
  em  três avaliações: um exame intermediário que vale 30% da nota final, um trabalho prático que
   corresponde a 20%
da  nota  final e um exame  final que  completa os 50%  restantes.  Faça um programa para ler o
nome  de  um aluno e suas notas nas três avaliações. O programa deve calcular sua nota final e
exibir a seguinte frase:
O aluno _________ teve nota final _________.


 */
import java.util.Scanner;

public
class Lista1Exercicio07 {
    public static
    void main(String[] args) {
        String Aluno= "Italo Ruan Santos de Brito";
        double n1,n2,n3,d1,d2,d3,nf;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o valor da nota 1 correspondente ao exame intermediário ");
        n1=ler.nextDouble();
        System.out.println("Informe o valor da nota 2 correspondente ao trabalho prático: ");
        n2=ler.nextDouble();
        System.out.println("Informe o valor da nota 3 correspondente ao exame final:  ");
        n3=ler.nextDouble();
// d1,d2,d3 é a somatoria da nota + seu peso
        d1 = n1*0.30;

        d2 = n2*0.20;

        d3 = n3*0.50;
//nf é nota final
        nf = d1+d2+d3;
        System.out.println("O Aluno(a) "+Aluno+" teve sua nota final : "+nf);



    }
}
