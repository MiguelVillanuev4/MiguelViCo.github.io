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
class Fecha {
    private int dia;
    private int mes;
    private int anio;
    /**
     * se crea un constructor vacio
     */
    public Fecha() {
    }
    /**
     * se crea otro constructor con los siguientes parametros o atributos
     * @param dia
     * @param mes
     * @param anio 
     */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
     /**
     * 
     * @return dia se crea un getter solo para el dia de nacimiento
     */
    public int getDia() {
        return dia;
    }
    /**
     * 
     * @param dia se crea un setter para tener los parametros que se van a utilizar para el dia de cumpleaños de la persona
     */
    public void setDia(int dia) {
        this.dia = dia;
    }
     /**
     * 
     * @return mes se crea un getter solo para el mes de nacimiento de la persona
     */
    public int getMes() {
        return mes;
    }
    /**
     * 
     * @param mes se crea un setter para tener los parametros que se van a utilizar para el mes de cumpleaños de la persona
     */
    public void setMes(int mes) {
        this.mes = mes;
    }
     /**
     * se crea un getter solo para el año en que nacio la persona
     * @return anio
     */
    public int getAnio() {
        return anio;
    }
    /**
     * se crea un setter para tener los parametros que se van a utilizar para el año en el que nacio la persona
     * @param dia
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }
    /**
     * devuelve un texto el cual indica la fecha en la cual nacio la persona y se va a mandar sus valores a la classe persona
     * @return 
     */
    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }
    
    
}
