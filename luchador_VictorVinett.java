package proyectoayudantia;
/**
 *
 * @author Victor Vinett
 */

import java.util.Random;

public  class luchador_VictorVinett {
    Random random = new Random();
    private int hp,atk,def,spd,nombreRandom,faccionRandom;
    private String faccion,nombre,faccionEscogida,nombreEscogido;
    private double estrella;
    private int rangoEstrella,rango;
    
//Metodo constructor
    public luchador_VictorVinett() {
        generarEstrella();
        generarFaccion();
        generarNombres();
        this.hp = random.nextInt(300)+200;
        this.atk = random.nextInt(50)+20;
        this.def = random.nextInt(20)+5;
        this.spd = random.nextInt(90)+10;
        this.nombre= nombreEscogido;
        this.faccion= faccionEscogida;
        this.rango = rangoEstrella;
        equiparObjeto();
    }
    
// get y set de sus atributos 
    public int getValorBaseHp(){
        return hp;
    }
    public void setValorBaseHp(int hp){
        this.hp = hp;
    }
    public int getValorBaseAtk(){
        return atk;
    }
    public void setValorBaseAtk(int atk){
        this.atk = atk;
    }
    
    public int getValorBaseDef(){
        return def;
    }
    public void setValorBaseDef(int def){
        this.def = def;
    }
    
    public int getValorBaseSpd(){
        return spd;
    }
    public void setValorBaseSpd(int spd){
        this.spd = spd; 
    }
    public String getFaccion (){
        return faccion;
    }
    public void setFaccion(String faccion){
        this.faccion = faccion;
    }
   public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
  }
    public  int getRango(){
        return rango;
    } 
    public void setRango(int rango){
        this.rango=rango;
    }
       
// Metodo para Generar nombres del luchador 
    private void generarNombres(){
        String [] nombreAleatorio = {"DarkNight","MagicGladiator","DragonKnight","RogueKnight","SoulMaster",
                                    "BladeKnight","DarkWizard","DarkLord","LordEmperor","GrandMaster",
                                    "BladeMaster","FairyElfe","MuseElfe","DuelMaster","HighElfe"};
        nombreRandom =  random.nextInt(nombreAleatorio.length);  
        nombreEscogido = nombreAleatorio[nombreRandom];
    }
    
// Metodo para generar la faccion del luchador
    private void generarFaccion(){
        String [] faccionAleatoria = {"Fuego","Agua","Planta"};
        faccionRandom =  random.nextInt(faccionAleatoria.length);
        faccionEscogida = faccionAleatoria[faccionRandom];
    }
    
// Metodo para agregar estrellas a los valores base del luchador 
    private int generarEstrella(){
        estrella = Math.random(); // se generara un numero entre 0 y 1 
        if (estrella <= 0.4){ // el 40% de las veces
            rangoEstrella = 1;
            return rangoEstrella;
        } else if (estrella <=0.7 ){ // el 30% de las veces
            rangoEstrella = 2;
            return rangoEstrella;
            
        } else if (estrella <= 0.85){ // el 15 % de las veces
            rangoEstrella = 3;
            return rangoEstrella;
        
        }else if (estrella <= 0.95 ){ // el 10 % de las veces
            rangoEstrella= 4;
            return rangoEstrella;
        }else {
            rangoEstrella=5;
            return rangoEstrella; // 5 % restante
        }       
    }
    
    //metodo que permite equipar objeto
    
    private void equiparObjeto(){
        objetoEquipable equiparObj = new objetoEquipable();
        equiparObj.getObjetoEquipado();
        equiparObj.getObjetoSeleccionado();
        
        if (equiparObj.getObjetoSeleccionado().equals("healthposion")){
            int hpMejorado = this.getValorBaseHp()*this.getRango()*equiparObj.getObjetoEquipado();
        }else if (equiparObj.getObjetoSeleccionado().equals("espada")){
            int atkMejorado = this.getValorBaseAtk()*this.getRango()*equiparObj.getObjetoEquipado();
        }else if (equiparObj.getObjetoSeleccionado().equals("botas")){
            int spdMejorado = this.getValorBaseSpd()*this.getRango()*equiparObj.getObjetoEquipado();
        }else if (equiparObj.getObjetoSeleccionado().equals("armadura")){
            int defMejorado = this.getValorBaseDef()*this.getRango()*equiparObj.getObjetoEquipado();
        }
            
    }
    
 // Metodo para imprimir datos del luchador
    public void mostrarDatos(){
        System.out.println("\nBonificacion de rango "+this.getRango()+" estrellas\n");
        System.out.println("Nombre : "+this.getNombre()+
                "\nFaccion : "+this.getFaccion()+
                "\nVida con bonificacion de rango: "+this.getValorBaseHp()*this.getRango()+
                "\nAtaque con bonificacion de rango: "+this.getValorBaseAtk()*this.getRango()+
                "\nDefensa con bonificacion de rango: "+this.getValorBaseDef()*this.getRango()+
                "\nVelocidad con bonificacion de rango: "+this.getValorBaseSpd()*this.getRango());                      
    }
    
  
    //Metodo creado para testear la bonificacion de puntos
    
    
   /* 
    public void mostrarDatosSinRango(){
        System.out.println("\nDatos sin Rango\n");
       
            System.out.println("Nombre : "+this.getNombre()+
                    "\nFaccion : "+this.getFaccion()+
                    "\nVida sin bonificacion: "+this.getValorBaseHp()+
                    "\nAtaque sin bonificacion: "+this.getValorBaseAtk()+
                    "\nDefensa sin bonificacion: "+this.getValorBaseDef()+
                    "\nVelocidad sin bonificacion: "+this.getValorBaseSpd());
        
        }
    **/
   /*Mostrar mediante el metodo toString()
    @Override
    public String toString(){
        return "nombre: "+nombre+"\nfaccion: "+faccion+"\nhp: "+hp+"\natk: "+atk+"\ndef: "+def+"\nspd: "+spd;
    }
    **/ 
            
            
    
    
    
 }

