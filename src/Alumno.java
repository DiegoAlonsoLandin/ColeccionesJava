public class Alumno {

    // Atributos
    private String nombre;
    private Integer grado;

    // Constructor
    public Alumno(String nombre, Integer grado) {
        this.nombre = nombre;
        this.grado = grado;
    }


    // Metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getGrado() {
        return grado;
    }

    public void setGrado(Integer grado) {
        this.grado = grado;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", grado=" + grado +
                '}';
    }
}
