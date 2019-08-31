/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasdobles;

/**
 *
 * @author ANDACAMES
 */
public class ListaEnlazadaDoble {

    private Nodo cabeza;
    //Se declara el atributo de la clase, cabeza primer nodo de la lista. 
//Método constructor de la clase ListaEnlazadaDoble.

    public ListaEnlazadaDoble() {
        cabeza = null;
    }
//Inicialmente la lista está vacía, la cabeza apunta a nulo.  

    //Implementación del método que asigna el primer nodo de la lista (nodo cabeza). 
    public void setCabeza(Nodo cab) {
        cabeza = cab;
    }

    //Implementación del método para obtener el primer nodo de la lista (nodo cabeza).   
    public Nodo getCabeza() {
        return cabeza;
    }

//Método que recorre la lista y devuelve el último nodo de la lista.
    public Nodo ultimo() {
        Nodo temp = cabeza;
        if (temp != null) {
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
        }
        return temp;
    }

//Método que recorre la lista para contar cuantos nodos hay almacenados. 
    public int contarNodos() {
        int cantidad = 0;
        Nodo temp = cabeza;
        while (temp != null) {
            cantidad++;
            temp = temp.getSiguiente();
        }
        return cantidad;
    }

//Método para agregar un nuevo nodo en la lista, por el final.  
    public void agregar(Nodo nuevo) {
        Nodo temp = ultimo();

        if (temp != null) {
            temp.setSiguiente(nuevo);
            //El enlace del ultimo nodo apunta al nuevo nodo.  
            nuevo.setAnterior(temp);
//El enlace anterior del nuevo nodo apunta al último nodo.   
            nuevo.setSiguiente(null); //El enlace siguiente del nuevo nodo apunta a nulo.    
        } else { //Esta condición se da, en caso de que la lista este vacía y se agrega el primer nodo. 
            nuevo.setAnterior(null);
            cabeza = nuevo;
        }

    }

//Método para agregar nodos entre dos nodos ya existentes en la lista enlazada doble.   
    void agregarEntreNodos(Nodo nd, Nodo nuevo) {
        nuevo.setSiguiente(nd.getSiguiente());
        if (nd.getSiguiente() != null) {
            nd.getSiguiente().setAnterior(nuevo);
        }
        nd.setSiguiente(nuevo);
        nuevo.setAnterior(nd);
    }

//Método para agregar nodos por la cabeza de la lista enlazada doble.     
    public void agregarAcabeza(Nodo nuevo) {
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            nuevo.setAnterior(null);
            nuevo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevo);
            cabeza = nuevo;
        }
    }

//Busca un nodo en la lista enlazada doble desde la cabeza (inicio) hasta el último nodo de la lista,
//se pasa como parámetro de búsqueda el código del estudiante.    
    public Nodo buscar(int cod) {
        Nodo temp = cabeza;
        while (temp != null) {
            if (temp.getCodigo() == cod) {
                break;
            } else {
                temp = temp.getSiguiente();
            }
        }
        return temp;
    }

//Busca un nodo en la lista enlazada doble desde el final (último nodo) hasta el inicio de la lista
//(cabeza), se pasa como parámetro de búsqueda el nombre del estudiante.   
    public Nodo buscar(String nom) {
        Nodo temp = ultimo();
        while (temp != null) {
            if (temp.getNombre().equals(nom)) {
//Se compara si las cadenas son iguales.        
                break;
            } else {
                temp = temp.getAnterior(); //Se recorre la lista desde el último nodo hasta el primero.    
            }
        }
        return temp;
    }

//Este método devuelve el nodo que se encuentra antes (anterior) de un nodo pasado como 
//parámetro. En este caso devuelve el nodo que esta antes del nodo a eliminar.
    public Nodo anterior(Nodo nd) {
        Nodo temp = cabeza;
        while (temp != null) {
            if (temp.getSiguiente() == nd) {
                break;
            } else {
                temp = temp.getSiguiente();
            }
        }
        return temp;
    }

//Método que eliminar un nodo de la lista enlazada doble.    
    public void eliminar(Nodo nd) {
        Nodo ante;
        if (nd == cabeza) {
//En caso de que el nodo a eliminar sea el primer nodo de la lista doble.   
            cabeza = cabeza.getSiguiente();
            if (cabeza != null) {
                cabeza.setAnterior(null);
            }
        } else {
//De lo contrario, se busca el nodo anterior al que se quiere eliminar (nd).    
            ante = anterior(nd);
            ante.setSiguiente(nd.getSiguiente());
            if (nd.getSiguiente() != null) {
                nd.getSiguiente().setAnterior(ante);
            }
        }
        nd.setAnterior(null);
        nd.setSiguiente(null);
    }

    public void limpiar() {
        while (cabeza != null) {
            eliminar(cabeza);
        }
        cabeza = null;
    }

//Implementación del método que calcula el promedio de todas las notas definitivas almacenadas  
//en la lista doblemente enlazada.    
    public float promedioGeneral() {
        int cantidad = 0;
        float suma = 0;
        Nodo temp = cabeza;
        while (temp != null) {
            cantidad++;
            suma = suma + temp.definitiva();
            temp = temp.getSiguiente();
        }
        if (cantidad > 0) {
            return suma / cantidad;
        } else {
            return 0;
        }
    }

    //Implementación del método que devuelve la nota definitiva más alta de las almacenadas,  
//recorriendo la lista desde el último nodo hasta el primero.   
    public float maximaDefinitiva() {
        float max = 0;
        float def;
        Nodo temp = ultimo();
        while (temp != null) {
            def = temp.definitiva();
            if (def > max) {
                max = def;
            }
            temp = temp.getAnterior();
        }
        return max;
    }
}