/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasdobles;

import javax.swing.JOptionPane;

/**
 *
 * @author ANDACAMES
 */
public class Main {
//Se declaran los siguientes métodos, que serán llamados dentro del método static void main: 
//Método para asignar los valores a los atributos de la clase Nodo.   

    public static void llenar(Nodo nod) {
        int cod = Integer.parseInt(JOptionPane.showInputDialog("Digite CODIGO del Estudiante: "));
        nod.setCodigo(cod);
        String nom = JOptionPane.showInputDialog("Digite NOMBRE del Estudiante: ");
        nod.setNombre(nom);
        float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite La NOTA 1:"));
        nod.setNota1(n1);
        float n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite La NOTA 2:"));
        nod.setNota2(n2);
        float n3 = Float.parseFloat(JOptionPane.showInputDialog("Digite La NOTA 3:"));
        nod.setNota3(n3);
    }

    //Método para obtener y mostrar los valores asignados a los atributos de la clase Nodo.   
    public static void mostrar(Nodo nod) {
        String datosNodo = "";
        datosNodo = datosNodo + String.valueOf("" + "CODIGO: " + nod.getCodigo() + "\n" + "NOMBRE: " + nod.getNombre() + "\n"
                + "NOTA 1: " + nod.getNota1() + "\n" + "NOTA 2: " + nod.getNota2() + "\n" + "NOTA 3: " + nod.getNota3() + "\n"
                + "Definitiva: " + nod.definitiva() + "\n \n");
        JOptionPane.showMessageDialog(null, "=========== INFORMACÓN DE LOS NODOS DE LA LISTA =========== \n" + datosNodo);
    }

    //Método para listar cada uno de los nodos de la lista y visualizarlos en pantalla.    
    public static void listar(Nodo nod) {
        Nodo temp = nod;
        while (temp != null) {
            mostrar(temp);
            temp = temp.getSiguiente();
        }
    }

//Este es un método alternativo que se puede utilizar para listar la información de los nodos desde 
    //el final de la lista enlazada doble.      
    public static void listarDesteFinal(Nodo nod) {
        Nodo temp = nod;
        while (temp != null) {
            mostrar(temp);
            temp = temp.getAnterior();
        }
    }

    //Método para visualizar el menú de opciones y asignar la opción seleccionada.
    public static int menu() {
        int opcion = 0;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("=========== SELECCIONE UNA OPCIÓN DEL MENÚ =========== \n"
                    + "1. Agregar un Nodo a la Lista \n" + "2. Mostrar Nodos de la Lista \n"
                    + "3. Cantidad de Nodos de la Lista \n" + "4. Buscar por Código del Estudiante \n"
                    + "5. Buscar por Nombre del Estudiante \n" + "6. Eliminar Nodo de la Lista \n"
                    + "7. Informe: Promedio General y Máxima Nota \n" + "8. Borrar toda la Lista \n" + "9. Agregar un Nodo por la Cabeza \n"
                    + "10. Agregar Entre Dos Nodos \n" + "11. Salir" + "\n \n Seleccione una opción del 1 al 11:"));
        } while (opcion <= 0 || opcion > 11);
        return opcion;
    }

    public static void main(String[] args) {
//Se crea el objeto lis de la clase ListaEnlazadaDoble.        
        ListaEnlazadaDoble lis = new ListaEnlazadaDoble();
        int opcion, cod;
        String nom;
        Nodo aux;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    aux = new Nodo();
//Cuando se agrega un nodo se crea un nuevo objeto de la clase nodo.     
                    llenar(aux);
                    lis.agregar(aux);
                    break;
                case 2:
                    if (lis.getCabeza() != null) {
                        listarDesteFinal(lis.ultimo());

                    } //Pueden utilizar cualquiera de los dos métodos para listar.        
                    else {
                        JOptionPane.showMessageDialog(null, "La Lista Está Vacía....");
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "========= NÚMERO DE NODOS DE LA LISTA =========\n" + lis.contarNodos() + " Nodos");
                    break;
                case 4:
                    cod = Integer.parseInt(JOptionPane.showInputDialog("Digite CODIGO del Estudiante a Buscar: "));
                    aux = lis.buscar(cod);
                    if (aux != null) {
                        mostrar(aux);
                    } else {
                        JOptionPane.showMessageDialog(null, "La información del estudiante No se encuentra en la lista");
                    }
                    break;
                case 5:
                    nom = JOptionPane.showInputDialog("Digite NOMBRE del Estudiante a Buscar: ");
                    aux = lis.buscar(nom);
                    if (aux != null) {
                        mostrar(aux);
                    } else {
                        JOptionPane.showMessageDialog(null, "La información del estudiante No se encuentra en la lista");
                    }
                    break;
                case 6:
                    cod = Integer.parseInt(JOptionPane.showInputDialog("Digite CODIGO del Estudiante a Eliminar: "));
                    aux = lis.buscar(cod);
                    if (aux != null) {
                        lis.eliminar(aux);
                        JOptionPane.showMessageDialog(null, "La información fue eliminada correctamente....");
                    } else {
                        JOptionPane.showMessageDialog(null, "El código del estudiante NO EXISTE en la Lista");
                    }
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "========= INFORME PROMEDIO GENERAL Y MÁXIMA NOTA  ========= \n\n"
                            + "Promedio General: " + lis.promedioGeneral() + "\n y Máxima Nota: " + lis.maximaDefinitiva());
                    break;
                case 8:
                    lis.limpiar();
                    JOptionPane.showMessageDialog(null, "La Lista Está Vacía....");
                    break;
                case 9:
                    aux = new Nodo();
                    llenar(aux);
                    lis.agregarAcabeza(aux);
                    break;
                case 10:
                    cod = Integer.parseInt(JOptionPane.showInputDialog("CODIGO del Estudiante Después del que Quiere Agregar el Nuevo Nodo: "));
                    Nodo nd = lis.buscar(cod);
                    if (nd != null) {

                        aux = new Nodo();
                        llenar(aux);
                        lis.agregarEntreNodos(nd, aux);
                    } else {
                        JOptionPane.showMessageDialog(null, "El código del estudiante NO EXISTE en la Lista");
                    }
                    break;
                case 11:
                    break;
            }

        } while (opcion
                != 11);
    }
}
