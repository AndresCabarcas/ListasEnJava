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
public class Representante {
    
    private int Identificacion;
            private String Nombre;
    
            public Representante(){
            
            Identificacion=0;
            Nombre="";
            
            }

    public int getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(int Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
            
            
            
}
