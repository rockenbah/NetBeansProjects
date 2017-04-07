
package Lista_3;


public class LibMat {
    //atributos
    private final int valorA;
    private final int valorB;
    
    //construtor
    
    public LibMat(int vA, int vB) {
        this.valorA = vA;
        this.valorB = vB;
    }

    public int soma(){
        return valorA + valorB;
    }

    public int subtracao(){
        return valorA - valorB;
    }
    
    public int multiplicacao(){
        return valorA * valorB;
    }

    public int divisaoi(){
        return valorA / valorB;
    }
    
    public float divisaor(){
        return (valorA / (float)valorB);
    }
}
