package Lista1Puc;/*
- Sabe-se que  para iluminar  de  maneira  correta os  cômodos de uma  casa,
 para   cada  m2, deve-se  utilizar 18W de potência. Faça um programa que receba
  as duas dimensões de um cômodo (em metros), calcule a sua área (em m2) e a potência
  de iluminação que deverá ser utilizada.

 */
import java.util.Scanner;
public class Lista1Exercicio08 {
    public static
    void main(String[] args) {
        double comprimento,tamanho,potencia,largura;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a largura do comado em metros: ");
        largura=ler.nextDouble();
        System.out.println("Digite o comprimento do comado em metros : ");
        comprimento=ler.nextDouble();
        tamanho =largura*comprimento;
        potencia=tamanho/18;
        System.out.println("O Tamanho do comado é "+tamanho);
        System.out.println("A potência para iluminação é "+potencia);

    }
}
