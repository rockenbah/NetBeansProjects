
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
public class _05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        int n;
        
        System.out.printf("Informe um valor: ");
        n = ler.nextInt();
        
        System.out.printf("\n%d! = %d\n", n , fat(n));
    }
    public static int fat (int n) {
        int f = 1;
        for (int i=1; i<=n; i++) {
            f = f * i;
        }
        return (f);
    }
}
