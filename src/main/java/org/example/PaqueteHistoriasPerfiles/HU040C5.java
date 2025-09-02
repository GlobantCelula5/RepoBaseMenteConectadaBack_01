package org.example.PaqueteHistoriasPerfiles;

import java.util.ArrayList;
import java.util.Scanner;

public class HU040C5 {

    public static class Perfil {
        String nombreEspecialista;
        String especialidad;


        public Perfil(String nombreEspecialista, String especialidad) {
            this.nombreEspecialista = nombreEspecialista;
            this.especialidad = especialidad;
        }



        @Override
        public String toString() {
            return "Nombre del especialista: " + nombreEspecialista +
                    "\nEspecialidad: " + especialidad + "\n";
        }
    }

    public static void main(String[] args) {

        ArrayList<Perfil> perfilesEspecialista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Se añaden los perfiles al array
        perfilesEspecialista.add(new Perfil("Dra. Ana López", "Psicología clínica"));
        perfilesEspecialista.add(new Perfil("Dr. Carlos Gómez", "Psicología infantil"));
        perfilesEspecialista.add(new Perfil("Lic. Laura Mendieta", "Terapia de pareja"));
        perfilesEspecialista.add(new Perfil("Dr. Javier Ruiz", "Psicología general"));
        perfilesEspecialista.add(new Perfil("Dra. Sofía Vargas", "Psicología clínica"));
        perfilesEspecialista.add(new Perfil("Lic. Pedro Castro", "Psicología general"));
        perfilesEspecialista.add(new Perfil("Dra. Isabel Torres", "Terapia familiar"));
        perfilesEspecialista.add(new Perfil("Dr. Miguel Sánchez", "Terapia de pareja"));
        perfilesEspecialista.add(new Perfil("Lic. Elena Ramos", "Psicología clínica"));
        perfilesEspecialista.add(new Perfil("Dr. David Fernández", "Psicología general"));

        String continuar;

        do {
            System.out.println("\n=== Bienvenido al portafolio de especialistas ===");
            System.out.println("¿Qué tipo de especialistas quieres ver?");
            System.out.println("1. Psicología clínica");
            System.out.println("2. Psicología infantil");
            System.out.println("3. Terapia de pareja");
            System.out.println("4. Psicología general");
            System.out.println("5. Terapia familiar");
            System.out.println("6. Ver todos");
            System.out.print("Elige una opción (1-6): ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            System.out.println("\n--- Resultados ---");
            boolean encontrado = false;

            switch (opcion) {
                case 1:
                    System.out.println("Especialistas en Psicología clínica:");
                    for (Perfil perfil : perfilesEspecialista) {
                        if (perfil.especialidad.equalsIgnoreCase("Psicología clínica")) {
                            System.out.println(perfil);
                            encontrado = true;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Especialistas en Psicología infantil:");
                    for (Perfil perfil : perfilesEspecialista) {
                        if (perfil.especialidad.equalsIgnoreCase("Psicología infantil")) {
                            System.out.println(perfil);
                            encontrado = true;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Especialistas en Terapia de pareja:");
                    for (Perfil perfil : perfilesEspecialista) {
                        if (perfil.especialidad.equalsIgnoreCase("Terapia de pareja")) {
                            System.out.println(perfil);
                            encontrado = true;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Especialistas en Psicología general:");
                    for (Perfil perfil : perfilesEspecialista) {
                        if (perfil.especialidad.equalsIgnoreCase("Psicología general")) {
                            System.out.println(perfil);
                            encontrado = true;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Especialistas en Terapia familiar:");
                    for (Perfil perfil : perfilesEspecialista) {
                        if (perfil.especialidad.equalsIgnoreCase("Terapia familiar")) {
                            System.out.println(perfil);
                            encontrado = true;
                        }
                    }
                    break;
                case 6:
                    System.out.println("Todos los especialistas:");
                    for (Perfil perfil : perfilesEspecialista) {
                        System.out.println(perfil);
                        encontrado = true;
                    }
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }

            if (!encontrado && (opcion >= 1 && opcion <= 5)) {
                System.out.println("No se encontraron especialistas para la especialidad seleccionada.");
            }

            System.out.print("¿Desea ver otra categoría? (s/n): ");
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("\nPrograma finalizado. ¡Gracias!");
        scanner.close();
    }
}
