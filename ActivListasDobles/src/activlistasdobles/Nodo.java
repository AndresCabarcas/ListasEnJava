/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activlistasdobles;

/**
 *
 * @author Thiago
 */
public class Nodo {
    private int  numero;
        private Nodo siguiente;
        private Nodo anterior;

        public Nodo()
        {  
           numero=0;
           siguiente=null;
           anterior=null;
        }
  
      public void setNumero(int val)
      { 
        numero = val; 
      }
      
      public int getNumero()
      {
        return numero;
      }
      public void setAnterior(Nodo ant)
      {
          anterior=ant;
      }
      public Nodo getAnterior()
      {
          return anterior;
      }
      public void setSiguiente(Nodo sig)
      { 
        siguiente = sig; 
      }
    
      public Nodo getSiguiente()
      { 
        return siguiente; 
      }     
    
}
