/* Author: rockenbah */

#include <stdio.h>
#include <stdlib.h>
#include "libMat.h"

int main() {

    VALOR vl;
    char escolha;
   
    do {
        printf("\n1. Adição");
        printf("\n2. Subtração");
        printf("\n3. Multiplicação");
        printf("\n4. Divisão inteira");
        printf("\n5. Divisão real");
        printf("\n6. Sair");
        printf("\nEscolha sua opção: \n");
        fflush(stdin); // limpa o buffer do teclado antes da entrada de um dado do tipo “char”
        scanf("%c", &escolha);

        switch (escolha) {
            case '1':
                printf("\nInforme o valor de a: ");
                scanf("%d", &vl.valorA);
                printf("\nInforme o valor de b: ");
                scanf("%d", &vl.valorB);
                printf("\nO resultado da soma é: %d \n", soma(vl));
                break;
                
            case '2':
                printf("\nInforme o valor de a: ");
                scanf("%d", &vl.valorA);
                printf("\nInforme o valor de b: ");
                scanf("%d", &vl.valorB);
                printf("\nO resultado da subtração é: %d \n", subtracao(vl));
                break;
                
            case '3':
                printf("\nInforme o valor de a: ");
                scanf("%d", &vl.valorA);
                printf("\nInforme o valor de b: ");
                scanf("%d", &vl.valorB);
                printf("\nO resultado da multiplicação é: %d \n", multiplicacao(vl));
                break;
            
            case '4':
                printf("\nInforme o valor de a: ");
                scanf("%d", &vl.valorA);
                printf("\nInforme o valor de b: ");
                scanf("%d", &vl.valorB);
                printf("\nO resultado da divisão inteira é: %d \n", divisaoi(vl));
                break;
                
            case '5':
                printf("\nInforme o valor de a: ");
                scanf("%d", &vl.valorA);
                printf("\nInforme o valor de b: ");
                scanf("%d", &vl.valorB);
                printf("\nO resultado da divisão real é: %.4f \n", divisaor(vl));
                break;
                
            case '6':
                printf("\nSair!!! \n");
                return EXIT_SUCCESS;
                break;
                
            default:
                printf("\nEscolha errada!!! \n");
                break;
                }
        } while(escolha != 6);

    return EXIT_SUCCESS;
}

