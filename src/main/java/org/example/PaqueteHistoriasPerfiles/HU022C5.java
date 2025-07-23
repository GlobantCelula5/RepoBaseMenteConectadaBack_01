package org.example.PaqueteHistoriasPerfiles;

import java.util.Scanner;

class Persona {
    String nombre;
    String telefono;
    String direccion;
    String correo;
}
public class HU022C5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String edit, campo;
        Byte num;
        int posicion;

        System.out.print("¿Cuántas personas deseas registrar?: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el salto de línea

        // Crear un array de objetos Persona
        Persona[] personas = new Persona[cantidad];

        // Llenar los datos de cada persona
        for (int i = 0; i < cantidad; i++) {
            personas[i] = new Persona(); // Crear un nuevo objeto en la posición i

            System.out.println("\nPersona #" + (i + 1));

            System.out.print("Nombre: ");
            personas[i].nombre = scanner.nextLine();

            System.out.print("Teléfono: ");
            personas[i].telefono = scanner.nextLine();

            System.out.print("Dirección: ");
            personas[i].direccion = scanner.nextLine();

            System.out.print("Correo: ");
            personas[i].correo = scanner.nextLine();
        }

        System.out.println("\n=== Personas Registradas ===");
        System.out.printf("%-20s %-15s %-25s %-25s\n", "Nombre", "Teléfono", "Dirección", "Correo");
        System.out.println("-------------------------------------------------------------------------------------------");

        for (int i = 0; i < cantidad; i++) {
            System.out.printf("%-20s %-15s %-25s %-25s\n",
                    personas[i].nombre,
                    personas[i].telefono,
                    personas[i].direccion,
                    personas[i].correo);
        }

        System.out.println("Desea editar algun registro? responda si o no ");
        edit=scanner.nextLine();
        if (edit.equalsIgnoreCase("si")){
            System.out.println("Ingrese el numero del registro a editar: entre 1 y "+cantidad);
            num = scanner.nextByte();
            posicion = num - 1;
            scanner.nextLine();

            System.out.println("Ingrese el nombre del campo a editar o escriba TODO si desea editar todos los datos");
            campo = scanner.nextLine();
            scanner.nextLine();
            if (campo.equalsIgnoreCase("nombre")) {
                System.out.print("Ingrese el nuevo nombre: ");
                personas[posicion].nombre = scanner.nextLine();
            } else if (campo.equalsIgnoreCase("direccion")) {
                System.out.print("Ingresa la nueva direccion: ");
                personas[posicion].direccion = scanner.nextLine();
            } else if (campo.equalsIgnoreCase("telefono")) {
                System.out.print("Ingresa el nuevo telefono");
                personas[posicion].telefono = scanner.nextLine();
            } else if (campo.equalsIgnoreCase("Correo")) {
                System.out.print("Ingrese el nuevo correo");
                personas[posicion].correo = scanner.nextLine();
            } else if (campo.equalsIgnoreCase("todo")) {
                System.out.print("Ingrese el nuevo nombre: ");
                personas[posicion].nombre = scanner.nextLine();
                System.out.print("Ingresa la nueva direccion: ");
                personas[posicion].direccion = scanner.nextLine();
                System.out.print("Ingresa el nuevo telefono");
                personas[posicion].telefono = scanner.nextLine();
                System.out.print("Ingrese el nuevo correo");
                personas[posicion].correo= scanner.nextLine();
            } else {
                System.out.println("Ingreso un valor erroneo");
            }
            System.out.println("\u001B[32m El cambio fue realizado \u001B[0m");
            System.out.println("\n=== Personas Registradas ===");
            System.out.printf("%-20s %-15s %-25s %-25s\n", "Nombre", "Teléfono", "Dirección", "Correo");
            System.out.println("-------------------------------------------------------------------------------------------");

            for (int i = 0; i < cantidad; i++) {
                System.out.printf("%-20s %-15s %-25s %-25s\n",
                        personas[i].nombre,
                        personas[i].telefono,
                        personas[i].direccion,
                        personas[i].correo);
            }

        }

    }

}
