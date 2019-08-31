/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activlistasdobles;

import javax.swing.JOptionPane;

/**
 *
 * @author Thiago
 */
public class Lista {
    private Nodo cabeza; 
    
    public Lista()
    {
        cabeza = null; 
    }
    public void setCabeza(Nodo cab)
    {
        cabeza = cab;
    }
    public Nodo getCabeza()
    {
        return cabeza;
    }
    
    public Nodo ultimo()
    {
        Nodo temp = cabeza;
        if(temp != null)
        {
            while(temp.getSiguiente() != null)
            {
                temp = temp.getSiguiente();
            }
        }
        return temp;
    }
    public int contarNodos()
    {
        int cantidad = 0;
        Nodo temp = cabeza;
        while(temp != null)
        {
            cantidad++;
            temp = temp.getSiguiente();
        }
        return cantidad;
    }
    
    public void agregar(Nodo nuevo)
    {
        Nodo temp = ultimo();
        if(temp != null)
        { 
            temp.setSiguiente(nuevo); 
            nuevo.setAnterior(temp); 
            nuevo.setSiguiente(null); 
        }
        else{ 
            nuevo.setAnterior(null);
            cabeza = nuevo;
        }
    }
    
    void agregarEntreNodos(Nodo nd, Nodo nuevo)
    {
        nuevo.setSiguiente(nd.getSiguiente());
        if((nd.getSiguiente() != null)&& (contarNodos()>6)){
            nd.getSiguiente().setAnterior(nuevo);
        }else
        {
            JOptionPane.showMessageDialog(null, "NECESITAS AL MENOS 6 ELEMENTOS");
        }
        nd.setSiguiente(nuevo);
        nuevo.setAnterior(nd);
    
    }
    
    public void agregarAcabeza(Nodo nuevo){
        if(cabeza == null){
            cabeza=nuevo;
        }else{
            nuevo.setAnterior(null);
            nuevo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevo);
            cabeza=nuevo;
        }
    }
    
    public Nodo buscar(int num){
        Nodo temp = cabeza;
        while(temp != null){
            if(temp.getNumero() == num){
                break;
            }else{
                temp = temp.getSiguiente();
            }
        }
        return temp;
    }
    
    
    public Nodo anterior(Nodo nd){
        Nodo temp = cabeza;
        while(temp != null){
            if(temp.getSiguiente() == nd){
                break;
            }else{
                temp = temp.getSiguiente();
            }
        }
        return temp;
    }
    
    public void eliminar(Nodo nd){
        Nodo ante;
        if(nd == cabeza){ 
            cabeza = cabeza.getSiguiente();
            if(cabeza != null){
                cabeza.setAnterior(null);
            }
        }else{ 
            ante = anterior(nd);
            ante.setSiguiente(nd.getSiguiente());
            if(nd.getSiguiente()!= null){
                nd.getSiguiente().setAnterior(ante);
            }
        }
        nd.setAnterior(null);
        nd.setSiguiente(null);
    }
    
    public void limpiar(){
        while(cabeza != null){
            eliminar(cabeza);
        }
        cabeza = null;
    }
    
}
