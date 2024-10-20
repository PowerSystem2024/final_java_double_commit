package servicios;

import entidad.Rutina;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioRutina {

    private static ArrayList<Rutina> rutinaInterfaz = new ArrayList<>();

    public void crearRutina(String nombre, int duracion, String nivelDificultad, String descripcion) {
        Rutina rutina = new Rutina();

        rutina.setNombre(nombre);
        rutina.setDuracion(duracion);
        rutina.setNivelDificultad(nivelDificultad);
        rutina.setDescripcion(descripcion);
        rutinaInterfaz.add(rutina);
    }

    public void obtenerRutinas(ArrayList<Rutina> rutinas) {
        for (Rutina rutina : rutinas) {
            System.out.println(rutina);
        }
    }

    public void actualizarRutina(ArrayList<Rutina> rutinas, int id, String nombre, int duracion, String nivelDificultad, String descripcion) {
        int idEncontrado = buscarId(rutinas, id);
        rutinas.get(idEncontrado).setNombre(nombre);
        rutinas.get(idEncontrado).setDuracion(duracion);
        rutinas.get(idEncontrado).setNivelDificultad(nivelDificultad);
        rutinas.get(idEncontrado).setDescripcion(descripcion);
    }

    public void eliminarRutina(ArrayList<Rutina> rutinas, int id) {
        rutinas.remove(buscarId(rutinas, id));
    }

    public int buscarId(ArrayList<Rutina> rutinas, int id) {
        int idEncontrado = -1;
        for (int i = 0; i < rutinas.size(); i++) {
            if (rutinas.get(i).getId() == id) {
                idEncontrado = i;
            }
        }
        return idEncontrado;
    }
}
