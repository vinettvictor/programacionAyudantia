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
    private int rangoObj;
    private int mejoraBaseObj;
    private int Objeto;
    private int objetoFinal;
    public objetoEquipable(){
        mejoraBaseObj();
        generarEstrellaObj();
        mejoraObjetoFinal();
        
        this.Objeto = objetoFinal;  
    }
    
    //Metodo de la mejora base que estara entre [1,9]
    private int mejoraBaseObj(){
        mejoraBaseObj = random.nextInt(8)+1;
        return mejoraBaseObj;
    }
    
    public int getMejoraObjeto(){
        return objetoFinal;      
    }
    
    public void setMejoraObjeto(int objeto){
        this.Objeto = objeto;
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
    
    public void mejoraObjetoFinal(){
        objetoFinal = mejoraBaseObj*rangoObj;
        
    }
    
    /*
    Metodos para mostrar 
    */
    
    public void mostrarMejoraObjetoFinal(){
        System.out.println("El valor que proporciona el objeto es de :"+objetoFinal);
    }
    
    public void mostrarMejoraObjeto(){
        System.out.println("El objeto proporciona una mejora de :"+mejoraBaseObj);
    }
    
    public void mostrarRangoObj(){
        System.out.println("El rango proporcionado al objeto es :"+this.rangoObj);
    }
}
