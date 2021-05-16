package Lista1Puc;

import java.util.Scanner;

public class Lista1Exercicio03 {
    public static
    void main(String[] args) {
        float a,b,c,d,e,f,x,y;
        Scanner ler = new Scanner(System.in);
        System.out.println("informe o valor de a : ");
      a=ler.nextFloat();
        System.out.println("informe o valor de b : ");
        b=ler.nextFloat();
        System.out.println("informe o valor de c: ");
        c=ler.nextFloat();
        System.out.println("informe o valor de d: ");
        d=ler.nextFloat();
        System.out.println("informe o valor de e: ");
        e=ler.nextFloat();
        System.out.println("informe o valor de f: ");
        f=ler.nextFloat();
        x =( (c*e) - (b*f) ) / ( (a*e) - (b*d) );
        y =( (a*f) - (c*d) ) / ( (a*e) - (b*d) );
        System.out.println( ("X= "+x+" e Y= "+y));


    }
}
