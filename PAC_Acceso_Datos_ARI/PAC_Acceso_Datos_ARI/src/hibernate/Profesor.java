package hibernate;

import java.io.Serializable;

public class Profesor implements Serializable {

    int idProfesor;
    String nombre;
    String sexo;

    ///CONSTRUCTOR///
    public Profesor() {
        this.idProfesor = 457;
        this.nombre = "Lucas Skywalker";
        this.sexo = "V";
    }

    ///GETTERS Y SETTERS///
    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    ///MÉTODO ToString///
    @Override
    public String toString() {
        return "Profesor{" +
                "idProfesor=" + idProfesor +
                ", nombre='" + nombre + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
