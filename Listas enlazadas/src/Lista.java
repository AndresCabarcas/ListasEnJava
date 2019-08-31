
import javax.swing.JOptionPane;

public class Lista {

    private Nodo Cabeza;

    public Lista() {
        Cabeza = null;
    }

    void set_Cabeza(Nodo c) {
        Cabeza = c;
    }

    public Nodo get_Cabeza() {
        return Cabeza;
    }

    //Ultimo nodo de la lista
    public Nodo Ultimo() {
        Nodo temp = Cabeza;
        while (temp != null) {

            if (temp.get_siguiente() == null) {
                break;

            } else {
                temp = temp.get_siguiente();
            }
        }
        return temp;
    }
//Agregar nodos

    public void AgregarNodos(Nodo nuevo) {
        if (Cabeza == null) {
            Cabeza = nuevo;
        } else {
            //-------------------------
            Nodo aux = Cabeza;

            while (aux.get_siguiente() != null) {

                aux = aux.get_siguiente();
            }
            //---------------------------------
            aux.set_siguiente(nuevo);
        }
    }

    //Agregar nodos al final
    void Agregar_al_final(Nodo nuevo) {
        if (Cabeza == null) {
            Cabeza = nuevo;

        } else {
            Ultimo().set_siguiente(nuevo);
        }
    }

    //buscar

    Nodo Buscar(int codi) {

        Nodo temp = Cabeza;
        while (temp != null) {
            if (temp.get_codigo() == codi) {
                break;
            } else {
                temp = temp.get_siguiente();
            }
        }
        return temp;
    }

    //Mostrar nodo
    void Mostrar(Nodo nod) {
        JOptionPane.showMessageDialog(null, "\tNumero: " + nod.get_codigo());
    }
    //Llenar el nodo

    void llenar(Nodo nod) {

        int codi;
        codi = Integer.parseInt(JOptionPane.showInputDialog(null, " Digitar Numero para el nodo \n"));
        nod.set_codigo(codi);

        
    }

    int Menu() {
        int opcion = 0;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "_________________________________________________________\n"
                    + "\n\t\t\t ESCOJA UNA OPCION DEL MENU \n"
                    + "___________________________________________________________\n"
                    + "\n\t1. Agregar Nodo\n"
                    + "\t2. Buscar Nodo\n"
                    + "\t3. Mostrar Lista\n"
                    + "\t4. Salir"
                    + "\nSeleccione una opcion del 1 al 4: "));
        } while (opcion <= 0 || opcion > 4);
        return opcion;
    }

    //primeramente enc debe ser false, num el numero y cant en 0
   public void contarPosiciones(boolean enc, int num, int cant, Nodo temp) {       
        if (temp != null) {          
            if (num == temp.get_codigo()) { 
                cant++;
                if (cant>0 && enc) {                    
                    JOptionPane.showMessageDialog(null, "El numero: " + num + " esta a " + cant + " posiciones del anterior");
                }                              
                if(!enc){     // si en contrar no es falso entonces es verdadero
                    cant=1;
                    JOptionPane.showMessageDialog(null, "Encontre el primer  "+num+" "+"en la poscicion  "+cant); 
                }
                temp = temp.get_siguiente();
                enc=true;
                cant = 0;
            } else {
                cant++;
                temp = temp.get_siguiente();
            }
            contarPosiciones(enc, num, cant,temp);            
        }
    }

}
