
package traerenum;

import java.util.LinkedList;
import java.util.Scanner;

public class Traerenum {
    static Scanner scanStr = new Scanner(System.in);
    static Scanner scanInt = new Scanner(System.in);
    static String empresa,vuelo,pasajero;
    static Eaero empres;
    static Vuelo objvuel = new Vuelo();
    static Persona objpersona1 = new Persona();
    
    public static void main(String[] args) {
        /*
        System.out.println("--ingresa la empresa-- \n*nvolaris \n*interjet\n*viva");
        String empresa =scanStr.nextLine();
        
        Eaero empres = Enum.valueOf(Eaero.class, empresa);
        
        Vuelo objvuel = new Vuelo("123", empres);
        
        Persona objpersona1 = new Persona("Alex",objvuel);
        System.out.println("nombre: "+objpersona1.getNombre()+" Vuelo: "+objpersona1.getVuelo().getNombre()+" Empresa: "+objpersona1.getVuelo().getEmpresa().getEmvuelo());*/
        menu();      
    }

    private static void menu() {//empieza menu
        
        boolean bandera=true;
 
      
        System.out.println("Bienvenido a *Alexflights*");
        do{
            System.out.println("--Ingresa la opcion deseada-- \n 1) Seleccionar Empresa \n 2) Ingresa el numero de vuelo \n 3) Ingresar Pasajero \n 4) Mostrar Ticket \n 5) Salir");
            int opcion=scanInt.nextInt();
            switch(opcion)
            {
                
                case 1:
                   try{
                    System.out.println("--Ingresa la Empresa-- \n(OPCIONES) \n*volaris \n*interjet\n*viva");
                    empresa =scanStr.nextLine();
                    empres = Enum.valueOf(Eaero.class, empresa);
                   }
                   catch(Exception e){
                       System.err.println("Aerolinea no valida");
                       
                   }
                    break;
                case 2:
                   try{
                    System.out.println("--Ingrsa el Nombre del Vuelo--");
                    vuelo=scanStr.nextLine();
                    objvuel.setNombre(vuelo);
                    objvuel.setEmpresa(empres);
                   }
                   catch(Exception e){
                       System.err.println("Ingresa primero la empresa en la que deseas viajar");
                   }
                    break;
                case 3:
                    try{
                    System.out.println("--Ingresa el Nombre del Pasajero--");
                    pasajero=scanStr.nextLine();
                    objpersona1.setNombre(pasajero);
                    objpersona1.setVuelo(objvuel);
                    }
                       catch(Exception e){
                       System.err.println("Ingresa primero el vuelo");
                   }
                    break;
                case 4:
                    try{
                    System.err.println("---------------TICKET-------------------");
                    System.out.println("----------------------------------------");
                    System.out.println("Nombre: "+objpersona1.getNombre()+" \nVuelo: "+objpersona1.getVuelo().getNombre()+" \nEmpresa: "+objpersona1.getVuelo().getEmpresa().getEmvuelo());
                    System.out.println("----------------------------------------");
                    System.err.println("---------------TICKET-------------------");
                    }
                    catch(Exception e){
                       System.err.println("Primero ingresa los campos anteriores");
                   }
                    break;
                
                default:
                    System.out.println("--Saliste del programa--"); 
                    bandera=!bandera;
                    break;
            }
        }
        while(bandera);
        
    }//termina menu
    
}
