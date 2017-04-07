package Lista_1;


import java.util.Scanner;

/* 1. Implementar um programa que realize o cálculo e imprima a média aritmética simples
dos números 5, 6 e 9. Apresentar o valor da média com 5 dígitos após a vírgula. Para estes 
dados de entrada a saída do programa deverá mostrar o seguinte resultado:
A média de 5, 6 e 9 é igual a 6,66667 */

/* @author rockenbah*/

public class _01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int a,b,c;
        
        System.out.printf("Informe o primeiro número: ");
        a = ler.nextInt();
        
        System.out.printf("Informe o segundo número: ");
        b = ler.nextInt();
        
        System.out.printf("Informe o terceiro número: ");
        c = ler.nextInt();
        
        System.out.printf("\n Média de %d,%d e %d é igual a %1.5f",a,b,c,((double)(a+b+c)/3));
        }
}
