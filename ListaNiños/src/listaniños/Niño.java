/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaniños;

/**
 *
 * @author ANDACAMES
 */
public class Niño {
    
   private int RegCivil;
    private String Nombre;
     private int Talla;
      private int Peso;
      private String Municipio;
       Niño siguiente;
      
      
      public Niño(){
      
      RegCivil=0;
      Nombre="";
      Talla=0;
      Peso=0;
      siguiente=null;
      Municipio="";
          
      }

    public int getRegCivil() {
        return RegCivil;
    }

    public void setRegCivil(int RegCivil) {
        this.RegCivil = RegCivil;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getTalla() {
        return Talla;
    }

    public void setTalla(int Talla) {
        this.Talla = Talla;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    public Niño getSiguiente() {
        return siguiente;
    }

    public String getMunicipio() {
        return Municipio;
    }

    public void setMunicipio(String Municipio) {
        this.Municipio = Municipio;
    }

    
    public void setSiguiente(Niño siguiente) {
        this.siguiente = siguiente;
    }
      
}
