public class Circulo extends Figura {

    private double radio;

    public Circulo(double radio) {
        setRadio(radio); // Uso el setter para validar el valor
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if (radio <= 0)
            throw new IllegalArgumentException("El radio debe ser mayor que 0");
        this.radio = radio;
    }


    @Override
    public double calcularArea() {
        return Math.PI * radio * radio; // Fórmula del área de un círculo
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio; // Fórmula del perímetro (circunferencia)
    }
}

