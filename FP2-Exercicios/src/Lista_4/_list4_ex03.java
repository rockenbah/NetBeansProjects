/* 3. Desenvolver um programa que alimente aleatoriamente, com números no intervalo de 0 até 99, dois vetores: A e B com 10 elementos cada.
Pede-se para construir um vetor C de mesma dimensão com os resultados das subtrações sempre do maior pelo menor valor, ou seja:
se a[i] >= b[i] então c[i] = a[i] – b[i];
se b[i] > a[i] então c[i] = b[i] – a[i];
Imprimir os vetores como sugere a figura ao lado. */
package Lista_4;

import java.util.Scanner;

/* @author rockenbah */
public class _list4_ex03 {

    public static void main(String[] args) {
        class Vetor {
            private final int maxSize;
            private final int a[];
            private final int b[];
            private final int c[];
            
        //construtor
        public Vetor(int maxSize) {
            this.maxSize = maxSize;
            a = new int [maxSize];
            b = new int [maxSize];
            c = new int [maxSize];
            }
        //metodos
        public void carregar(int limit, int initCount) {
            for (int i=0;i<maxSize;i++) {
                a[i] = (int) (Math.random()*limit)+initCount;
                b[i] = (int) (Math.random()*limit)+initCount;
                }
            }
        
        public void imprimir() {
            
                for (int i=0;i<maxSize;i++){
                   if (a[i] >= b[i]) {
                       c[i] = a[i] - b[i];
                       System.out.printf("\ni=%d, a[%2d]   b[%2d]   c[%2d] <==a[i] - b[i]",i,a[i],b[i],c[i]);
                   }
                   else {
                       c[i] = b[i] - a[i];
                       System.out.printf("\ni=%d, a[%2d]   b[%2d]   c[%2d] <==b[i] - a[i]",i,a[i],b[i],c[i]);
                   }
                   }
                }
        }
        
        Scanner input = new Scanner(System.in);
        int size = 0;
        int ilimit = 0;
        int flimit = 0;
                
        System.out.printf("\nAlimente aleatoriamente um vetor com N elementos inteiros, compreendidos no intervalo\n" +
                            "de X até Y executando uma soma total e uma soma de multiplos de um inteiro Z \n");
        System.out.printf("\nPor favor escolha o número de elementos do Vetor: ");
        size = input.nextInt();
        System.out.printf("\nPor favor escolha o valor inicial do intervalo: ");
        ilimit = input.nextInt();
        System.out.printf("\nPor favor escolha o valor final do intervalo: ");
        flimit = input.nextInt();
                
        System.out.println();
        
        int limit = flimit - ilimit;
        int initcount = ilimit +1;
        
        Vetor objVetor = new Vetor(size);
        
        objVetor.carregar(limit,initcount);
        objVetor.imprimir();
        
        System.out.println();
        
    }
}
   
