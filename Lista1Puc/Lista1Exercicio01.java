package Lista1Puc;/*
       1 –  Faça um programa que receba como entrada o nome e o salário de um funcionário de uma empresa
        e que calcule  o  novo  valor  do  salário  do  funcionário  levando  em  conta  que  esse  teve
         um  aumento  de  25%.  O programa deve exibir na saída a seguinte frase
O funcionário ________ teve um aumento de R$ _______ e passará a receber um salário de  R$ ________

        */

public class Lista1Exercicio01 {
    public static
    void main(String[] args) {

       double salario =1500;
       String fucionario= "Italo Ruan Santos de Brito";

       salario = salario + (salario *0.25);

        System.out.println("Seu salario anterior era de 1500");
        System.out.println("O funcionário"+fucionario+"teve um aumento de R$ 375 e passará a receber um salário de " +salario+""  );

    }
}