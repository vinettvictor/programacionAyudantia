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

import java.util.ArrayList;
public class inventarioLuchadores {    
    ArrayList <luchador_VictorVinett> inventario = new ArrayList<luchador_VictorVinett>();
        
    //Metodo para agregar un luchador
    public   void agregarLuchador(){ 
       if(maxLuchadores()){
        inventario.add(new luchador_VictorVinett());
        System.out.println("Ha agregado un luchador exitosamente");
       }
    }
    
    //Metodo para verificar que se alcanzo le numero maximo de luchadores
    public boolean maxLuchadores(){
        boolean maximo = false;
        if(inventario.size()>=6){
            System.out.println("Se ha alcazando el limite de luchadores");
        }else {
            maximo = true;
        }
        return maximo;
    }
    
    //Metodo para buscar la cantidad de jugadores (Solo NOMBRE,FACCION Y SU RANGO)
    public  void mostrarLuchador(ArrayList<luchador_VictorVinett> luchador){
        System.out.println("Lista de luchadores");
        System.out.println("\t\tNombre"+"\t\t\t\tFaccion"+"\t\t\tRango");
        System.out.println("==============================================================================");
        for (int i =0;i<inventario.size();i++) {
            System.out.print("Luchador "+(i+1)+":");
            System.out.println("\t"+inventario.get(i).getNombre()+"\t\t\t"+
                    inventario.get(i).getFaccion()+"\t\t\t"+inventario.get(i).getRango());
        }  
    }
    
    //Metodo para mostrar Los jugadores encontrar en el metodo anterior
    public void mostrarTodos() {
                    mostrarLuchador(inventario);
        }
    public void mostrarCantidadLuchadores(){
        System.out.println("Hay un total de: "+inventario.size()+" luchadores");
    }
    
    //Metodo para escoger luchador
    public void escogerLuchador(int luchador){
        inventario.get(luchador).mostrarDatos();       
    }
    
    // Metodo para borrar un luchador existente
    public void borrarLuchador(int posicion){
        inventario.remove(posicion);
    }
    
    //Metodo para filtrar por faccion
    public void buscarLuchadorFaccion(ArrayList<luchador_VictorVinett>luchador,String faccion){
        boolean flag = false;
        for (int i = 0;i<inventario.size();i++) {
            if(luchador.get(i).getFaccion().equals(faccion)){
                System.out.println("Nombre :"+inventario.get(i).getNombre() +"\tFaccion :"+
                        inventario.get(i).getFaccion()+ "\t\tRango :"+inventario.get(i).getRango());
                flag = true;
            }                                      
        }          
    }
    
    //Metodo para mostrar los luchadores filtrados por su respectiva faccion
    public void mostrarFaccion(String faccion){
        System.out.println("Los luchadores de la "+faccion+" son los siguientes :");
        buscarLuchadorFaccion(inventario,faccion);     
    }
    
    //Metodo para filtrar luchadores por rango
    public void buscarLuchadorFaccion(ArrayList<luchador_VictorVinett>luchador,int rango){
        boolean flag = false;
        for (int i = 0;i<inventario.size();i++) {
            if(luchador.get(i).getRango() == rango){
                System.out.println("Nombre :"+inventario.get(i).getNombre() +"\tFaccion :"+
                        inventario.get(i).getFaccion()+ "\t\tRango :"+inventario.get(i).getRango());
                flag = true;
            }                                      
        }       
    }
    
    //Metodo para mostrar los luchadores de un rango especifico 
    public void mostrarRango(int rango){
        System.out.println("Los luchadores de rango "+rango+" son los siguientes :");
        buscarLuchadorFaccion(inventario,rango);    
    }        
}
