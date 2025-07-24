package org.example.PaqueteHistoriasPerfiles;

import java.util.ArrayList;
import java.util.Scanner;

public class HU023C5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> Proyectos = new ArrayList<>();

        byte opcionInicial;


        System.out.println("   Bienvenido al portafolio de proyectos   ");

        do {
            System.out.print("Deseas:" +
                    "\n  1.Ingresar proyecto al protafolio" +
                    "\n  2.Ver los proyectos guardados" +
                    "\nIngrese el numero de opcion: ");
            opcionInicial = scanner.nextByte();
        }while (opcionInicial != 1 && opcionInicial !=2);

        if (opcionInicial == 1) {
            String nombreProyecto,descripcionProyecto;
        }

        else{

        }


    }
}
