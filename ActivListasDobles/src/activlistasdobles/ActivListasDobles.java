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
public class ActivListasDobles {

    public static void llenar(Nodo nod){ 
        int num = Integer.parseInt(JOptionPane.showInputDialog(">> Digite numero: ")); 
        nod.setNumero(num);
    }
    public static void mostrar(Nodo nod){
        String datosNodo = "";
        datosNodo = datosNodo+String.valueOf("Numero:  " + nod.getNumero() + "\n\n");        
        JOptionPane.showMessageDialog(null, " >> >> >>> INFORMACÓN DE LOS NODOS DE LA LISTA <<< << << \n"+ datosNodo); 
    }
    
    public static void listar(Nodo nod){
        Nodo temp = nod;
        while(temp != null){
            mostrar(temp);
            temp = temp.getSiguiente();
        }
    }

    public static void listarDesteFinal(Nodo nod){
        Nodo temp = nod;
        while(temp != null){
            mostrar(temp);
            temp = temp.getAnterior();
        }
    }
    public static int menu(){
    int opcion = 0;
    do{
    opcion = Integer.parseInt(JOptionPane.showInputDialog("___________________________________" + "\n" +
                                                          "  =========== MENÚ ============="    + "\n" +
                                                          "___________________________________" + "\n" +
                                                          "1. Agregar un Nodo al inicio... \n" +
                                                          "2. Agregar un Nodo al final... \n" +
                                                          "3. Eliminar nodo... \n" +
                                                          "4. Mostrar lista... \n" +
                                                          "5. Agregar intermedio... \n" +
                                                          "6. Salir..." + 
                                                          "\n\n Seleccione una opción del 1 al 6"));
        }while(opcion <= 0 || opcion > 6);
           return opcion;
    }
    
    public static void main(String[] args) {
        Lista lis = new Lista();
        int opcion,cod;
        Nodo aux;
        do{
            opcion = menu();
            switch(opcion) {
                case 1:
                    aux=new Nodo();
                    llenar(aux);
                    lis.agregar(aux); 
                    break;
                    
                case 2:
                    aux = new Nodo();
                    llenar(aux);
                    lis.agregarAcabeza(aux);               
                    break;
                    
                case 3:
                    cod = Integer.parseInt(JOptionPane.showInputDialog("NUMERO A ELIMINAR: "));
                    aux = lis.buscar(cod);
                    if(aux != null){
                        lis.eliminar(aux); JOptionPane.showMessageDialog(null, "INFORMACION ELIMINADA CORRECTAMENTE...");
                    }else{
                        JOptionPane.showMessageDialog(null, ">>> NO SE HA ENCONTRADO LA INFORMACION =/ <<<");
                    }
                    break;
                    
                case 4:
                    if(lis.getCabeza() != null){
                        listarDesteFinal(lis.ultimo()); 
                    }else{
                        JOptionPane.showMessageDialog(null, "La Lista Está Vacía....");
                    }
                    break;
                
                case 5:
                    cod = Integer.parseInt(JOptionPane.showInputDialog("Numero Despues del que Quiere Agregar el Nuevo Nodo: "));
                    Nodo nd = lis.buscar(cod);
                    if(nd != null){
                        aux = new Nodo();
                        llenar(aux);
                        lis.agregarEntreNodos(nd, aux);
                    }else{
                        JOptionPane.showMessageDialog(null, ">>> NO SE HA ENCONTRADO LA INFORMACION =/ <<<");
                    }
                    break;
                                        
                case 6:
                    break;
            }
        }while(opcion != 6);
    }    
}
