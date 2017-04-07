/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rockenbah
 */
public class Quadrado {
    //atributos
    private double lado;
    
    //método construtor
    public Quadrado(double lado) {
        this.lado = lado;
    }
    
    //métodos
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    public double area() {
        return (this.lado * this.lado);
    }
    
    public double perimetro() {
        return (4 * this.lado);
    }
    
    public double diagonal() {
        return (Math.sqrt(2) * this.lado);
    }
}
