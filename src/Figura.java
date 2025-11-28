public abstract class Figura {

    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    public void mostrarResumen() {
        System.out.printf("Área: %.2f | Perímetro: %.2f\n", calcularArea(), calcularPerimetro());
    }
}
