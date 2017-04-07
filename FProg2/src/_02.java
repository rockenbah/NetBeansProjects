
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
public class _02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        int a;
        
        System.out.print("Informe um valor: ");
        a = ler.nextInt();
        
        System.out.println();
        
        if (a<0)
            System.out.printf("%d, é negativo. \n",a);
        else if (a==0)
                System.out.printf("Zero");
        else System.out.printf("%d, é positivo. \n", a);
        
    }
    
}
