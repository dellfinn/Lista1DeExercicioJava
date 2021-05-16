package Lista1Puc;

/*
Faça um programa para ler dois valores inteiros, uma para a variável A e outro para
a variável B, e para efetuar a troca dos valores de forma que a variável A passe a possuir
o valor da variável B e variável B passe a possuir o valor da variável A. OBS: Não utilize
uma variável auxiliar.
 */
public class Lista1Exercicio05 {
    public static
    void main(String[] args) {
        int A,B;
        A = 40;

        B = 20;

        A = A + B; // A = 60 e B = 20

        B = A - B; // A = 60 e B = 40

        A = A - B; // A = 20 e B = 40
        System.out.println("Valor invertido de A: " +A);
        System.out.println("Valor invertido de B: " +B);
    }
}
