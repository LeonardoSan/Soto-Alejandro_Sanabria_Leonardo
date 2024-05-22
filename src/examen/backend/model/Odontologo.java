package examen.backend.model;

public class Odontologo {
    private Integer ID;
    private String nombre;
    private String apellido;
    private int numMatricula;

    public Odontologo(Integer ID, String nombre, String apellido, int numMatricula) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numMatricula = numMatricula;
    }

    public Odontologo(String nombre, String apellido, int numMatricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numMatricula = numMatricula;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    @Override
    public String toString() {
        return "ODO{" +
                "ID=" + ID +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numMatricula=" + numMatricula +
                '}';
    }
}
