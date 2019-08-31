/**
 *
 * @author Deivis Sanchez
 */
public class NodoRegistroPers {
    private String Nombres, Apellidos, Id, celular, Direccion,Edad;
   
    private NodoRegistroPers Enlace;

    public NodoRegistroPers() {
        this.Nombres = "";
        this.Apellidos = "";
        this.Id = "";
        this.celular = "";
        this.Direccion = "";
        this.Edad = "";
        this.Enlace =null;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public NodoRegistroPers getEnlace() {
        return Enlace;
    }

    public void setEnlace(NodoRegistroPers Enlace) {
        this.Enlace = Enlace;
    }
}
