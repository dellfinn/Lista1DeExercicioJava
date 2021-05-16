package Lista1Puc;/*
No colégio, “Minha Escolinha”,  a nota bimestral de um aluno em uma disciplina
 é a média ponderada das notas  parciais. A primeira  nota parcial tem peso 2 e a
  segunda nota parcial tem peso 3. Faça  um  programa para obter o nome e as notas
  de um aluno em uma determinada disciplina  e calcular sua média. O programa deverá exibir
  a seguinte frase:
O aluno _________ obteve média _________.
 */


//import java.util.Scanner; foi usado para importar o Scanner
import java.util.Scanner;
public class Lista1Exercicio02 {

    public static void main(String[] args) {

//As Variaveis N1 = nota 1 , n2 = nota 2
        float n1,n2;
//Desclarei Scanner como ler
        Scanner ler=new Scanner (System.in );
        System.out.println ("insira a nota 1");
//o ler é utilizado para ativar o Scanner  e ir para a proxima variavel Float
        n1=ler.nextFloat();
        System.out.println ("insira a nota 2");
        //o ler é utilizado para ativar o Scanner  e ir para a proxima variavel Float
        n2=ler.nextFloat();
        float media = 0.0f;
        media =(n1*2+n2*3)/5;
        System.out.println("sua média é :" +media +" valores");
    }
    }

