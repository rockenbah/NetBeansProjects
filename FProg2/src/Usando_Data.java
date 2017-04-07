
import java.util.Scanner;

/**
 * @author rockenbah
 */
public class Usando_Data {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int dia, mes, ano;
        
        System.out.printf("\nInforme a sua data de Nascimento: ");
        System.out.printf("\nDia: ");
        dia = ler.nextInt();
        
        System.out.printf("\nMês: ");
        mes = ler.nextInt();
        
        System.out.printf("\nAno: ");
        ano = ler.nextInt();
        
        //instanciando a classe e criando um objeto dtNasc
        Data dtNasc = new Data(dia,mes,ano);
        Data hoje = new Data();
        
        System.out.printf("\nHoje é %d/%d/%d. \n",hoje.getDia(),hoje.getMes(),hoje.getAno());
        
        System.out.printf("\nVocê tem %d anos",dtNasc.calculaIdade());
        }
    
}
