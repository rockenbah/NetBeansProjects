/*Classe (class)
Implemente uma Classe, denominada de “Circulo”, com as seguintes características:
Atributo: raio (como um valor “double”)
Métodos:
- Área: pi x raio2
- Perímetro: 2 x pi x raio
- Diâmetro: 2 x raio
Desenvolva uma Classe Java Principal para obter o valor do raio de um círculo,
crie um objeto a partir da Classe “Circulo” e apresente os resultados das operações 
implementadas na referida classe.*/
package Lista_4;

/*@author rockenbah */
public class Circulo {
    private final double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    
    public static double Area(double raio){
        double area = 0;
        return (area = Math.PI*Math.pow(raio,2));
        }
    
    public static double Perimetro(double raio){
        double perimetro = 0;
        return (perimetro = 2*Math.PI*raio);
        }
    
    public static double Diametro(double raio){
        double diametro = 0;
        return (diametro = Math.PI*raio);
        }
    }
