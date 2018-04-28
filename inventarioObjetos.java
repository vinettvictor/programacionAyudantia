/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoayudantia;

import java.util.ArrayList;

/**
 *
 * @author Vinett
 */

public class inventarioObjetos {
    private int maxInventario = 10;
    ArrayList<objetoEquipable> coleccObjetoEquipable = new ArrayList<objetoEquipable>();
    
    
    public void agregarObjeto(){
        
       if (coleccObjetoEquipable.size()<maxInventario){
        coleccObjetoEquipable.add(new objetoEquipable());
           System.out.println("Se ha agregado el objeto exitosamente");
       } else {
           System.out.println("El inventario esta lleno");
       }
    }
    
    public void quitarObjeto(int posicion){
        coleccObjetoEquipable.remove(posicion);
    }
    
    private void buscarObjetoRango(ArrayList<objetoEquipable> obj ,  int rango){
        boolean flag = false;
        for (int i = 0;i<coleccObjetoEquipable.size();i++) {
            if(obj.get(i).getRangoObj() == rango){
                System.out.println("Objeto: "+coleccObjetoEquipable.get(i).getObjetoSeleccionado()+ "\tRango: "+coleccObjetoEquipable.get(i).getRangoObj());
                flag = true;
            } 
                
                                                
        }       
    }
    
    public void mostrarFiltroRango(int rango){
        if (rango >=1 && rango<=10) {
            buscarObjetoRango(coleccObjetoEquipable,rango);
        }else {
            System.out.println("Por favor asegurese de que el rango que esta ingresando esta dentro de los parametros");
        }
    }
    
    private void buscarObjetos (ArrayList<objetoEquipable> obj ){
        for(int i=0;i<coleccObjetoEquipable.size();i++){
            System.out.println("objeto "+(i+1)+": "+coleccObjetoEquipable.get(i).getObjetoSeleccionado() + 
                    "\tRango: "+coleccObjetoEquipable.get(i).getRangoObj());
            
        }
    }
    
    public void mostrarObjeto(){
        buscarObjetos(coleccObjetoEquipable);
    }
    
    //Se crea metodo para agregar el objeto que dropeo el monstruo
    public void agregarObjDropeado(objetoEquipable obj){
        if(coleccObjetoEquipable.size()>10){
            System.out.println("El inventario esta lleno");
        }else {
            coleccObjetoEquipable.add(obj);
        }
    }
}
