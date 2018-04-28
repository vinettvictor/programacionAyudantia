/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoayudantia;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Vinett
 */
public class Batalla {
Scanner sc = new Scanner(System.in);
private Dado dado = new Dado();
inventarioLuchadores luchadorPelea;
Monstruo monstruoPelea;


private double atkMonstruo;
private double atkTeam;

public Batalla(){
    
    generarMonstruo();
    this.luchadorPelea = new inventarioLuchadores();
    this.monstruoPelea = new Monstruo();
    
    
}

        public void crearTeam(){    
                for(int i =0;i<6;i++){
                    luchadorPelea.agregarLuchador();
                }
            }

        public void mostrarTeam(){
            luchadorPelea.mostrarTodos();
        }

        public void generarMonstruo(){
            
            monstruoPelea.monstrarMonstruo();
}
        
        private void faccionFavorable(int i){
            String faccionMonstruo = monstruoPelea.getFaccionMonstruo();
            String faccionLuchador = luchadorPelea.inventario.get(i).getFaccion();
            if(faccionLuchador.equals("Agua") && faccionMonstruo.equals("Fuego") ){
                atkTeam = this.atkTeam*1.5;
                atkMonstruo =this.atkMonstruo*0.75;
                
            }else if(faccionLuchador.equals("Fuego") && faccionMonstruo.equals("Planta")){
                atkTeam = this.atkTeam*1.5;
                atkMonstruo = this.atkMonstruo*0.75;
                
            }else if(faccionLuchador.equals("Planta") && faccionMonstruo.equals("Agua")){
                atkTeam = this.atkTeam*1.5;
                atkMonstruo = this.atkMonstruo*0.75;
                
            }else if(faccionLuchador.equals("Fuego") && faccionMonstruo.equals("Agua") ){
                atkTeam = this.atkTeam*0.75;
                atkMonstruo =this.atkMonstruo*1.5;
                
            }else if(faccionLuchador.equals("Planta") && faccionMonstruo.equals("Fuego")){
                atkTeam = this.atkTeam*0.75;
                atkMonstruo = this.atkMonstruo*1.5;
                
            }else if(faccionLuchador.equals("Agua") && faccionMonstruo.equals("Planta")){
                atkTeam = this.atkTeam*0.75;
                atkMonstruo = this.atkMonstruo*1.5;
                
            }               
        }
        private void decideDado(int i){
            
            if(dado.lanzarDados()>0){
                atkTeam = luchadorPelea.inventario.get(i).getValorBaseAtk()*dado.lanzarDados();                
            }else if (dado.lanzarDados()<0){
                atkMonstruo = monstruoPelea.getAtk()*dado.lanzarDados()*(-1); // (-1) para hacer el valor positivo        
            }           
        }
        
        private void primerAtaque(int i){
            boolean bandera = false;
            if (luchadorPelea.inventario.get(i).getValorBaseSpd()>monstruoPelea.getSpd()){
                bandera = true;
                System.out.println("El luchada dara el primer golpe");
                
            }else {
                bandera = false;
                System.out.println("El monstruo dara el primero golpe");
                
            }           
        }
     
        
        
        




}




  
       
   

   



