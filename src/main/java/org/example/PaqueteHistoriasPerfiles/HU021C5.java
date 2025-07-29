package org.example.PaqueteHistoriasPerfiles;

import java.util.Scanner;

public class HU021C5{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su especialidad: ");
        String especialidad = scanner.nextLine();

        System.out.print("Ingrese su biografía: ");
        String biografia = scanner.nextLine();

        Persona1 persona = new Persona1(nombre, especialidad, biografia);

        persona.imprimirResumen();

    }
}

class Persona1{

    private String nombre;
    private  String especialidad;
    private String biografia;


    public Persona1(String nombre, String especialidad, String biografia) {

        this.nombre = nombre;
        this.especialidad = especialidad;
        this.biografia = biografia;
    }
    public void imprimirResumen() {
        System.out.println("\n--- RESUMEN DE USUARIO ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Biografía: " + biografia);
    }

}