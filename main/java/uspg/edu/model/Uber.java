
package uspg.edu.model;


public abstract class Uber {
    
    private String Persona;
    private String vehiculo;
    private String Direccion;
    private String FormaDePago; 

    
    public Uber (){}
    
    
    public Uber(String Persona,  String vehiculo, String Direccion, String FormaDePago) {
        this.Persona = Persona;
        this.vehiculo = vehiculo;
        this.Direccion = Direccion;
        this.FormaDePago = FormaDePago;
    }

    public String getPersona() {
        return Persona;
    }

    public void setPersona(String Persona) {
        this.Persona = Persona;
    }

    
    
    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getFormaDePago() {
        return FormaDePago;
    }

    public void setFormaDePago(String FormaDePago) {
        this.FormaDePago = FormaDePago;
    }
    
    public abstract void Datos ();
    
    
    
    
    
    
}
