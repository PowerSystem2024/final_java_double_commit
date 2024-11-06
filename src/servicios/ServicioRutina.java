package servicios;

import entidad.Rutina;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

public class ServicioRutina {

    private static ArrayList<Rutina> rutinaInterfaz = new ArrayList<>();

    public ServicioRutina(){
        if(rutinaInterfaz.isEmpty()){
        rutinaInterfaz.add(new Rutina(1,"Tren Superior", 60, "Medio", "Se trabaja todos los musculos del tren superior"));
        rutinaInterfaz.add(new Rutina(2,"Tren Inferior", 60, "Medio", "Se trabaja todos los musculos del tren superior"));
        rutinaInterfaz.add(new Rutina(3,"Salto de cuerda", 15, "Basico", "Deberas hacer saltos cortos, sin despegar mucho del suelo durante 15min"));
        rutinaInterfaz.add(new Rutina(4,"Aerobico", 30, "Alto", "Consiste en ejercicios donde el ritmo cardiaco es acelerado para poder quemar muchas calorias"));
        }
    
    }
    
    
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
    
     public DefaultTableModel cargarTabla() {
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int clolumn) {
                return false;
            }
        };

        String[] titulos = {"Id", "Nombre", "Duracion", "NivelDificultad", "Descripcion"};
        modeloTabla.setColumnIdentifiers(titulos);

        for (int i = 0; i < rutinaInterfaz.size(); i++) {
                modeloTabla.addRow(new Object[]{
                rutinaInterfaz.get(i).getId(),
                rutinaInterfaz.get(i).getNombre(),
                rutinaInterfaz.get(i).getDuracion(),
                rutinaInterfaz.get(i).getNivelDificultad(),
                rutinaInterfaz.get(i).getDescripcion()});
                }
        
        return modeloTabla;
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
    
     public int encontrarId(int id) {
        int idEncontrado = -1;
        for (int i = 0; i < rutinaInterfaz.size(); i++) {
            if (rutinaInterfaz.get(i).getId() == id) {
                idEncontrado = i;
            }
        }
        return idEncontrado;
    }
    
    public void modificarRutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion) {
        int i = encontrarId(id);
        
        rutinaInterfaz.get(i).setNombre(nombre);
        rutinaInterfaz.get(i).setDuracion(duracion);
        rutinaInterfaz.get(i).setNivelDificultad(nivelDificultad);
        rutinaInterfaz.get(i).setDescripcion(descripcion);
    }
 
}
