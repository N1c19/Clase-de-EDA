/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectosmana6;

/**
 *
 * @author o12305
 */
public class Proyectosmana6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListaEnlazada L = new ListaEnlazada();
        L.insertarAlInicio(7);
        L.add_tail(5);
        L.add_tail(3);
        L.add_tail(8);
        
        Nodo temp =L.getHead();
        while(temp.siguiente!= null){
            System.out.println(temp.clave);
            temp = temp.siguiente;
        }
        
        
    }
    
}
