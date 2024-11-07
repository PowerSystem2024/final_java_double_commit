package entidad;

public class Rutina {

    private int id; // Cambia a no estático
    private String nombre;
    private int duracion;
    private String nivelDificultad;
    private String descripcion;

    // Variable estática para llevar la cuenta del último ID usado
    private static int ultimoId = 0;

    public Rutina() {
    }

    public Rutina(String nombre, int duracion, String nivelDificultad, String descripcion) {
        this.id = ++ultimoId; // Incrementa y asigna el id automáticamente
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
