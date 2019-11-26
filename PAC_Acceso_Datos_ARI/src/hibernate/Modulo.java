package hibernate;

import java.io.Serializable;


public class Modulo implements Serializable {

    private static final long serialversionUID = 1L;
    int idModulo;
    String nombre;
    int codigo;

    ///CONSTRUCTOR///
    public Modulo(){
        this.idModulo = 16566888;
        this.nombre = "Acceso a Datos";
        this.codigo = 52211;
    }

    ///GETTERS Y SETTERS///
    public int getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(int idModulo) {
        this.idModulo = idModulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    ///MÉTODO ToString///
    @Override
    public String toString() {
        return "Modulo{" +
                "idModulo=" + idModulo +
                ", nombre='" + nombre + '\'' +
                ", codigo=" + codigo +
                '}';
    }
}
