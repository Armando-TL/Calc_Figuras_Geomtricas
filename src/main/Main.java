package main;
// @author amdtr

import javax.swing.JOptionPane;

public class Main {

    public static String mensaje = "El resultado es ";

    public static void main(String[] args) {
        int opcion;
        boolean continuar = true;
        Interfaz ventana = new Interfaz();
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setTitle("Calcular figuras geometricas");
        ventana.setVisible(true);
    }

}
