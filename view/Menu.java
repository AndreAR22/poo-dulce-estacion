package view;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    private boolean running = true;
    private int seleccion;

    private void showOpciones() {
        System.out.println("\n--- DULCE ESTACIÓN ---");
        System.out.println("1. Gestionar máquinas");
        System.out.println("2. Gestionar alquileres");
        System.out.println("3. Mostrar reporte general");
        System.out.println("4. Salir");
    }

    AlquileresView alquileresView = new AlquileresView();
    MaquinaView maquinaView = new MaquinaView(alquileresView);


    public void inicio(){
        while(running){
            showOpciones();
            seleccion = scanner.nextInt();
            scanner.nextLine();
            try {
                switch (seleccion){
                    case 4:
                        running = false;
                        break;
                    case 2:
                        alquileresView.mostrarAlquileresView(scanner);
                        break;
                    case 1:
                        maquinaView.mostrarMaquinaView(scanner);
                        break;
                    case 3:
                        alquileresView.mostrarReporte();
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                        break;
                }
            }
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        
        }
    }
}
