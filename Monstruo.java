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
public class Monstruo {
    Random rnd = new Random();
    private int hp,atk,def,spd;
    private String faccion;
    private int probabilidadDrop;
    
    
    public Monstruo(){
        generarFaccion();
        this.hp  = rnd.nextInt(500)+3500;
        this.atk = rnd.nextInt(500)+1000;
        this.def = rnd.nextInt(20)+5;
        this.spd = rnd.nextInt(90)+10;  
        this.faccion = faccion;
    }
    
    public void monstrarMonstruo(){
        String msj ="";
        msj = "\t"+hp;
        msj +="\t\t"+atk;
        msj +="\t\t"+def;
        msj +="\t\t"+spd;
        
        System.out.println(msj);
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
    
    public String getFaccionMonstruo(){
        return this.faccion;
    }
    
    public void setFaccionMonstruo(String facc){
        this.faccion=facc;
    }
    
    private void generarFaccion(){
        String [] faccionAleatoria = {"Planta","Fuego","Agua"};
        int faccionRandom = rnd.nextInt(faccionAleatoria.length);
        faccion = faccionAleatoria[faccionRandom];
    }
    
    private void crearObjetoDropeable(){
        
        objetoEquipable objeto = new objetoEquipable();
        objeto.getObjetoSeleccionado(); //  se llama el nombre del objeto
        objeto.getObjetoEquipado(); // los stat del objeto que salio 
        
        System.out.println("El objeto "+objeto.getObjetoSeleccionado()+" contiene un rango de "+ objeto.getObjetoEquipado()*generaDrop());//Se multiplico con el rango que se decidi con el Drop.
    }
    
    
    //Metodo nuevo para decidir el rango del drop
    private int generaDrop(){
        int estrellaDrop;
        probabilidadDrop = rnd.nextInt();
        if(probabilidadDrop<0.6){
            estrellaDrop =1;
            
        }else if(probabilidadDrop<0.9){
            estrellaDrop = 3;
        }else {
            estrellaDrop = 5;
            
        }
        return estrellaDrop;
    }
}
