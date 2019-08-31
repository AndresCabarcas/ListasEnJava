/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolista;

import javax.swing.JOptionPane;

/**
 *
 * @author ANDACAMES
 */
public class Lista {
    
    private Nodo cabeza;
    
    public Lista(){
    
    cabeza=null;
        
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }
    
    //Método que recorre la lista y devuelve el último nodo de la lista.
    public Nodo ultimo() {
        Nodo temp = cabeza;
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
    
    //Método que recorre la lista para contar cuantos nodos hay almacenados.
    public int contarNodos() {
        int contador = 0;
        Nodo temp = cabeza;
        while (temp != null) {
            contador++;
            temp = temp.getSiguiente();
        }
        return contador;
    }
    
    //Método para agregar un nuevo nodo en la lista, por el final.
    public void agregar(Nodo nuevo) {
        if (cabeza == null) { //La lista está vacía, no hay nodos.
            setCabeza(nuevo); //Se asigna el primer nodo de la lista.
        } else {
            ultimo().setSiguiente(nuevo); //El ultimo nodo apuntara al nuevo nodo que se agregó.
        }
    }
    
    //Implementación del método que busca un nodo dentro de la lista, pasando como parámetro de
//búsqueda el código del estudiante.

    Nodo buscar(int num) {
        Nodo temp = cabeza;
        while (temp != null) {
            if (temp.getNumero() == num) {
                break;
            } else {
                temp = temp.getSiguiente();
            }
        }
        return temp;
    }
    
    //Implementación del método que elimina el nodo de la lista pasado como parámetro (nd) el nodo
//que se quiere eliminar.

    public void eliminar(Nodo nd) {
        Nodo anterior;
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

public void contarPosiciones(boolean enc, int num, int cant, Nodo temp) {       
        if (temp != null) {   //el primer nodo debe ser diferente de null      
            if (num == temp.getNumero()) { 
                cant++;// comienza el conteo en al encontrar el primer x a buscar
                if (cant>0 && enc) {                    
                    JOptionPane.showMessageDialog(null, "El siguente: " + num + " esta a " + cant + " posiciones del anterior");
                }                              
                if(!enc){     // si en contrar no es falso entonces es verdadero
                    cant=0;
                    JOptionPane.showMessageDialog(null, "El primer  "+num+" "+" esta a  "+cant+ " posiciones del anterior"); 
                }
                temp = temp.getSiguiente();
                enc=true;
                cant = 0; // El contador se hace 0 cada vez que se encuentra el numero buscado
            } else {
                cant++;
                temp = temp.getSiguiente();
            }
            contarPosiciones(enc, num, cant,temp);            
        }
    }
    
}
