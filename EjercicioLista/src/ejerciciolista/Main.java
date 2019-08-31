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
public class Main {
    
     public static void llenar(Nodo nod) {
        int cod = Integer.parseInt(JOptionPane.showInputDialog("Digite Numero para la Lista: "));
        nod.setNumero(cod);
    }
     
     public static void mostrar(Nodo nod) {
        String datosNodo = "";
        datosNodo = datosNodo + String.valueOf("" + "NUMERO: " + nod.getNumero()+"\n \n"
        );
        JOptionPane.showMessageDialog(null, "=========== INFORMACÓN DE LOS NODOS DE LA LISTA == == == == == = \n" + datosNodo);
    }
     
      public static void listar(Nodo nod) {
        Nodo temp = nod;
        while (temp != null) {
            mostrar(temp);
            temp = temp.getSiguiente();
        }
    }
      
       public static int menu() {
        int opcion = 0;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "=========== SELECCIONE UNA OPCIÓN DEL MENÚ == == == == == = \n "
                    + "1. Agregar un Nodo a la Lista \n" + "2. Mostrar Nodos de la Lista \n"
                    + "3. Cantidad de Nodos de la Lista \n" + "4. Buscar Nodo \n"
                    + "5. Eliminar Nodo de la Lista \n" + "6. Realzar busqueda de la clave (x) \n"
                    + "7. Borrar toda la Lista \n" + "8. Salir" + "\n \n Seleccione una opción del 1 al 8: "));

        } while (opcion <= 0 || opcion > 8);
        return opcion;
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
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
                            "Digite el Numero a Buscar:"));
                    aux = lis.buscar(cod);
                    if (aux != null) {
                        mostrar(aux);
                    } else {
                        JOptionPane.showMessageDialog(null, "El numero No se encuentra en la lista");
                    }
                    break;
                case 5:
                    cod = Integer.parseInt(JOptionPane.showInputDialog("Digite el Numero a Eliminar:"));
                    aux = lis.buscar(cod);
                    if (aux != null) {
                        lis.eliminar(aux);
                        JOptionPane.showMessageDialog(null, "La información fue eliminada correctamente....");
                    } else {
                        JOptionPane.showMessageDialog(null, "El Numero no existe en la Lista");
                    }
                    break;
                case 6:
                    int numer = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
                    lis.contarPosiciones(false, numer, 0, lis.getCabeza());
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
