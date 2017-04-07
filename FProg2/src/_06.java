
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
public class _06 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int n=6;
        int v[] = new int[n];
        int i;
        
        for (i=0;i<n;i++){
            System.out.printf("Informe o %do. valor de %d: ",(i+1),n);
            v[i] = input.nextInt();
        }
        System.out.println();
        
        for (i=0;i<n;i++){
            System.out.printf("v[%d] = %d\n",i,v[i]);
            }
    }
    
}
