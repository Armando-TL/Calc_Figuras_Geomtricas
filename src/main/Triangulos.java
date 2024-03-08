package main;
// @author amdtr

public class Triangulos extends FigurasGeometricas {

    private double ladoA, ladoB;

    public double calcularHipotenusa() {
        return Math.sqrt((getLadoA() * getLadoA()) + (getLadoB() * getLadoB()));
    }

    @Override
    public double calcularArea() {
        return (getLadoA() * getLadoB()) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return calcularHipotenusa() + getLadoA() + getLadoB();
    }

    
    //Obtener datos
    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoB() {
        return ladoB;
    }

}
