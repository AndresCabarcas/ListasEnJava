

public class Nodo {

    private int codigo;
    private Nodo siguiente;
    
    public Nodo (){
        codigo=0;
        siguiente=null;
    }
     void set_codigo(int co){
     codigo=co;
    }
   
    void set_siguiente(Nodo s){
        siguiente=s;
    }
     public int get_codigo(){
    return codigo;
    }
     
    public Nodo get_siguiente(){
    return siguiente;
    }
}
