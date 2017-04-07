package Lista_1;

/*
 2. Leia dois números inteiros, variáveis “a” e “b”, para avaliar e apresentar “todas” as relações existentes
    entre estes dois valores. As operações de relação de valores são: ==, !=, <, <=, > e >=.
    Exemplo 1: para a = 2; e b = 8; Exemplo 2: para a = 7; e b = 3;
    2 é diferente de 8 7 é diferente de 3
    2 é menor do que 8 7 é maior do que 3
    2 é menor ou igual a 8 7 é maior ou igual a 3 */

/*@author rockenbah*/

import java.util.Scanner;

public class _02 {

  
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int a,b;
        
        System.out.printf("Informe o primeiro número: ");
        a = ler.nextInt();
        
        System.out.printf("Informe o segundo número: ");
        b = ler.nextInt();
        
        if (a == b) 
            System.out.printf("\n %d é igual a %d",a,b);
        else 
            System.out.printf("\n %d é diferente de %d",a,b);
        
        if (a <= b)
            System.out.printf("\n %d é menor igual a %d",a,b);
        else
            System.out.printf("\n %d é maior que %d",a,b);
        
        if (a >= b)
            System.out.printf("\n %d é maior igual a %d",a,b);
        else
            System.out.printf("\n %d é menor que %d",a,b);
        
    }    
}
