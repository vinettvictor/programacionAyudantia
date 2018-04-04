/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoayudantia;

/**
 *
 * @author Vinett
 */

public class ProyectoAyudantia {

    /*
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    Menu menu = new Menu();
    monstruo m = new monstruo(); 
    objetoEquipable obj = new objetoEquipable();
    
        System.out.println("objeto :"+obj.getObjetoSeleccionado());
        System.out.println("el objeto "+obj.getObjetoSeleccionado()+ " tiene un valor de :"+obj.getObjetoEquipado());
        obj.mostrarMejoraObjetoFinal();
        obj.mostrarRangoObj();
        obj.mostrarMejoraBaseObjeto();
        
        
    menu.crearMenu();  
    
        
    } 
}
