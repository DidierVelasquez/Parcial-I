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
public class Direccion extends Uber {
    
    private String DireccionUsuario;
    private String DireccionConductor;
    private Integer TiempoDeLlegada;

    public Direccion(String DireccionUsuario, String DireccionConductor, Integer TiempoDeLlegada) {
        this.DireccionUsuario = DireccionUsuario;
        this.DireccionConductor = DireccionConductor;
        this.TiempoDeLlegada = TiempoDeLlegada;
    }

    public String getDireccionUsuario() {
        return DireccionUsuario;
    }

    public void setDireccionUsuario(String DireccionUsuario) {
        this.DireccionUsuario = DireccionUsuario;
    }

    public String getDireccionConductor() {
        return DireccionConductor;
    }

    public void setDireccionConductor(String DireccionConductor) {
        this.DireccionConductor = DireccionConductor;
    }

    public Integer getTiempoDeLlegada() {
        return TiempoDeLlegada;
    }

    public void setTiempoDeLlegada(Integer TiempoDeLlegada) {
        this.TiempoDeLlegada = TiempoDeLlegada;
    }
    
    @Override
    public void Datos(){
        
        System.out.println ( "Dirección del Usuario: \t"  + getDireccionUsuario() + "\nDireccion del cliente:  \t" + getDireccionConductor () + 
                               "\nTiempo de llegada:" + getTiempoDeLlegada());
    }
    
}
