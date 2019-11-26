package hibernate;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

///TANTO ESTA CLASE COMO Profesor y Modulo LLEVAN EL "implements Serializable"///
public class Alumno implements Serializable {
    private static final long serialversionUID = 1L;
    int idAlumno;
    String nombre;
    String nacionalidad;
    int edad;
    String sexo;
    List <String> modulos;

    ///CONSTRUCTOR///
    public Alumno() {
        this.idAlumno = 1;
        this.nombre = "Alejandro";
        this.nacionalidad = "española";
        this.edad = 31;
        this.sexo = "M";
        this.modulos = Collections.singletonList("M06, M07");

    }

    ///GETTERS Y SETTERS///
    public int getIdAlumno() {
        return idAlumno;
    }

    public int setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
        return idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public String setNombre(String nombre) {
        this.nombre = nombre;
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public ArrayList <String> getModulos() {
        return (ArrayList<String>) modulos;
    }

    public void setModulos (ArrayList <String> modulos) {
        this.modulos = modulos;
    }


    ///MÉTODO ToString///
    @Override
    public String toString() {
        return "Alumno{" +
                "idAlumno=" + idAlumno +
                ", nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", edad=" + edad +
                ", sexo='" + sexo + '\'' +
                ", modulos=" + modulos +
                '}';
    }
}
