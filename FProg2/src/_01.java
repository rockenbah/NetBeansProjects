
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rockenbah
 */
public class _01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int a,b,result;
        System.out.print("Informe o primeiro valor: ");
        a = ler.nextInt();
        System.out.print("Informe o segundo valor: ");
        b = ler.nextInt();
        result = a * b;
        
        System.out.println();
        
        System.out.printf("%d X %d = %d \n",a,b,result);
    }
    
}
