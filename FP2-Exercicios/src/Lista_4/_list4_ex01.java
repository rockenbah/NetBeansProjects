/*
 1. Ler 7 números inteiro e armazená-los em um vetor “A”. Construir um vetor “B” de mesmo tamanho,
sendo que cada elemento do vetor “B” deverá ser a raiz quadrada do respectivo elemento de “A”. Dicas:
// declaração das variáveis
int i, n = 7;
int A[] = new int[n];
double B[] = new double[n];
B[i] = Math.sqrt(A[i]); // para calcular a raiz quadrada do i-ésimo elemento do vetor “A”
 */
package Lista_4;

import java.util.Scanner;

/* @author rockenbah*/
public class _list4_ex01 {

    public static void main(String[] args) {
        
       Scanner input = new Scanner (System.in);
        int i, n=7;
        int a[] = new int[n];
        double b[] = new double[n];
        
        System.out.printf("Entre com números inteiros para preencher o vetor de %d posições",n);
        System.out.println();
        
        
       for (i=0;i<n;i++){
           System.out.printf("Posição A[%d] -> ",i);
           a[i] = input.nextInt();
       }
        
       System.out.println();
        
       for (i=0;i<n;i++){
           b[i] = Math.sqrt(a[i]);
       }
       
       for (i=0;i<n;i++){
           System.out.printf("A[%d] = %d --- B[%d] = %.2f \n",i,a[i],i,b[i]);
       }
    }
    
}
