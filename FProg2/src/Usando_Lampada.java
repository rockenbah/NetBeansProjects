/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rockenbah
 */
public class Usando_Lampada {

    
    public static void main(String[] args) {
        Lampada lamp1 = new Lampada(true);
        Lampada lamp2 = new Lampada(false);
        
        System.out.println(lamp1.estado());
        lamp1.desligar();
        System.out.println(lamp1.estado());
        
        System.out.println("Lâmpada 2: " + lamp2.estado());
                
    }
    
}
