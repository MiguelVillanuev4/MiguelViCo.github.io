/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

/**
 * @author Correa Juarez Angel Leonardo
 * @author Villanueva Corona Miguel angel
 * se crea la clase circulo y se invocan variables a utilizar
 */
public class Circulo {
    static double PI = Math.PI;
    private double radio;
    private String color;
    /**
     * se crea el constructor vacio para circulo
     */
    public Circulo() {
    }
    /**
     * constructor que almacena a la variable radio
     * @param radio 
     * solo es necesario a radio ya que PI tiene un parametro fijo
     */
    public Circulo(double radio) {
        this.radio = radio;
    }
    /**
     * se hace uso de getters para devolver el valor de radio
     * @return radio
     */
    public double getRadio() {
        return radio;
    }
    /**
     * se utiliza setter para los parametros necesarios para el radio
     * @param radio 
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    /**
     * se hace uso de un toString para devolver los valores de radio y color en la pantalla
     * @return 
     */
    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", color=" + color + '}';
    }

    /**
     * este metodo se utiliza para calcular el perimetro del circulo con los parametros del radio y de PI
     * @return 2*PI*radio
     */
    public double perimetro(){
        return 2*PI*radio;
    }
    /**
     * este metodo se utiliza para calcular el area del circulo con los parametros del radio y de PI
     * @return PI*radio*radio
     */
    public double area(){
        return PI*radio*radio;
    }
}
