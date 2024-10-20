package servicios;

import entidad.Cliente;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ServicioCliente {

    private static ArrayList<Cliente> clientesInterfaz = new ArrayList<>();

    public ServicioCliente() {
        if (clientesInterfaz.isEmpty()) {
            clientesInterfaz.add(new Cliente(1, "Javier", 30, 1.61, 75, "ADELGAZAR"));
            clientesInterfaz.add(new Cliente(2, "Juan", 31, 1.71, 89, "MUSCULATURA"));
            clientesInterfaz.add(new Cliente(3, "Pablo", 42, 1.75, 67, "TONIFICAR"));
        }
    }

    public void agregarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo) {
        Cliente c = new Cliente();
        c.setId(id);
        c.setNombre(nombre);
        c.setEdad(edad);
        c.setAltura(altura);
        c.setPeso(peso);
        c.setObjetivo(objetivo);
        clientesInterfaz.add(c);
    }

    public DefaultTableModel cargarTabla() {
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int clolumn) {
                return false;
            }
        };

        String[] titulos = {"Id", "Nombre", "Edad", "Altura", "Peso", "Objetivo", "IMC"};
        modeloTabla.setColumnIdentifiers(titulos);

        for (int i = 0; i < clientesInterfaz.size(); i++) {
            String imc = "";
            double imcNum = clientesInterfaz.get(i).getPeso() / (clientesInterfaz.get(i).getAltura() * clientesInterfaz.get(i).getAltura());
            if (imcNum < 18.5) {
                imc = "Bajo Peso";
            } else if (imcNum < 24.9) {
                imc = "Normal";
            } else {
                imc = "Sobrepeso";
            }

            modeloTabla.addRow(new Object[]{
                clientesInterfaz.get(i).getId(),
                clientesInterfaz.get(i).getNombre(),
                clientesInterfaz.get(i).getEdad(),
                clientesInterfaz.get(i).getAltura(),
                clientesInterfaz.get(i).getPeso(),
                clientesInterfaz.get(i).getObjetivo(),
                imc});
        }
        return modeloTabla;
    }

    public void eliminarCliente(int idCliente) {
        clientesInterfaz.remove(encontrarId(idCliente));
    }

    public Cliente encontrarCliente(int id) {
        return clientesInterfaz.get(encontrarId(id));
    }

    public int encontrarId(int id) {
        int idEncontrado = -1;
        for (int i = 0; i < clientesInterfaz.size(); i++) {
            if (clientesInterfaz.get(i).getId() == id) {
                idEncontrado = i;
            }
        }
        return idEncontrado;
    }

    public void cambiarCliente(int identificador, String nombre, int edad, double altura, double peso, String objetivo) {
        int i = encontrarId(identificador);
        
        clientesInterfaz.get(i).setNombre(nombre);
        clientesInterfaz.get(i).setEdad(edad);
        clientesInterfaz.get(i).setAltura(altura);
        clientesInterfaz.get(i).setPeso(peso);
        clientesInterfaz.get(i).setObjetivo(objetivo);
    }
}
