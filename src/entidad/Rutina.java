package entidad;

public class Rutina {
    private static int id = 0;
    private String nombre;
    private int duracion;
    private String nivelDificultad;
    private String descripcion;

    public Rutina() {
    }

    public Rutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion) {
        Rutina.id = ++Rutina.id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.nivelDificultad = nivelDificultad;
        this.descripcion = descripcion;
    }

    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return this.duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getNivelDificultad() {
        return this.nivelDificultad;
    }

    public void setNivelDificultad(String nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }  

    @Override
    public String toString() {
        return "Rutina{" + "id=" + id + ", nombre=" + nombre + ", duracion=" + duracion + ", nivelDificultad=" + nivelDificultad + ", descripcion=" + descripcion + '}';
    }
    
}
