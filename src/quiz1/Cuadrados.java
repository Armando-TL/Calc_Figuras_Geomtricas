package quiz1;
// @author amdtr

public class Cuadrados extends FigurasGeometricas {

    private double ladoA, ladoB;

    public double calcularDiagonal() {
        return Math.sqrt((getLadoA() * getLadoA()) + (getLadoB() * getLadoB()));
    }

    @Override
    public double calcularArea() {
        return getLadoA() * getLadoB();
    }

    @Override
    public double calcularPerimetro() {
        return (getLadoA() * 2 + getLadoB() * 2);

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
