/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu.gt;

import java.util.Scanner;
import uspg.edu.model.Conductor;
import uspg.edu.model.Direccion;
import uspg.edu.model.Usuario;
import uspg.edu.model.Vehiculo;

/**
 *
 * @author casa vb
 */
public class uber {

 
    public static Scanner sc = new Scanner (System.in);
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        
    }
    
    public static void Usuario(){
        
        Usuario usuario = new Usuario ();
        
        System.out.println ("Datos Del Usuario");
        System.out.println ("==================================");

        System.out.println("Ingrese sus Datos:");
        System.out.println ("==================================");
        
        System.out.println("ID:");
        usuario.setID (sc.next());
        System.out.println("Contraseña:");
        usuario.setContraseña(sc.nextInt());
        System.out.println("Nombre:");
        usuario.setNombre(sc.next());
        System.out.println("Apellido:");
        usuario.setApellido(sc.next());
        System.out.println("DPI:");
        usuario.setDPI(sc.nextInt());
        System.out.println("Telefono:");
        usuario.setTelefono(sc.nextInt());
        
        System.out.println ("==================================");
        System.out.println ("Datos Del Usuario");
        usuario.IngresoDeDatos();
        
    }
    
    public static void Conductor (){
        
       Conductor conductor = new Conductor ();
       
        
        System.out.println ("Datos Del Conductor");
        System.out.println ("==================================");

        System.out.println("Ingrese sus Datos:");
        System.out.println ("==================================");
        
        System.out.println("Nombre:");
        conductor.setNombre(sc.next());
        System.out.println("Apellido:");
        conductor.setApellido(sc.next());
        System.out.println("DPI:");
        conductor.setDPI(sc.nextInt());
        System.out.println("Tipo de Licencia:");
        conductor.setLicencia(sc.next());
        System.out.println("Telefono:");
        conductor.setTelefono(sc.nextInt());
        
        
        System.out.println ("==================================");
        System.out.println ("Datos Del Usuario");
        conductor.IngresoDeDatos();
    }
    
    public void Vehiculo (){
        
        Vehiculo vehiculo = new Vehiculo ();
        
        
        System.out.println ("Datos Del Vehiculo");
        System.out.println ("==================================");
        
        System.out.println("Placas:");
        vehiculo.setPlacas(sc.next());
        System.out.println("Modelo:");
        vehiculo.setModelo(sc.next());
        System.out.println("Color:");
        vehiculo.setColor(sc.next());
        System.out.println("marca :");
        vehiculo.setMarca(sc.next());
      
        vehiculo.Datos();

    }
    
    public void Trazabilidad (){
        
        Direccion direccion = new Direccion ();
        
        System.out.println ("Dereccion de viaje ");
        System.out.println ("==================================");
        
        System.out.println("Direccion del vehiculo:");
        direccion.setDireccionConductor(sc.next());
        System.out.println("Direccion del usuario :");
        direccion.setDireccionUsuario(sc.next());
        System.out.println("Direccion del destino:");
        direccion.setDestino(sc.next());
        System.out.println("marca :");
        direccion.setTiempoDeLlegada(sc.nextInt());
        
      
        direccion.Datos();
    }
}
