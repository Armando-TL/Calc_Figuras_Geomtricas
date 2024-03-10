package main;
// @author amdtr

public class Main {

    public static void main(String[] args) {
        Interfaz ventana = new Interfaz();
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setTitle("Calcular figuras geometricas");
        ventana.setVisible(true);
    }

}
