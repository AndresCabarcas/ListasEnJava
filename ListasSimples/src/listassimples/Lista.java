/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listassimples;

/**
 *
 * @author ANDACAMES
 */
public class Lista {

    private Nodo cabeza; //Se declara el atributo de la clase, cabeza primer nodo de la lista.
    //Método constructor de la clase ListaEnlazada.

    public Lista() {
        cabeza = null; //Inicialmente la lista está vacía, la cabeza apunta a nulo.
    }
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

    Nodo buscar(int cod) {
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
//Implementación del método que calcula el promedio de todas las notas definitivas almacenadas
//en la lista.

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
//Implementación del método que devuelve la nota definitiva más alta de las almacenadas.

    public float maximaDefinitiva() {
        float def, max;
        max = 0;
        Nodo temp = cabeza;
        while (temp != null) {
            def = temp.definitiva();
            if (def > max) {
                max = def;
            }
            temp = temp.getSiguiente();
        }
        return max;
    }

    public void limpiar() {
        while (cabeza != null) {
            eliminar(cabeza);
        }
    }
}
