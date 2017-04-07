package Lista_1;

/* 6. Escreva um programa que realize a multiplicação de dois números informados pelo usuário através de somas 
sucessivas, ou seja, para fazer A X B basta somar o valor da variável A, B vezes.*/
/* @author rockenbah*/
import java.util.Scanner;

public class _06 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int a,b,total = 0;
        
        System.out.printf("\nInsira aqui o valor de A: ");
        a = ler.nextInt();
        
        System.out.printf("\nInsira aqui o valor de B: ");
        b = ler.nextInt();
        
        for (int i=0; i<b; i++)
        {
            total += a;
            }
        System.out.printf("\nO resultado da multiplicação entre %d por %d em somas sucessivas é: %d\n",a,b,total);
        }
}
