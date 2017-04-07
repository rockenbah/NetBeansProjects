
package Lista_4;

import java.util.Scanner;

/*@author rockenbah*/
public class Usando_Circulo {
    
    public static void main(String[] args) {
        double r = 0;
        Circulo objCirculo = new Circulo(r);
        Scanner input = new Scanner(System.in);
        
        System.out.printf("\nEscolha o tamanho do raio (m): ");
        r = input.nextDouble();
        
        System.out.printf("\nÁrea = %.5fm", objCirculo.Area(r));
        System.out.printf("\nDiametro = %.5fm", objCirculo.Diametro(r));
        System.out.printf("\nPerimetro = %.5fm", objCirculo.Perimetro(r));
        System.out.println();
        
    }
    
}
