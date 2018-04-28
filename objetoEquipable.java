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
import java.util.Random;
public class objetoEquipable {
    Random random = new Random();
    private int rangoObj,rango;
    private int mejoraBaseObj;
    private int objetoFinal;
    private int objetoRandom;
    private int objetoEquipado,stat;
    private String objetoEscogido,objetoSeleccionado;
    
    public objetoEquipable(){
        mejoraBaseObj();
        generarEstrellaObj();
        mejoraObjetoFinal();
        asignarObjeto();
        
        this.objetoSeleccionado = objetoEscogido; // obtenenemos el nombre del objeto
        this.objetoEquipado = stat; // obtenemos los puntos que asignara el objeto        
        this.rango= rangoObj;
    }
    
    //Metodo de la mejora base que estara entre [1,9]
    private int mejoraBaseObj(){
        mejoraBaseObj = random.nextInt(8)+1;
        return mejoraBaseObj;
    }
    
    public int getMejoraObjeto(){
        return objetoFinal;      
    }  
    public void setMejoraObjeto(int objetoFinal){
        this.objetoFinal = objetoFinal;
    }
    
    public int getObjetoEquipado(){
        return objetoEquipado;
    }
    public void setObjetoEquipado(int objetoEquipado){
        this.objetoEquipado = objetoEquipado;
    }
    
    public String getObjetoSeleccionado(){
        return objetoSeleccionado;
    }
    public void setObjetoSeleccion(String objetoSeleccionado){
        this.objetoSeleccionado = objetoSeleccionado;
    }
    
    public int getRangoObj(){
        return rango;
    }
    
    public void setRangoObj(int rango){
        this.rango=rango;
    }

    
    //Metodo para generar el rango segun probabilidades dadas
    private int generarEstrellaObj(){
        double estrella = Math.random();
        if(estrella <= 0.2){
            rangoObj = 1;
        }else if(estrella <=0.4){
            rangoObj = 2;
        }else if(estrella <=0.6) {
            rangoObj = 3;
        }else if(estrella <=0.75){
            rangoObj = 4;
        }else if(estrella <=0.85){
            rangoObj = 5;
        }else if(estrella <=0.9){
            rangoObj = 6;
        }else if(estrella <=0.94){
            rangoObj = 7;
        }else if(estrella <=0.97){
            rangoObj = 8;
        }else if(estrella <= 0.99){
            rangoObj = 9;
        }else {
            rangoObj = 10;
        }
        return rangoObj;
    }
    
    //Metodo para generar un objeto aleatorio
    private void generarObjeto(){
        String [] objetoAleatorio = {"espada","armadura","botas","healthposion"};        
        objetoRandom = random.nextInt(objetoAleatorio.length);
        objetoEscogido = objetoAleatorio[objetoRandom];
    }
    
    
    //Metodo para comparar el objeto y asignarle el valor del objeto obtenido
    private int asignarObjeto(){
        generarObjeto();
        if (objetoEscogido.equals("espada")){
            stat = objetoFinal;           
           return stat;
        }else if(objetoEscogido.equals("armadura")){
            stat = objetoFinal;
            return stat;
        }else if(objetoEscogido.equals("botas")){
            stat = objetoFinal;
            return stat;
        }else {
            stat = objetoFinal;
            return stat;
            
        }
    }
    
    
    private void mejoraObjetoFinal(){
        objetoFinal = mejoraBaseObj*rangoObj;        
    }
    
    /*
    Metodos para mostrar 
    */
    
    public void mostrarMejoraObjetoFinal(){
        System.out.println("El valor que proporciona el objeto es de :"+objetoFinal);
    }
    
    public void mostrarMejoraBaseObjeto(){
        System.out.println("El objeto proporciona una mejora de :"+mejoraBaseObj);
    }
    
    public void mostrarRangoObj(){
        System.out.println("El rango proporcionado al objeto es :"+this.rangoObj);
    }
}
