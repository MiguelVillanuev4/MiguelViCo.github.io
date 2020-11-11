/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;
/**
 * @author Correa Juarez Angel Leonardo
 * @author Villanueva Corona Miguel angel
 * se crea la clase de envoltura Fecha y se invocan las variables
 */
public class Lavadora {
    
    String color;
    float precio;
    String modelo;
    int anio;
    int op;
    boolean encendido;
    boolean ropa;
    /**
     * se crea un constructor vacio
     */
    public Lavadora(){
        
    }
    /**
     * 
     * @param color parametro dado para el color de la lavadora
     * @param precio parametro dado para el precio de la lavadora
     * @param modelo parametro dado para el modelo de la lavadora
     * @param anio parametro dado para el año de la lavadora
     */
    public Lavadora(String color, float precio, String modelo, int anio) {
        this.color = color;
        this.precio = precio;
        this.modelo = modelo;
        this.anio = anio;
    }
    /**
     * 
     * @return getter que devuelve el valor del color
     */
    public String getColor() {
        return color;
    }
    /**
     * 
     * @param color setter que determina el parametro del color
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * 
     * @return getter que devuelve el valor del precio
     */
    public float getPrecio() {
        return precio;
    }
    /**
     * 
     * @param precio setter que determina el parametro del precio
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    /**
     * 
     * @return se crea un getter solo para el modelo de la lavadora
     */
    public String getModelo() {
        return modelo;
    }
    /**
     * 
     * @param modelo setter que determina el parametro del modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    /**
     * 
     * @return getter que devuelve el parametro año
     */
    public int getAnio() {
        return anio;
    }
    /**
     * 
     * @param anio determina el parametro para el año en que salio la lavadora
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }
    /**
     * 
     * @return devuelve un texto el cual indica los atributos de nuestro objeto 
     */
    @Override
    public String toString() {
        return "Lavadora{" + "color=" + color + ", precio=" + precio + ", modelo=" + modelo + ", anio=" + anio + '}';
    }
}
