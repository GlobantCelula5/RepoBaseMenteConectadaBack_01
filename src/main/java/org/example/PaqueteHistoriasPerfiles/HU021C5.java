package org.example.PaqueteHistoriasPerfiles;
import java.util.Scanner;

class Persona1 {
    String nombre;
    String especialidad;
    String biografia;
}
public class HU021C5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  cantidad;

        System.out.print("¿Cuántas personas deseas registrar?: ");
        cantidad = scanner.nextInt();
        scanner.nextLine();

        if (cantidad > 0) {
            Persona1[] personas1 = new Persona1[cantidad];


            for (int i = 0; i < cantidad; i++) {
                personas1[i] = new Persona1();

                System.out.println("\nPersona #" + (i + 1));

                System.out.print("Nombre: ");
                personas1[i].nombre = scanner.nextLine();

                while (personas1[i].nombre.equals("")) {
                    System.out.println("No se puede dejar el espacio de nombre vacio");
                    System.out.print("Ingrese el nombre: ");
                    personas1[i].nombre = scanner.nextLine();
                }


                System.out.print("Especialidad: ");
                personas1[i].especialidad = scanner.nextLine();
                while (personas1[i].especialidad.equals("")) {
                    System.out.println("No se puede dejar el espacio de Especialidad vacio");
                    System.out.print("Ingrese la especialidad: ");
                    personas1[i].especialidad = scanner.nextLine();
                }

                System.out.print("Biografia: ");
                personas1[i].biografia = scanner.nextLine();

            }

            System.out.println("\n=== Personas Registradas ===");
            System.out.printf("%-10s %-20s %-15s %-25s \n", "Código", "Nombre", "Especialidad", "Biografia");
            System.out.println("-----------------------------------------------------------------------------------------");

            for (int i = 0; i < cantidad; i++) {
                System.out.printf("%-10d %-20s %-15s %-25s \n",
                        (i + 1),
                        personas1[i].nombre,
                        personas1[i].especialidad,
                        personas1[i].biografia);

                
            }
        }
    }
}
