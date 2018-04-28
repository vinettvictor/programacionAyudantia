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
public class Dado {
Random rnd = new Random();
private int resultadoDados;  
    public Dado(){
        lanzarDados();
    }
    
    //Dado1 : sera el dado de 8 caras
    private int  lanzaDado1(){
        int dado1 = rnd.nextInt(7)+1;
        return dado1;
    }
    
    // Dado2 : sera el dado de 6 caras
    private int lanzaDado2(){
        int dado2 = rnd.nextInt(5)+1;
        return dado2;
    }
    
    public int lanzarDados(){
        resultadoDados = lanzaDado2() - lanzaDado1();
        return resultadoDados;
    }
 
     
}
