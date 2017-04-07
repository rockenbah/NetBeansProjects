package Lista_1;

/* 5. Apresentar todos os números da sequência a seguir: 0, 0.25, 0.5, 0.75, 1.0, 1.25, 1.5, 1.75, 2.0,
 2.25, 2.5, 2.75, 3.0, 3.25, 3.5, 3.75, 4.0. */
/* @author rockenbah */

public class _05 {
    public static void main(String[] args) {
        double i,passo=0.25;
        for (i=0;i<=4;i+=passo)
            System.out.printf("%.2f, ",i);
    }
}
