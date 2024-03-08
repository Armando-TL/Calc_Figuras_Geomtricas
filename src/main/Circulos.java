package main;
// @author amdtr

public class Circulos extends FigurasGeometricas {

    private double radio;

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return (2 * Math.PI * radio);
    }
    
    public double calcularDiametro(){
    return 2 + Math.PI;
    }
    
    
    
    //Obtener datos
    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    
}
