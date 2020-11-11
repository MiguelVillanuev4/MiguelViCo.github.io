/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

/**
 * @author Correa Juarez Angel Leonardo
 * @author Villanueva Corona Miguel angel
 */
public class Practica5 {

    /**
     * @param args the command line arguments
     * se crean los objetos c1 y c2
     */
    public static void main(String[] args) {
       Circulo c1 = new Circulo();
       Circulo c2 = new Circulo(6.0);
       /**
        * se mandan a imprimir los atributos del circulo y los resultados del area y perimetreo
        */
        System.out.println(c1.toString());
        System.out.println(c2.toString());
       
        System.out.println("perimetro c1 = "+c1.perimetro());
        System.out.println("Area de c1 = "+c1.area());
        
        System.out.println("perimetro c1 = "+c2.perimetro());
        System.out.println("Area de c1 = "+c2.area());
    
        System.out.println("---------------------------------------------");
        c1.setRadio(9.0);
        System.out.println("perimetro c1 = "+c1.perimetro());
        System.out.println("Area de c1 = "+c1.area());
        
        System.out.println("---------------------------------------------");
       /**
        * se mandan a imprimir los atributos de la persona y para esto se deven de indicar cada valor que tiene cada variable
        */
        Persona amigo = new Persona();
        Fecha fNacimiento = new Fecha(3,4,2002);
        amigo.setNombre("Edgar");
        amigo.setApellidos("Romero Martinez");
        amigo.setfNacimiento(fNacimiento);
        System.out.println("Info de mi amigo"+amigo.toString());
        //no es necesario poner el metodo toString se puede poner como se muestra a continuacion
        System.out.println("Info de mi amigo"+amigo);
        
        Persona amigo2 = new Persona("Raul","Cruz Martinez",new Fecha(20,4,1993));
        System.out.println("Info Amigo 2"+amigo2);
        
        Persona amigo3 = new Persona("Carlitos","Mendoza Bolaños");
        System.out.println("Info Amigo 3"+amigo3);
        
        System.out.println("---------------------------------------------");
        Lavadora lavadora = new Lavadora();
        Lavadora lavadora2 = new Lavadora("Rojo", 50000f, "Samsung", 2020);
        lavadora.setAnio(2018);
        lavadora.setColor("Negro");
        lavadora.setModelo("LG");
        lavadora.setPrecio(35000);
        System.out.println("Información de la lavadora:" + lavadora2.toString());
        System.out.println("Información de la lavadora:"+ lavadora); 


    }
    
}
