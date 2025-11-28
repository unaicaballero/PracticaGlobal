public class TrianguloEquilatero extends Figura {

    private double base;
    private double altura;
    private double lado1;
    private double lado2;


    public TrianguloEquilatero(double base, double altura, double lado1, double lado2) {
        setBase(base);
        setAltura(altura);
        setLado1(lado1);
        setLado2(lado2);
    }


    public void setBase(double base) {
        if (base <= 0)
            throw new IllegalArgumentException("La base debe ser mayor que 0");
        this.base = base;
    }


    public void setAltura(double altura) {
        if (altura <= 0)
            throw new IllegalArgumentException("La altura debe ser mayor que 0");
        this.altura = altura;
    }


    public void setLado1(double lado1) {
        if (lado1 <= 0)
            throw new IllegalArgumentException("El lado 1 debe ser mayor que 0");
        this.lado1 = lado1;
    }


    public void setLado2(double lado2) {
        if (lado2 <= 0)
            throw new IllegalArgumentException("El lado 2 debe ser mayor que 0");
        this.lado2 = lado2;
    }


    @Override
    public double calcularArea() {
        // Fórmula del área del triángulo: base × altura / 2
        return (base * altura) / 2;
    }


    @Override
    public double calcularPerimetro() {
        // Sumamos los tres lados
        return base + lado1 + lado2;
    }
}