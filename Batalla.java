/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoayudantia;

//import java.util.ArrayList;
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
private double hpMonstruo;
private double hpLuchador;

public Batalla(){
    
    this.luchadorPelea = new inventarioLuchadores();
    this.monstruoPelea = new Monstruo();
    generarMonstruo();
    combate();
    
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
            System.out.println("Ha aparecido un monstruo con las siguiente caracteristicas");
            monstruoPelea.mostrarMonstruo();
            System.out.println("--------------------------------------------------------------");
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
        
        private double dañoLuchadores(int i){
            decideDado(i);
            faccionFavorable(i);
           
            double daño = atkTeam - monstruoPelea.getDef();
          return daño;
        }
        
        private double dañoMonstruo(int i){
            decideDado(i);
            faccionFavorable(i);
            
            double daño = atkMonstruo - luchadorPelea.inventario.get(i).getValorBaseDef();
            return daño;
        }
        
        private boolean primerAtaque(int i){
            boolean bandera = false;
            if (luchadorPelea.inventario.get(i).getValorBaseSpd()>monstruoPelea.getSpd()){
                bandera = true;
                System.out.println("El luchador dara el primer golpe");
                
            }else {
                bandera = false;
                System.out.println("El monstruo dara el primero golpe");
                
            } 
            return true;
        }
     public void combate(){
         System.out.println("La pelea comienza");
          hpMonstruo = monstruoPelea.getHp();
          
         for(int i=0;i<luchadorPelea.inventario.size();i++){
             hpLuchador = luchadorPelea.inventario.get(i).getValorBaseHp();
             double dM = dañoMonstruo(i);
             double dL = dañoLuchadores(i);
             
             boolean ordenAtaque = primerAtaque(i);
             
             do{
                if(ordenAtaque){
                    hpMonstruo = hpMonstruo + dM;
                    hpLuchador = hpLuchador + dL;                                        
                } 
                
             }while (hpMonstruo>0 && hpLuchador>0);
             
             if (hpMonstruo<0){
                 i=luchadorPelea.inventario.size();
                 monstruoPelea.dropItem();
                 System.out.println("El monstruo a muerto, ha dropeado un item");
                 System.out.println(" ================= LOS LUCHADORES SON LOS GANADORES =================");
             }else{
                 System.out.println("Un luchador a muerto");
             }
             
         }
     }
        
        
        
        




}




  
       
   

   



