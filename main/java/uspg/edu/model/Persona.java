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
public abstract  class Persona extends Uber {
    
    public String Nombre;
    public String Apellido;
    public Integer DPI;
    public Integer Telefono;
    
  
    
    public Persona(){
        super();
    }

    public Persona(String Nombre, String Apellido, Integer DPI, Integer Telefono, String Persona, String vehiculo, String Direccion, String FormaDePago) {
        super(Persona, vehiculo, Direccion, FormaDePago);
        
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.DPI = DPI;
        this.Telefono = Telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public Integer getDPI() {
        return DPI;
    }

    public void setDPI(Integer DPI) {
        this.DPI = DPI;
    }

    public Integer getTelefono() {
        return Telefono;
    }

    public void setTelefono(Integer Telefono) {
        this.Telefono = Telefono;
    }
    
    
    @Override
    public void Datos (){}
    
    
    public abstract  void IngresoDeDatos ();
    
    
    
    
    
}
