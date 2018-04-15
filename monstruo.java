/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoayudantia;

import java.util.Random;
/**
 *
 * @author Vinett
 */
public class monstruo {
    Random rnd = new Random();
    private int hp,atk,def,spd;
    private String faccion;
    public monstruo(){
        generarFaccion();
        this.hp  = rnd.nextInt(500)+3500;
        this.atk = rnd.nextInt(500)+1000;
        this.def = rnd.nextInt(20)+5;
        this.spd = rnd.nextInt(90)+10;  
        
    }
    
    public int getHp(){
        return hp;
    }    
    public void setHp(int hp){
        this.hp = hp;
    }
    
    public int getAtk(){
        return atk;
    }   
    public void setAtk(int atk){
        this.atk = atk;
    }
    
    public int getDef(){
        return def;
    }
    public void setDef(int def){
        this.def = def;
    }
    
    public int getSpd(){
        return spd;
    }
    public void setSpd(int spd){
        this.spd = spd;    
       
    }
    
    private void generarFaccion(){
        String [] faccionAleatoria = {"Tierra","Fuego","Agua"};
        int faccionRandom = rnd.nextInt(faccionAleatoria.length);
        String faccionEscogida = faccionAleatoria[faccionRandom];
    }
    
    private void crearObjetoDropeable(){
        objetoEquipable objeto = new objetoEquipable();
        objeto.getObjetoSeleccionado(); //  se llama el nombre del objeto
        objeto.getObjetoEquipado(); // los stat del objeto que salio 
        
        System.out.println("El objeto "+objeto.getObjetoSeleccionado()+" contiene un rango de "+ objeto.getObjetoEquipado());
    }
}
