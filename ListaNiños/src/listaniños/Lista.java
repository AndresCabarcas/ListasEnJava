/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaniños;

import javax.swing.JOptionPane;

/**
 *
 * @author ANDACAMES
 */
public class Lista {
    
    private Niño cabeza;
    
    public Niño getCabeza() {
        return cabeza;
    }
    
    public void setCabeza(Niño cabeza) {
        this.cabeza = cabeza;
    }
    
    public Niño ultimo() {
        Niño temp = cabeza;
        while (temp != null) {
            //Si temp apunta a nulo el nodo temporal (temp) es el último de la lista.
            if (temp.getSiguiente() == null) {
                break; //Se rompe el ciclo.
            } else {
                //De lo contrario se pasa al siguiente nodo de la lista.
                temp = temp.getSiguiente();
            }
        }
        return temp;
    }
    
    
     public boolean vacia(){
        if(cabeza==null){
            return true;
        }else{
            return false;
        }
    }
     
     public Niño primer() {
        Niño temp = cabeza;
        while (temp != null) {
                 break;
        }
        return temp;
    }
     
    
    public void agregar(Niño nuevo) {
        if (cabeza == null) { //La lista está vacía, no hay nodos.
            setCabeza(nuevo); //Se asigna el primer nodo de la lista.
        } else {
            ultimo().setSiguiente(nuevo); //El ultimo nodo apuntara al nuevo nodo que se agregó.
        }
    }
    
    public void agregarinicio(Niño nuevo) {
        if (cabeza != null) { //La lista está vacía, no hay nodos.
         setCabeza(nuevo); //Se asigna el primer nodo de la lista.
        } else {        
            primer().setSiguiente(nuevo); //El ultimo nodo apuntara al nuevo nodo que se agregó.
        }
    }
        
    Niño buscar(int cod) {
        Niño temp = cabeza;
        while (temp != null) {
            if (temp.getRegCivil() == cod) {
                break;
            } else {
                temp = temp.getSiguiente();
            }
        }
        return temp;
    }
    
    public void agregue_entre_dos_Nodos(Niño anterior, Niño nuevo) {
        nuevo.setSiguiente(anterior.getSiguiente());
        anterior.setSiguiente(nuevo);
    }
    
    public void eliminar(Niño nd) {
        Niño anterior;
        if (nd == cabeza) { //Si el nodo a eliminar en la lista es el primero entonces.
            cabeza = cabeza.getSiguiente();
        } else { //De lo contrario, se busca el nodo anterior al que se quiere eliminar (nd).
            anterior = cabeza;
            while (anterior.getSiguiente() != nd) {
                anterior = anterior.getSiguiente();
            }
//El siguiente de anterior será el nodo que le sigue al que se va a eliminar (nd).
            anterior.setSiguiente(nd.getSiguiente());
        }
        nd.setSiguiente(null); //El enlace del nodo a borrar, apuntara su siguiente a nulo.
    }
    
    public void limpiar() {
        while (cabeza != null) {
            eliminar(cabeza);
        }
    }
    
    public void cambiar(Niño n1, Niño n2) {
        Niño temp = getCabeza();
        
        while (temp != null) {
            
            if (temp.getSiguiente() == n1) {
                
                break;
            } else {
                temp = temp.getSiguiente();
            }
        }
        
        Niño aux = n2.getSiguiente();
        if (temp == n1) {
            setCabeza(n2);            
        }
        try {
            JOptionPane.showMessageDialog(null, temp);
            temp.setSiguiente(n2);
            n2.setSiguiente(n1);
            n1.setSiguiente(aux);
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "error!!!!!!!1");
        }
    }
    
    public void ordenarBurbuja() {
        Niño temp = getCabeza();
             
        while (temp != null) {
            
           Niño temp2=temp.siguiente;
           
            if (temp.getSiguiente() == null) {
                break;
            } else {
                if (temp.getPeso() < temp2.getPeso()) {
                    cambiar(temp, temp2);
                }
                
                temp = temp.getSiguiente();
            }
        }
        
    }

    
}
