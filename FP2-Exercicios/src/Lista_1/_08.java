package Lista_1;


import java.util.Scanner;

/*
8. Escreva um programa que monte as figuras a seguir para um valor obtido, por exemplo, igual a 4:
1
1 2
1 2 3
1 2 3 4
-------
1
2 2
3 3 3
4 4 4 4
*/

/* @author rockenbah */
public class _08 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i, j, k = 4;
        //System.out.printf("\n");
        for (i=1; i<=k; i++){
            for (j=1; j<=i; j++){
                System.out.printf("%d ", j);
                }
            System.out.printf("\n");
            }
        System.out.printf("-------\n");
        
        for (i=1; i<=k; i++){
            for (j=1; j<=i; j++){
                System.out.printf("%d ", i);
                }
            System.out.printf("\n");
            }
        }
    }
   
