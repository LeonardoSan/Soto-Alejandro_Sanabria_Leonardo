public class Odontologo {

    private int numMatricula;
    private String nombre;
    private String apellido;
    private Integer ID;

    public Odontologo(int numMatricula, String nombre, String apellido) {
        this.numMatricula = numMatricula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Odontologo(int numMatricula, String nombre, String apellido, Integer ID) {
        this.numMatricula = numMatricula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
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

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Odontologo{" +
                "numMatricula=" + numMatricula +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", ID=" + ID +
                '}';
    }
}
