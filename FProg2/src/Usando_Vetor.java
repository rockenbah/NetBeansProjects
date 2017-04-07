
public class Usando_Vetor {

    public static void main(String[] args) {
        Vetor objVetor = new Vetor(7);
        
        objVetor.alimentar(100);
        objVetor.imprimir();
        System.out.printf("\nSoma = %d\n", objVetor.somar());
    }
    
}
