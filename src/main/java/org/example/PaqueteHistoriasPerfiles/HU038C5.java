package org.example.PaqueteHistoriasPerfiles;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HU038C5 {
    public static void main(String[] args) {

        ProyectoHU038C5 proyecto1 = new ProyectoHU038C5("Terapia Cognitivo-Conductual en Ansiedad", "Aplicación de un protocolo de TCC en pacientes con trastornos de ansiedad generalizada", "2025-09-15");
        ProyectoHU038C5 proyecto2 = new ProyectoHU038C5("Atención a Trastornos del Estado de Ánimo", "Estudio clínico sobre la efectividad de programas grupales en depresión leve", "2025-10-02");
        ProyectoHU038C5 proyecto3 = new ProyectoHU038C5("Estrategias de Aprendizaje en Secundaria", "Investigación sobre técnicas de estudio y rendimiento académico en adolescentes", "2025-09-28");
        ProyectoHU038C5 proyecto4 = new ProyectoHU038C5("Prevención del Bullying Escolar", "Diseño de un programa de intervención en instituciones educativas públicas", "2025-11-07");
        ProyectoHU038C5 proyecto5 = new ProyectoHU038C5("Bienestar Psicológico en el Trabajo", "Evaluación de la relación entre motivación y productividad en empresas del sector salud", "2025-09-22");
        ProyectoHU038C5 proyecto6 = new ProyectoHU038C5("Liderazgo y Clima Organizacional", "Análisis del impacto de estilos de liderazgo sobre la satisfacción laboral", "2025-10-19");
        ProyectoHU038C5 proyecto7 = new ProyectoHU038C5("Estimulación Temprana", "Programa de acompañamiento para potenciar el desarrollo cognitivo en niños de 0 a 5 años", "2025-09-30");
        ProyectoHU038C5 proyecto8 = new ProyectoHU038C5("Atención a Niños con TDAH", "Implementación de técnicas de modificación de conducta en contextos escolares", "2025-11-12");
        ProyectoHU038C5 proyecto9 = new ProyectoHU038C5("Juego Terapéutico", "Estudio sobre el uso del juego como herramienta de intervención en niños con ansiedad", "2025-10-25");

        PerfilProfesionalHU038C5 miPerfil = new PerfilProfesionalHU038C5("Sebastian Garzon Villada", "Psicologo Profesional", "SebastianGarzon@correo.gmail.com");
        miPerfil.agregarProyecto(proyecto1);
        miPerfil.agregarProyecto(proyecto6);
        miPerfil.agregarProyecto(proyecto9);

        PerfilProfesionalHU038C5 profesional2 = new PerfilProfesionalHU038C5("Laura Sánchez Gómez", "Psicóloga Clínica", "laura.sanchez@clinicapsi.com");
        profesional2.agregarProyecto(proyecto2);
        profesional2.agregarProyecto(proyecto4);

        PerfilProfesionalHU038C5 profesional3 = new PerfilProfesionalHU038C5("Andrés Mejía Torres", "Psicólogo Clínico", "andres.mejia@clinicapsi.com");
        profesional3.agregarProyecto(proyecto3);

        PerfilProfesionalHU038C5 profesional4 = new PerfilProfesionalHU038C5("María Fernanda López", "Psicóloga Educativa", "maria.lopez@educacionpsi.com");
        profesional4.agregarProyecto(proyecto4);
        profesional4.agregarProyecto(proyecto8);

        PerfilProfesionalHU038C5 profesional5 = new PerfilProfesionalHU038C5("Carlos Ramírez Duarte", "Psicólogo Educacional", "carlos.ramirez@educacionpsi.com");
        profesional5.agregarProyecto(proyecto5);

        PerfilProfesionalHU038C5 profesional6 = new PerfilProfesionalHU038C5("Diana Carolina Pérez", "Psicóloga Organizacional", "diana.perez@organizacionalpsi.com");
        profesional6.agregarProyecto(proyecto6);

        PerfilProfesionalHU038C5 profesional7 = new PerfilProfesionalHU038C5("Felipe Rojas Castaño", "Psicólogo Laboral", "felipe.rojas@organizacionalpsi.com");
        profesional7.agregarProyecto(proyecto7);

        PerfilProfesionalHU038C5 profesional8 = new PerfilProfesionalHU038C5("Valentina Morales Arango", "Psicóloga Infantil", "valentina.morales@infantilpsi.com");
        profesional8.agregarProyecto(proyecto8);

        PerfilProfesionalHU038C5 profesional9 = new PerfilProfesionalHU038C5("Julián Herrera López", "Psicólogo Infantil", "julian.herrera@infantilpsi.com");
        profesional9.agregarProyecto(proyecto9);
        profesional9.agregarProyecto(proyecto8);

        ArrayList<PerfilProfesionalHU038C5> profesionalesTodos = new ArrayList<>(Arrays.asList(profesional2, profesional3, profesional4, profesional5, profesional6, profesional7, profesional8, profesional9));
        ArrayList<PerfilProfesionalHU038C5> profesionalesGuardados = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\u001B[35m===  Seccion para compartir perfiles  ===");
        String opcionMenu1;

        do {
            System.out.print("\n\u001B[35m === Menu ===" +
                    "\n  1. Ver mi perfil " +
                    "\n  2. Perfiles compartidos conmigo" +
                    "\n  3. Todos los perfiles existentes" +
                    "\n  4. Salir del programa" +
                    "\n Ingrese el numero de opcion: ");
            opcionMenu1 = scanner.nextLine();

            final int[] contador = {1};
            switch (opcionMenu1) {
                case "1":
                    System.out.println("\u001B[93m" + miPerfil + "\u001B[35m");

                    System.out.print("\n\u001B[38;5;208m¿Te gustaría compartir tu perfil con alguien? (s/n): \u001B[0m");
                    String opcionCompartir = scanner.nextLine();

                    if (opcionCompartir.equalsIgnoreCase("s")) {
                        System.out.println("\n\u001B[94m ===  Todos los profesionales disponibles  === ");
                        contador[0] = 1;
                        profesionalesTodos.stream()
                                .forEach(p -> {
                                    System.out.println(contador[0] + ". " + p.nombreProfesional + " - " + p.especialidadProfesional);
                                    contador[0]++;
                                });

                        System.out.print("\nIngrese el número del profesional al que desea enviar su perfil: ");
                        int opcionCompartirNum = scanner.nextInt();
                        scanner.nextLine();

                        if (opcionCompartirNum >= 1 && opcionCompartirNum <= profesionalesTodos.size()) {
                            PerfilProfesionalHU038C5 destinatario = profesionalesTodos.get(opcionCompartirNum - 1);
                            System.out.println("Perfil compartido exitosamente con " + destinatario.nombreProfesional + ".\u001B[0m");
                        } else {
                            System.out.println("Número inválido, no se compartió el perfil.\u001B[0m");
                        }
                    } else {
                        System.out.println("No se compartió el perfil.\u001B[0m");
                    }
                    break;

                case "2":
                    System.out.println("\n\u001B[95m ===  Todos los profesionales  === ");
                    if (profesionalesGuardados.isEmpty())
                        System.out.println("No hay perfiles enviados");
                    else {
                        profesionalesGuardados.stream()
                                .forEach(p -> {
                                    System.out.println(contador[0] + ". " + p.nombreProfesional + " - " + p.especialidadProfesional);
                                    contador[0]++;
                                });
                    }
                    break;
                case "3":
                    System.out.println("\n\u001B[94m ===  Todos los profesionales  === ");
                    profesionalesTodos.stream()
                            .forEach(p -> {
                                System.out.println(contador[0] + ". " + p.nombreProfesional + " - " + p.especialidadProfesional);
                                contador[0]++;
                            });

                    System.out.println("\n\u001B[35m");

                    System.out.print("Ingrese el número del profesional que desea ver en detalle: ");
                    int opcionMenu2 = scanner.nextInt();

                    PerfilProfesionalHU038C5 seleccionado = null;
                    if (opcionMenu2 >= 1 && opcionMenu2 <= profesionalesTodos.size()) {
                        seleccionado = profesionalesTodos.get(opcionMenu2 - 1);
                        System.out.println("\n\u001B[92m === Perfil Seleccionado === \n");
                        System.out.println("Nombre: " + seleccionado.nombreProfesional);
                        System.out.println("Especialidad: " + seleccionado.especialidadProfesional);
                        System.out.println("Correo: " + seleccionado.correoProfesional);
                        System.out.println("Proyectos: " + seleccionado.proyectos);
                    } else {
                        System.out.println("Número inválido, intente de nuevo.");
                    }

                    scanner.nextLine();
                    System.out.print("\n¿Desea exportar este perfil a sus guardados? (s/n): ");
                    String opcionMenu3 = scanner.nextLine();

                    if (opcionMenu3.equalsIgnoreCase("s")) {
                        profesionalesGuardados.add(seleccionado);
                        System.out.println("Perfil exportado exitosamente.");
                    } else {
                        System.out.println("Perfil no guardado.\u001B[0m");
                    }

                    break;
            }
        } while (!opcionMenu1.equalsIgnoreCase("4"));

    }
}


class PerfilProfesionalHU038C5 {

    String nombreProfesional, especialidadProfesional, correoProfesional;
    ArrayList<ProyectoHU038C5> proyectos = new ArrayList<>();

    public PerfilProfesionalHU038C5(String nombreProfesional, String especialidadProfesional, String correoProfesional) {
        this.nombreProfesional = nombreProfesional;
        this.especialidadProfesional = especialidadProfesional;
        this.correoProfesional = correoProfesional;
    }

    public void agregarProyecto(ProyectoHU038C5 proyecto) {
        proyectos.add(proyecto);
    }


    @Override
    public String toString() {
        return "\n--- Perfil Profesional ---" +
                "\nNombre: " + nombreProfesional +
                "\nEspecialidad: " + especialidadProfesional +
                "\nCorreo: " + correoProfesional +
                "\nProyectos: " + proyectos + "\n";
    }
}


class ProyectoHU038C5 {
    String nombreProyecto, descripcionProyecto, fechaProyecto;

    public ProyectoHU038C5(String nombreProyecto, String descripcionProyecto, String fechaProyecto) {
        this.nombreProyecto = nombreProyecto;
        this.descripcionProyecto = descripcionProyecto;
        this.fechaProyecto = fechaProyecto;
    }

    @Override
    public String toString() {
        return "\nNombre del Proyecto: " + nombreProyecto +
                "\nDescripción: " + descripcionProyecto +
                "\nFecha: " + fechaProyecto + "\n";
    }
}
