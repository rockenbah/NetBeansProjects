
public class _07 {

    public static void main(String[] args) {
        
        int n=10;
        int v[] = new int[n];
        int i;
        
        for (i=0;i<n;i++){
            v[i] = (int)(Math.random()*100);
    }
        int soma = 0;
        
        for (i=0;i<n;i++){
            System.out.printf("v[%d] = %d\n",i,v[i]);
            soma = soma + v[i];
        }
        
        System.out.printf("\nSoma = %d ", soma);
    }
}
