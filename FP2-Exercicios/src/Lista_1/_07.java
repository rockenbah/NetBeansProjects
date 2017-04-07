package Lista_1;

/* 7. Um número natural é triangular quando o produto de três números naturais consecutivos for igual ao 
próprio número. Por exemplo: 120 é triangular, pois 4*5*6 = 120. Escreva um programa que apresenta todos
os números triangulares entre 100 e 1000. */
/*@author rockenbah*/

public class _07 {
    public static void main(String[] args) {
        System.out.println("Números triangulares entre 100 e 1000");
       
        int t, n, produto;
        boolean tr;
        for (n=100; n<=1000; n++) {
            produto = 1;
            tr = false;
            t = 1;
            while ((t<=10) && (!tr))
            {
                produto = t * (t + 1) * (t + 2);
                if (produto == n)
                    tr = true;
                else
                    t++;
                }
            if (tr)
                System.out.printf("%3d = %2d * %2d * %2d\n", n, t, (t+1), (t+2));
        }
    }
    }
    
