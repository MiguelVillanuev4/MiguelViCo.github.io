/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

/**
 * @author Correa Juarez Angel Leonardo
 * @author Villanueva Corona Miguel angel
 * se crea la clase persona y se invocan variables a utilizar
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private Fecha fNacimiento;
    /**
     * se crea un constructor persona la cual se encuentra vacia
     */
    public Persona() {
    }
    /**
     * se crea otro constructor persona pero ahora con parametros que indica el nombre, apellido y fecha de nacimiento de la persona
     * @param nombre
     * @param apellidos
     * @param fNacimiento 
     */
    public Persona(String nombre, String apellidos, Fecha fNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fNacimiento = fNacimiento;
    }
    /**
     * se hace un metodo en el cual a uno de los atributos hace llamar a una clase de envoltura para poder mandar la fecha del individuo
     * @param nombre
     * @param apellidos 
     */
    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fNacimiento = new Fecha(3,5,2000);
    }
    /**
     * se crea un getter solo para el nombre de la persona
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * se crea un setter para tener los parametros que se van a utilizar para el nombre de la persona
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Se hace uso de otro getter para los apellidos de la persona
     * @return 
     */
    public String getApellidos() {
        return apellidos;
    }
    /**
     * Utilizamos un setter para tener los parametros de los apellidos
     * @param apellidos 
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    /**
     * se crea un getter para poder devolver los valores almacenados en la fecha de nacimiento
     * @return fNacimiento es de tipo Fecha
     */
    public Fecha getfNacimiento() {
        return fNacimiento;
    }
    /**
     * se crea un setter para el parametro de la fecha de nacimiento
     * @param fNacimiento 
     */
    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
    /**
     * Este toString devuelve un texto en el cual nos indica los atributos que tiene la persona
     * @return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", fNacimiento=" + fNacimiento + '}'
     * Si se elimina este toString el main nos dara como respuesta la direccion de donde se encuentra
     */
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", fNacimiento=" + fNacimiento + '}';
    }
    
}
