package Lista_3;

import java.io.IOException;
import java.util.Scanner;


public class Usando_LibMat {
    
    
    
    public static void main(String[] args) throws IOException {
        
        int vA,vB;
        char menuOptions;
        Scanner kbEntry = new Scanner(System.in);
      
        
        
        
        LibMat objLibMat;

        do {
            
            System.out.printf("\nA. Adição");
            System.out.printf("\nB. Subtração");
            System.out.printf("\nC. Multiplicação");
            System.out.printf("\nD. Divisão inteira");
            System.out.printf("\nE. Divisão real");
            System.out.printf("\nQ. Sair");
            System.out.printf("\nEscolha sua opção: ");
            menuOptions = (char)System.in.read();
            
            switch (menuOptions) {
            case 'A':
                System.out.printf("\nInforme o valor de a: ");
                vA = kbEntry.nextInt();
                System.out.printf("\nInforme o valor de b: ");
                vB = kbEntry.nextInt();
                objLibMat = new LibMat(vA,vB);
                System.out.printf("\nO resultado da soma é: %d \n", objLibMat.soma());
                break;
                
            case 'B':
                System.out.printf("\nInforme o valor de a: ");
                vA = kbEntry.nextInt();
                System.out.printf("\nInforme o valor de b: ");
                vB = kbEntry.nextInt();
                objLibMat = new LibMat(vA,vB);
                System.out.printf("\nO resultado da subtração é: %d \n", objLibMat.subtracao());
                break;
                
            case 'C':
                System.out.printf("\nInforme o valor de a: ");
                vA = kbEntry.nextInt();
                System.out.printf("\nInforme o valor de b: ");
                vB = kbEntry.nextInt();
                objLibMat = new LibMat(vA,vB);
                System.out.printf("\nO resultado da multiplicação é: %d \n", objLibMat.multiplicacao());
                break;
            
            case 'D':
                System.out.printf("\nInforme o valor de a: ");
                vA = kbEntry.nextInt();
                System.out.printf("\nInforme o valor de b: ");
                vB = kbEntry.nextInt();
                objLibMat = new LibMat(vA,vB);
                System.out.printf("\nO resultado da divisão inteira é: %d \n", objLibMat.divisaoi());
                break;
                
            case 'E':
                System.out.printf("\nInforme o valor de a: ");
                vA = kbEntry.nextInt();
                System.out.printf("\nInforme o valor de b: ");
                vB = kbEntry.nextInt();
                objLibMat = new LibMat(vA,vB);
                System.out.printf("\nO resultado da divisão real é: %.4f \n", objLibMat.divisaor());
                break;
                
            case 'F':
                System.out.println("\nSair!!! \n");
                break;
                
            default:
                System.out.println("\nEscolha errada!!! \n");
                }
        } while(menuOptions != 'Q');
    }
}
