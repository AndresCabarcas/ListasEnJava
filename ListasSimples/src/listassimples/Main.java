/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listassimples;

import javax.swing.JOptionPane;

/**
 *
 * @author ANDACAMES
 */
public class Main {
//Se declaran los siguientes métodos, que serán llamados dentro del método static void main:
//Método para asignar los valores a los atributos de la clase Nodo, aquí se crea una instancia por
//parámetro de la clase Nodo llamada nod.

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
        datosNodo = datosNodo + String.valueOf("" + "CODIGO: " + nod.getCodigo() + "\n" + "NOMBRE:" + nod.getNombre() + "\n" + "NOTA 1: " + nod.getNota1() + "\n" + "NOTA 2: " + nod.getNota2() + "\n" + "NOTA 3:" + nod.getNota3() + "\n" + "Definitiva: " + nod.definitiva() + "\n \n"
        );
        JOptionPane.showMessageDialog(null, "=========== INFORMACÓN DE LOS NODOS DE LA LISTA == == == == == = \n" + datosNodo);
    }
//Método para listar cada uno de los nodos de la lista y visualizarlos en pantalla.

    public static void listar(Nodo nod) {
        Nodo temp = nod;
        while (temp != null) {
            mostrar(temp);
            temp = temp.getSiguiente();
        }
    }
//Método para visualizar el menú de opciones y asignar la opción seleccionada.

    public static int menu() {
        int opcion = 0;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "=========== SELECCIONE UNA OPCIÓN DEL MENÚ == == == == == = \n "
                    + "1. Agregar un Nodo a la Lista \n" + "2. Mostrar Nodos de la Lista \n"
                    + "3. Cantidad de Nodos de la Lista \n" + "4. Buscar la Información de un estudiante \n"
                    + "5. Eliminar Nodo de la Lista \n" + "6. Informe: Promedio General y Máxima Nota \n"
                    + "7. Borrar toda la Lista \n" + "8. Salir" + "\n \n Seleccione una opción del 1 al 8: "));

        } while (opcion <= 0 || opcion > 8);
        return opcion;
    }

    public static void main(String[] args) {
        Lista lis = new Lista(); //Se crea el objeto lis de la clase ListaEnlazada.
        int opcion, cod;
        Nodo aux;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    aux = new Nodo(); //Cuando se agrega un nodo se crea un nuevo objeto de la clase nodo.
                    llenar(aux);
                    lis.agregar(aux);
                    break;
                case 2:
                    if (lis.getCabeza() != null) {
                        listar(lis.getCabeza());
                    } else {
                        JOptionPane.showMessageDialog(null, "La Lista Está Vacía....");
                    }

                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "========= NÚMERO DE NODOS DE LA LISTA=========\n" + lis.contarNodos() + " Nodos");
                    break;
                case 4:
                    cod = Integer.parseInt(JOptionPane.showInputDialog(
                            "Digite CODIGO del Estudiante a Buscar:"));
                    aux = lis.buscar(cod);
                    if (aux != null) {
                        mostrar(aux);
                    } else {
                        JOptionPane.showMessageDialog(null, "La información del estudiante No se encuentra en la lista");
                    }
                    break;
                case 5:
                    cod = Integer.parseInt(JOptionPane.showInputDialog("Digite CODIGO del Estudiante a Eliminar:"));
                    aux = lis.buscar(cod);
                    if (aux != null) {
                        lis.eliminar(aux);
                        JOptionPane.showMessageDialog(null, "La información fue eliminada correctamente....");
                    } else {
                        JOptionPane.showMessageDialog(null, "El código del estudiante NO EXISTE en la Lista");
                    }
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "========= INFORME PROMEDIO GENERAL YMÁXIMA NOTA ========= \n\n" + "Promedio General: " + lis.promedioGeneral() + "\n y Máxima Nota: " + lis.maximaDefinitiva());
                    break;
                case 7:
                    lis.limpiar();
                    JOptionPane.showMessageDialog(null, "La Lista Está Vacía....");
                    break;
                case 8:
                    break;
            }
        } while (opcion != 8);
    }
}
