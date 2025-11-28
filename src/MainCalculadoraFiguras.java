import java.util.Scanner;
public class MainCalculadoraFiguras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Figura[] figuras = new Figura[20];
        int contador = 0;
        int opcion;

        do {
            System.out.println("\n--- CALCULADORA DE FIGURAS GEOMÉTRICAS ---");
            System.out.println("1. Crear círculo");
            System.out.println("2. Crear rectángulo");
            System.out.println("3. Crear triángulo");
            System.out.println("4. Mostrar figuras creadas");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            try {
                // Leo lo que escribe el usuario y lo convertimos a número entero
                opcion = Integer.parseInt(sc.nextLine());

                // Selección según la opción elegida por el usuario
                switch (opcion) {

                    case 1:
                        // Creo CÍRCULO
                        System.out.print("Introduce el radio: ");
                        double radio = Double.parseDouble(sc.nextLine());

                        // Creo el círculo y lo guardamos en el array
                        figuras[contador++] = new Circulo(radio);

                        // Se muestra su área y perímetro
                        figuras[contador - 1].mostrarResumen();
                        break;

                    case 2:
                        // Creo RECTÁNGULO
                        System.out.print("Introduce la base: ");
                        double base = Double.parseDouble(sc.nextLine());

                        System.out.print("Introduce la altura: ");
                        double altura = Double.parseDouble(sc.nextLine());

                        // Se guarda el rectángulo en el array
                        figuras[contador++] = new Rectangulo(base, altura);

                        // Se muestra su área y perímetro
                        figuras[contador - 1].mostrarResumen();
                        break;

                    case 3:
                        // Creo TRIÁNGULO
                        System.out.print("Introduce la base: ");
                        double b = Double.parseDouble(sc.nextLine());

                        System.out.print("Introduce la altura: ");
                        double h = Double.parseDouble(sc.nextLine());

                        System.out.print("Introduce el lado 1: ");
                        double l1 = Double.parseDouble(sc.nextLine());

                        System.out.print("Introduce el lado 2: ");
                        double l2 = Double.parseDouble(sc.nextLine());

                        // Se guarda el triángulo en el array
                        figuras[contador++] = new TrianguloEquilatero(b, h, l1, l2);

                        // Se muestra su área y perímetro
                        figuras[contador - 1].mostrarResumen();
                        break;

                    case 4:
                        // Se muestra todas las figuras creadas
                        System.out.println("\n--- FIGURAS GUARDADAS ---");

                        for (int i = 0; i < contador; i++) {
                            // Se muestra el número de figura
                            System.out.print((i + 1) + ". ");
                            // Se muestra su área y perímetro
                            figuras[i].mostrarResumen();
                        }
                        break;

                    case 5:
                        // Salir del programa
                        System.out.println("Saliendo del programa...");
                        break;

                    default:
                        // Si se mete un número fuera del rango 1-6
                        System.out.println("Opción no válida.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: Debes introducir un número válido.");
                opcion = 0; // Evita que el programa salga del menú por error
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                opcion = 0;
            }

        } while (opcion != 5);

        // Cierro el Scanner para liberar memoria
        sc.close();
    }
}

