package main;
// @author amdtr

public class Triangulos extends FigurasGeometricas {

    private double base, altura;

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
        this.base = ladoA;
    }

    public double getLadoA() {
        return base;
    }

    public void setLadoB(double ladoB) {
        this.altura = ladoB;
    }

    public double getLadoB() {
        return altura;
    }

}
