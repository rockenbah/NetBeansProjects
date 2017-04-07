package Lista_1;

/*3. Tendo como dados de entrada a altura (em metros) – variável “h” e o sexo de 
uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes
fórmulas: para homens: (72.7 * h) - 58; para mulheres: (62.1 * h) - 44.7. */

/* @author rockenbah*/

import java.io.IOException;
import java.util.Scanner;

public class _03 {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        
        double h, peso = 0;
        char sexo;
        
        System.out.printf("\nInforme o sexo: M ou F: ");
        sexo = (char)System.in.read();
       
        System.out.printf("Informe a altura (em metros), use virgula:  ");
        h = ler.nextDouble();
        
        if (( sexo == 'M') || ( sexo == 'm'))
            peso = (72.7 * h) - 58;
        else
            peso = (62.1 * h) - 44.7;
            System.out.printf("\nO peso ideal é %1.2f kg",peso);   
    }   
}
