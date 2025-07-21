package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


            Scanner scanner=new Scanner(System.in);
            String nombre, especialidad, biografia;

        System.out.print("Ingrese su nombre: ");
            nombre= scanner.nextLine();
        System.out.print("Ingrese su especialidad: ");
            especialidad=scanner.nextLine();
        System.out.print("Ingrese su biografia: ");
            biografia=scanner.nextLine();

        System.out.println("El profesional \u001B[32m" + nombre + "\u001B[0m especializado en \u001B[32m" + especialidad + "\u001B[0m\n\u001B[32m" + biografia + "\u001B[0m");
        
    }

}