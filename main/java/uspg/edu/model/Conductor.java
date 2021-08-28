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
public class Conductor extends Persona {
    
    
    private String Licencia;
    
    public Conductor (){
    
        super();
    }
    
    public Conductor(String Licencia,String Nombre, String Apellido, Integer DPI, Integer Telefono, String Persona, String vehiculo, String Direccion, String FormaDePago) {
        super(Nombre, Apellido, DPI, Telefono, Persona, vehiculo, Direccion, FormaDePago);
        
        this.Licencia = Licencia;
        
    }

    public String getLicencia() {
        return Licencia;
    }

    public void setLicencia(String Licencia) {
        this.Licencia = Licencia;
    }

    
    @Override
    public void IngresoDeDatos() {
        System.out.println ( "\nNombre: \t"  + getNombre () + "\nApellido:  \t" + getApellido () + 
                               "\nDPI:" + getDPI() + "\nLicencia:   \t" + getLicencia () + "\nTelefono:   \t" + getTelefono ());
    
    
    
}
}