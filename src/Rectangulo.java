public class Rectangulo extends Figura {

    private double base;
    private double altura;


    public Rectangulo(double base, double altura) {
        setBase(base);
        setAltura(altura);
    }


    public double getBase() {
        return base;
    }


    public void setBase(double base) {
        if (base <= 0)
            throw new IllegalArgumentException("La base debe ser mayor que 0");
        this.base = base;
    }


    public double getAltura() {
        return altura;
    }

    // Setter de la altura con validación
    public void setAltura(double altura) {
        if (altura <= 0)
            throw new IllegalArgumentException("La altura debe ser mayor que 0");
        this.altura = altura;
    }


    @Override
    public double calcularArea() {
        return base * altura; // Fórmula: base × altura
    }


    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura); // Fórmula del perímetro del rectángulo
    }
}