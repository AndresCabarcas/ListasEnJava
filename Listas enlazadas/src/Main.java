
import javax.swing.JOptionPane;

public class Main {
    
    public static void mostrar(Nodo nod) {
        String datosNodo = "";
        datosNodo = datosNodo + String.valueOf("" +"Numero: " + nod.get_codigo()+ "\n \n"
        );
        JOptionPane.showMessageDialog(null, "=========== INFORMACÓN DE LOS NODOS DE LA LISTA == == == == == = \n" + datosNodo);
    }
    
    public static void listar(Nodo nod) {
        Nodo temp = nod;
        while (temp != null) {
            mostrar(temp);
            temp = temp.get_siguiente();
        }
    }
   

    public static void main(String[] args) {
        Lista DVS = new Lista();
        Nodo obj = new Nodo();

        Nodo aux;
        int opc;
        do {
            opc = DVS.Menu();
            //opc=opcion;
            switch (opc) {
                case 1:
                    aux = new Nodo();
                    DVS.llenar(aux);
                    DVS.AgregarNodos(aux);
                    break;
                case 2:
                    int numer = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
                    DVS.contarPosiciones(false, numer, 0, DVS.get_Cabeza());
                    break;
                case 3:
                     if (DVS.get_Cabeza() != null) {
                        listar(DVS.get_Cabeza());
                    } else {
                        JOptionPane.showMessageDialog(null, "La Lista Está Vacía....");
                    }
                    break;
                case 4:
                    
                    break;

            }

        } while (opc != 4);

    }
}
