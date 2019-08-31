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
public class Main {
     public static void llenar(Niño nod) {
        int cod = Integer.parseInt(JOptionPane.showInputDialog("Digite registro civil del niño: "));
        nod.setRegCivil(cod);
        String nom = JOptionPane.showInputDialog("Digite NOMBRE del niño: ");
        nod.setNombre(nom);
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite talla del niño: "));
        nod.setTalla(n1);
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite peso del niño: "));
        nod.setPeso(n2);
        String om = JOptionPane.showInputDialog("Digite departamento del niño: ");
        nod.setMunicipio(om);

    }
     
       public static String mostrar(Niño nod) {
        String datosNodo = "=========== INFORMACÓN DE LOS NODOS DE LA LISTA == == == == == = \n" ;
        datosNodo = datosNodo + String.valueOf("" + "Registro: " + nod.getRegCivil()+ "\n" + "NOMBRE:" + nod.getNombre() + "\n" + "Talla: " + nod.getTalla()+ "\n" + "Peso: " + nod.getPeso()+ "\n" + "Municipio:" + nod.getMunicipio()+ "\n \n"
        );
        return datosNodo;
    }
       
       public static void listar(Niño nod) {
        Niño temp = nod;
        
        String lista="-----------------------\n";
        
        
        while (temp != null) {
            lista+=mostrar(temp);
            lista+="-----------------------\n";
            temp = temp.getSiguiente();
        }
        JOptionPane.showMessageDialog(null, lista);
    }
       public static int menu() {
        int opcion = 0;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "=========== SELECCIONE UNA OPCIÓN DEL MENÚ == == == == == = \n "
                    + "1. Agregar un Nodo al final \n" + "2. Mostrar Nodos de la Lista \n"
                    + "3. Agregar al inicio \n" + "4. Buscar Registro\n"
                    + "5. Eliminar Nodo de la Lista \n" + "6. Agregar entre dos nodos \n"
                    + "7. Borrar toda la Lista \n" + "8. ordenar lista\n"+"9.salir" + "\n \n Seleccione una opción del 1 al 8: "));

        } while (opcion <= 0 || opcion > 9);
        return opcion;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Lista lis = new Lista(); //Se crea el objeto lis de la clase ListaEnlazada.
        int opcion, cod;
        Niño aux;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    aux = new Niño(); //Cuando se agrega un nodo se crea un nuevo objeto de la clase nodo.
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
                   aux = new Niño(); //Cuando se agrega un nodo se crea un nuevo objeto de la clase nodo.
                    llenar(aux);
                    lis.agregarinicio(aux);
                    break;
                case 4:
                    cod = Integer.parseInt(JOptionPane.showInputDialog(
                            "Digite registro a Buscar:"));
                    aux = lis.buscar(cod);
                    if (aux != null) {
                        mostrar(aux);
                    } else {
                        JOptionPane.showMessageDialog(null, "La información No se encuentra en la lista");
                    }
                    break;
                case 5:
                    cod = Integer.parseInt(JOptionPane.showInputDialog("Digite registro a Eliminar:"));
                    aux = lis.buscar(cod);
                    if (aux != null) {
                        lis.eliminar(aux);
                        JOptionPane.showMessageDialog(null, "La información fue eliminada correctamente....");
                    } else {
                        JOptionPane.showMessageDialog(null, "NO EXISTE en la Lista");
                    }
                    break;
                case 6:
                     if(lis.getCabeza()!=null){
                       int id= Integer.parseInt(JOptionPane.showInputDialog("   ¿Despues de què dato o identificacion insertara una nueva informacion?\n ")); 
                        Niño anterior;
                        anterior=lis.buscar(id);
                        if(anterior!=null){
                             aux= new Niño();
                             llenar(aux);
                             lis.agregue_entre_dos_Nodos(anterior, aux);
                         }
                     }else{
                         JOptionPane.showMessageDialog(null," Para realizar esta operacion Deve existir por lo menos un dato \n");
                     }
                    break;
                case 7:
                    lis.limpiar();
                    JOptionPane.showMessageDialog(null, "La Lista Está Vacía....");
                    break;
                case 8:
                    lis.ordenarBurbuja();                   
                    break;
                case 9:
                    break;
            }
        } while (opcion != 9);
    }
    
    
    
}
