
import java.util.Scanner;

public class Usando_Quadrado {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        double lado;
        
        System.out.printf("\nDetermine o tamanho do lado: ");
        lado = ler.nextInt();
        
        Quadrado objQuadrado = new Quadrado(lado);
        
        System.out.printf("\nA área do quadrado de lado %.1f é %.3f ",objQuadrado.getLado(),objQuadrado.area());
        System.out.printf("\nO perimetro do quadrado de lado %.1f é %.3f ",objQuadrado.getLado(),objQuadrado.perimetro());
        System.out.printf("\nA diagonal do quadrado de lado %.1f é %.3f ",objQuadrado.getLado(),objQuadrado.diagonal());
    }
    
}
