package Lista_1;

/* 4. Faça um programa que receba a idade de uma pessoa e classifique-a seguindo os critérios abaixo:
Idade               Classificação
0 a 2 anos          Recém-nascido
3 a 11 anos         Criança
12 a 19 anos        Adolescente
20 a 55 anos        Adulto
Acima de 55 anos    Idoso
Se a idade informada for menor que zero informar que a idade, neste caso, é inválida. */

/* @author rockenbah*/

import java.util.Scanner;

public class _04 {

    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int idade;
          
        System.out.printf("\nInforme a idade para obter a classificação de faixa etária: ");
        idade = ler.nextInt();
          
        if (idade < 0)
            System.out.printf("\nIdade menor que zero é inválida\n");
        else
            if (idade <= 2)
                System.out.printf("\nRecém-nascido\n");
            else
                if (idade <= 11)
                    System.out.printf("\nCriança\n");
                else
                    if (idade <= 19)
                        System.out.printf("\nAdolescente\n");
                    else
                        if (idade <= 55)
                            System.out.printf("\nAdulto\n");
                        else
                            System.out.printf("\nIdoso\n");
    }
}

