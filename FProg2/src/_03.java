
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
public class _03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        int a;
        
        System.out.printf("Informe um numero: ");
        a = ler.nextInt();
        
        System.out.println();
        
        for (int i=1; i<=10; i++) {
            System.out.printf("%2d X %d = %d\n", i, a, (i*a));
        }
        
    }
    
}
