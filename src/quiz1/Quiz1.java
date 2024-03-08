package quiz1;
// @author amdtr

import javax.swing.JOptionPane;

public class Quiz1 {

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
