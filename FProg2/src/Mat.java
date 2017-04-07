
public class Mat {
    public static int fatorial (int n){
        if (n<0)
            return (0);
        
        int i, f=1;
        
        for (i=n;i>1;i--){
            f = f * i;
        }
        return (f);
    }
    
    public static int combinacao(int n, int p){
    
    return (fatorial(n) / fatorial(p) * fatorial(n-p)));
    }
}
