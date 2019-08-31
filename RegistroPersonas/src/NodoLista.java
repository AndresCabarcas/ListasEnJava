
import javax.swing.JOptionPane;


public class NodoLista {
    private NodoRegistroPers Cabeza;

    public NodoLista() {
        this.Cabeza = null;
    }

    public NodoRegistroPers getCabeza() {
        return Cabeza;
    }

    public void setCabeza(NodoRegistroPers Cabeza) {
        this.Cabeza = Cabeza;
    }
    //Ultimo nodo de la lista
   public NodoRegistroPers Ultimo(){
            NodoRegistroPers temp = Cabeza;
            while(temp != null){
                if(temp.getEnlace()== null){
                    break;
                }else{
                    temp = temp.getEnlace();
                }
            }
            return temp;
    }
   //Agregar nodos al final
   public void Agregar_al_final(NodoRegistroPers nuevo){
            if(Cabeza == null){
                Cabeza = nuevo;
            }else{
                Ultimo().setEnlace(nuevo);
            }
    }
    //Listar
    public String Listar(){
      String info="";
       NodoRegistroPers temp = Cabeza;
            while(temp != null){
                if(temp.getEnlace()== null){
                    break;
                }else{
                    info=JOptionPane.showInputDialog(temp.getNombres()+" - "+temp.getApellidos()+" - "+temp.getId()+" - "+temp.getEdad()+" - "+temp.getCelular()+" - "+temp.getDireccion()+" - ");
                    temp = temp.getEnlace();
                }
            }
         return info;
    }
    
}
