
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rockenbah
 */
public final class Data {
    // atributos de classe (ou propriedades)
    private int dia;
    private int mes;
    private int ano;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    // métodos
    // método construtor
    
    public Data(int dia, int mes,int ano){
        this.setDia(dia);
        this.setMes(mes);
        this.setAno(ano);
        }
    public Data() {
        Calendar hj = Calendar.getInstance();
        this.setDia(hj.get(Calendar.DAY_OF_MONTH));
        this.setMes(hj.get(Calendar.MONTH)+1);
        this.setAno(hj.get(Calendar.YEAR));
        }
    public int calculaIdade() {
        Data hj = new Data();
        int id;
        id = hj.getAno() - this.getAno();
        if ((hj.getMes() < this.getMes()) ||
                ((hj.getMes() == this.getMes()) &&
                    (hj.getDia() < this.getDia())))
            id = id -1;
        return (id);
    }
}
   
