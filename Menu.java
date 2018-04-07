/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoayudantia;

import java.util.Scanner;

/**
 *
 * @author Vinett
 */
public class Menu {
    
    public void crearMenu(){
    Scanner leer = new Scanner(System.in);
    inventarioLuchadores llamar = new inventarioLuchadores();
    objetoEquipable objeto = new objetoEquipable();
    inventarioObjetos obj = new inventarioObjetos();
    int opcion,rango;
    boolean op=true;
    
    while (op) {
        System.out.println("Menu");
        System.out.println("1.- Agregar Luchador");
        System.out.println("2.- Mostrar luchadores");
        System.out.println("3.- Mostrar cantidad de luchadores");
        System.out.println("4.- Eliminar luchadores");
        System.out.println("5.- Escoger luchador");
        System.out.println("6.- Filtrar luchador por faccion");
        System.out.println("7.- Filtrar luchador por rango");
        System.out.println("8.- Agregar objeto");
        System.out.println("9.- Filtrar objeto por rango");
        System.out.println("10.- mostrar los objetos");
        System.out.println("11.- Salir");
        
        System.out.println("Seleccione una opcion");
        opcion = leer.nextInt();
        
               
        if (opcion == 11){
            System.out.println("Has salido del programa");
            break;
        } else {
            switch(opcion){
                case 1 :
                    System.out.println("-------------------------------------------------------------------------");
                    llamar.agregarLuchador();
                    System.out.println("-------------------------------------------------------------------------");
                    break;
                case 2 :
                    System.out.println("-------------------------------------------------------------------------");
                    llamar.mostrarTodos();
                    System.out.println("-------------------------------------------------------------------------");
                    break;
                case 3 :
                    System.out.println("-------------------------------------------------------------------------");
                    llamar.mostrarCantidadLuchadores();
                    System.out.println("-------------------------------------------------------------------------");
                    break;
                case 4 :
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("Escoga la posicion del luchador que desea eliminar(posicion empiezan de 0)");
                    int pos = leer.nextInt();
                    llamar.borrarLuchador(pos);
                    System.out.println("El luchador numero "+pos+ " ha sido eliminado exitosamente");
                    System.out.println("-------------------------------------------------------------------------");
                    break;
                case 5 :
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("Por favor escoga la posicion del luchador que desea ver sus estadisticas");
                    int posicion = leer.nextInt();
                    llamar.escogerLuchador(posicion);
                    System.out.println("-------------------------------------------------------------------------");
                    break;
                case 6 :
                    System.out.println("------------------------------------------------------------------------\n");
                    System.out.println("Ingrese la faccion que desea filtrar");
                    System.out.println("Asegurate de que la primera letra sea en Mayuscula(Tierra,Fuego o Agua)");
                    String faccion = leer.next();
                    System.out.println("-------------------------------------------------------------------------");
                    llamar.mostrarFaccion(faccion);
                    
                    System.out.println("-------------------------------------------------------------------------");
                    break;
                case 7:
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("Ingrese el rango que desea filtrar (El rango es de 1-5)");
       
                    rango = leer.nextInt();
                    llamar.mostrarRango(rango);
                    System.out.println("-------------------------------------------------------------------------");
                    break;
                case 8:
                    obj.agregarObjeto();
                    break;
                case 9:
                    System.out.println("Ingrese el rango que desea filtrar [1-9]");
                    rango = leer.nextInt();
                    obj.mostrarFiltroRango(rango);
                    break;
                case 10:
                    
                    obj.mostrarObjeto();
                    break;
                default :
                    System.out.println("La opcion marcada no es valida");
                    break;
            }
        }
    }
    
        
    
        
       
     
     
       
    
        
    }
    
}
