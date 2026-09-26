package view;

import controller.AlquileresController;

import java.util.Scanner;

public class AlquileresView {

    public AlquileresController controller = new AlquileresController();

    private boolean running;
    private int seleccion;

    private void showOpcionesAlquileres() {
        System.out.println("\n--- ALQUILERES ---");
        System.out.println("1. Cotizar");
        System.out.println("2. Alquilar máquina");
        System.out.println("3. Registrar devolución");
        System.out.println("4. Regresar al menú principal");
    }

    private void showConfirmacion() {
        System.out.println("\n--- CONFIRMAR ALQUILER ---");
        System.out.println("1. Confirmar");
        System.out.println("2. Cancelar");
    }

    public void mostrarAlquileresView(Scanner scanner) {
        running = true;
        while (running) {
            showOpcionesAlquileres();
            seleccion = scanner.nextInt();
            scanner.nextLine();
            switch (seleccion) {
                case 4:
                    running = false;
                    break;
                case 1:
                    System.out.println("Ingrese el código de la máquina");
                    int codigoCotizar = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Ingrese la cantidad de días");
                    int diasCotizar = scanner.nextInt();
                    scanner.nextLine();
                    controller.cotizar(codigoCotizar, diasCotizar);
                    break;
                case 2:
                    System.out.println("Ingrese el código de la máquina");
                    int codigoAlquiler = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Ingrese la cantidad de días");
                    int diasAlquiler = scanner.nextInt();
                    scanner.nextLine();
                    controller.cotizar(codigoAlquiler, diasAlquiler);
                    showConfirmacion();
                    int confirmacion = scanner.nextInt();
                    scanner.nextLine();
                    if (confirmacion == 1) {
                        controller.confirmarAlquiler(codigoAlquiler, diasAlquiler);
                    } else {
                        System.out.println("Alquiler cancelado.");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el código de la máquina");
                    int codigoDevolucion = scanner.nextInt();
                    scanner.nextLine();
                    controller.registrarDevolucion(codigoDevolucion);
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }

    public void mostrarReporte() {
        System.out.println(controller.getReporte());
    }
}
