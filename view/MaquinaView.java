package view;

import controller.MaquinaController;

import java.util.Scanner;

public class MaquinaView {

    public MaquinaController controller;

    private boolean running;
    private int seleccion;

    public MaquinaView(AlquileresView alquileresView) {
        this.controller = new MaquinaController(alquileresView.controller);
    }

    private void showOpcionesMaquinas() {
        System.out.println("\n--- MÁQUINAS ---");
        System.out.println("1. Registrar máquina");
        System.out.println("2. Consultar inventario");
        System.out.println("3. Consultar máquina por código");
        System.out.println("4. Regresar al menú principal");
    }

    private void showTiposMaquina() {
        System.out.println("\n--- TIPO DE MÁQUINA ---");
        System.out.println("1. Popcorn");
        System.out.println("2. Chocolate");
        System.out.println("3. Algodon");
        System.out.println("4. Cancelar");
    }

    public void mostrarMaquinaView(Scanner scanner) {
        running = true;
        while (running) {
            showOpcionesMaquinas();
            seleccion = scanner.nextInt();
            scanner.nextLine();
            switch (seleccion) {
                case 4:
                    running = false;
                    break;
                case 1:
                    registrarMaquina(scanner);
                    break;
                case 2:
                    controller.consultarInventario();
                    break;
                case 3:
                    System.out.println("Ingrese el código de la máquina");
                    int codigoConsulta = scanner.nextInt();
                    scanner.nextLine();
                    controller.consultarMaquina(codigoConsulta);
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }

    private void registrarMaquina(Scanner scanner) {
        showTiposMaquina();
        int tipo = scanner.nextInt();
        scanner.nextLine();
        if (tipo == 4) {
            System.out.println("Registro cancelado.");
            return;
        }

        System.out.println("Ingrese el código de la máquina");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese la marca de la máquina");
        String marca = scanner.nextLine();

        System.out.println("Ingrese el modelo de la máquina");
        String modelo = scanner.nextLine();

        System.out.println("Ingrese la tarifa diaria");
        double tarifa = scanner.nextDouble();
        scanner.nextLine();

        switch (tipo) {
            case 1:
                System.out.println("Ingrese las porciones por hora");
                int porcionesHora = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Ingrese si incluye carrito (true/false)");
                boolean conCarrito = scanner.nextBoolean();
                scanner.nextLine();
                controller.registrarPopcorn(codigo, marca, modelo, tarifa, porcionesHora, conCarrito);
                break;
            case 2:
                System.out.println("Ingrese la capacidad en kg");
                double capacidad = scanner.nextDouble();
                scanner.nextLine();
                controller.registrarChocolate(codigo, marca, modelo, tarifa, capacidad);
                break;
            case 3:
                System.out.println("Ingrese la potencia en W");
                int potencia = scanner.nextInt();
                scanner.nextLine();
                controller.registrarAlgodon(codigo, marca, modelo, tarifa, potencia);
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                break;
        }
    }
}
