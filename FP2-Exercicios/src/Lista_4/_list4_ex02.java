/* 2. Desenvolver um programa que alimente aleatoriamente um vetor com 10 elementos inteiros, 
compreendidos no intervalo de 10 até 50, e a seguir realize os seguintes passos:
a. somar todos os números armazenados no vetor;
b. subtrair da soma obtida no passo “a” da soma dos elementos do vetor múltiplos de 5;
c. escrever o vetor e o valor calculado no passo “b” como sugere a figura ao lado.
Sugestão para sortear números aleatórios no intervalo de 10 até 50:
a[i] = (int)(Math.random() * 40) + 11;*/
package Lista_4;

import java.util.Scanner;

/* @author rockenbah */
public class _list4_ex02 {

    public static void main(String[] args) {
        
        class Vetor {
            private final int maxSize;
            private final int a[];
            
        //construtor
        public Vetor(int maxSize) {
            this.maxSize = maxSize;
            a = new int [maxSize];
            }
        //metodos
        public void carregar(int limit, int initCount) {
            for (int i=0;i<maxSize;i++) {
                a[i] = (int) (Math.random()*limit)+initCount;
                }
            }
        
        public void imprimir() {
                for (int i=0;i<maxSize;i++){
                   if ((a[i]%5) == 0) System.out.printf("a[%d] = %d <== múltiplo de 5\n",i,a[i]);
                   else System.out.printf("a[%d] = %d\n",i,a[i]);
                    }
                }
        
            public int somar () {
                int soma = 0;
                for (int i=0;i<maxSize;i++){
                //System.out.printf("a[%d] = %d\n",i,a[i]);
                soma = soma + a[i];
                }
                return (soma);
                }
            
            public int somarMultiplos (int muliplos) {
                int soma = 0;
                for (int i=0;i<maxSize;i++){
                    if ((a[i]%5) == 0) soma = soma + a[i];
                    }
                return (soma);
                }
            }
        
        Scanner input = new Scanner(System.in);
        int size = 0;
        int ilimit = 0;
        int flimit = 0;
        int multiple = 0;
        
        System.out.printf("\nAlimente aleatoriamente um vetor com N elementos inteiros, compreendidos no intervalo\n" +
                            "de X até Y executando uma soma total e uma soma de multiplos de um inteiro Z \n");
        System.out.printf("\nPor favor escolha o número de elementos do Vetor: ");
        size = input.nextInt();
        System.out.printf("\nPor favor escolha o valor inicial do intervalo: ");
        ilimit = input.nextInt();
        System.out.printf("\nPor favor escolha o valor final do intervalo: ");
        flimit = input.nextInt();
        System.out.printf("\nPor favor escolha o valor do multiplo: ");
        multiple = input.nextInt();
        
        System.out.println();
        
        int limit = flimit - ilimit;
        int initcount = ilimit +1;
        
        Vetor objVetor = new Vetor(size);
        
        objVetor.carregar(limit,initcount);
        objVetor.imprimir();
        System.out.printf("\nSoma Total....................................... = %d", objVetor.somar());
        System.out.printf("\nSoma Multiplos de %d.............................. = %d", multiple, objVetor.somarMultiplos(multiple));
        System.out.printf("\n-------------------------------------------------------");
        System.out.printf("\nSubtraindo a soma dos Multiplos de %d............. = %d\n", multiple, (objVetor.somar() - objVetor.somarMultiplos(multiple)));
    }
}
    
 
    

