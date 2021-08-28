/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu.model;

/**
 *
 * @author casa vb
 */
public class Usuario extends Persona {

    private String ID;
    private Integer Contraseña;
    
    public Usuario (){}
    
    
    public Usuario(String ID, Integer Contraseña, String Nombre, String Apellido, Integer DPI, Integer Telefono, String Persona, String vehiculo, String Direccion, String FormaDePago) {
        super(Nombre, Apellido, DPI, Telefono, Persona, vehiculo, Direccion, FormaDePago);
        
        this.ID = ID;
        this.Contraseña = Contraseña;
        
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Integer getContraseña() {
        return Contraseña;
    }

    public void setContraseña(Integer Contraseña) {
        this.Contraseña = Contraseña;
    }
    
    @Override
    public void Datos (){
        
    }
    
    @Override
    public void IngresoDeDatos (){
        
      System.out.println ("ID: \t"  + getID() + "\nContraseña: \t"  + getContraseña() +  "\nNombre: \t"  + getNombre() + "\nApellido:  \t" + getApellido() +
                            "\nDPI: \t" + getDPI() + "\nTelefono: \t" + getTelefono());
    }
}
