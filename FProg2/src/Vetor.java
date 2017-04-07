
public class Vetor {
    private final int maxSize;
    private final int v[];

    //construtor
    public Vetor(int maxSize) {
        this.maxSize = maxSize;
        v = new int [maxSize];
        }
    
    public void alimentar(int limit) {
        for (int i=0;i<maxSize;i++) {
            v[i] = (int) (Math.random()*limit);
            }
        }
    public void imprimir() {
        for (int i=0;i<maxSize;i++){
            System.out.printf("v[%d] = %d\n",i,v[i]);
           }
    }
    public int somar () {
        int soma = 0;
        for (int i=0;i<maxSize;i++){
            System.out.printf("v[%d] = %d\n",i,v[i]);
            soma = soma + v[i];
        }
        return (soma);
    }
    
}
