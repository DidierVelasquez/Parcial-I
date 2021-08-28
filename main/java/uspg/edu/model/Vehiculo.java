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
public class Vehiculo extends Uber {
    
     private String Placas;
    private String Modelo;
    private String Color;
    private String Marca;
    
    public Vehiculo (){}
    

    public Vehiculo (String Placas, String Modelo, String Color, String Marca) {
        this.Placas = Placas;
        this.Modelo = Modelo;
        this.Color = Color;
        this.Marca = Marca;
    }

    public String getPlacas() {
        return Placas;
    }

    public void setPlacas(String Placas) {
        this.Placas = Placas;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    
    
    
     @Override
      public void Datos (){
          
          System.out.println ( "Placa: \t"  + getPlacas() + "\nModelo:  \t" + getModelo () + "\nMarca:  \t" + getMarca () +  
                               "\nColor:" + getColor());
      }
      
      
    }
    



    

