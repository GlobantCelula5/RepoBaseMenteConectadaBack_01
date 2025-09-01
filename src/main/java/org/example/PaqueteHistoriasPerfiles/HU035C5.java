package org.example.PaqueteHistoriasPerfiles;

import java.util.ArrayList;

public class HU035C5 {

        public static void main(String[] args) {
            ArrayList<String> proyectos = new ArrayList<>();
            proyectos.add("Proyecto1");
            proyectos.add("Proyecto2");
            proyectos.add("Proyecto3");
            proyectos.add("Proyecto4");
            proyectos.add("Proyecto5");

            if (proyectos.size() < 5) {
                proyectos.add("Proyecto6");
                System.out.println("Proyecto agregado: Proyecto6");
            } else {
                System.out.println("Ya tienes 5 proyectos, no puedes agregar más.");
            }
            System.out.println("Proyectos actuales: " + proyectos);
        }
        
}
