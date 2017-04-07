/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rockenbah
 */
public class Lampada {
    //propriedades ou atributos da classe
    private boolean ligada;
    
    //método construtor
    public Lampada(boolean ligada) {
        this.ligada = ligada;
    }
    
    //métodos ou operações
    public void ligar(){
        this.ligada = true;
    }
    
    public void desligar(){
        this.ligada = false;
    }
    
    public String estado(){
        if (this.ligada == true)
            return ("ligada");
        else return ("desligada");
        
    }
    
    
    
    
}
