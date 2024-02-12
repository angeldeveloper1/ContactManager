package com.proyecto3_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ListaDeContactos listaContactos = new ListaDeContactos(sc);

        boolean condicion = true;
        while (condicion){
            System.out.println("Lista de Contactos");
            System.out.println("1. Agregar Contactos");
            System.out.println("2. Eliminar Contactos");
            System.out.println("3. Editar Contactos");
            System.out.println("4. Mostrar Contactos");
            System.out.println("5. Salir");
            int opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1){
                listaContactos.agregarContactos();
            }
            if (opcion==2){
                listaContactos.eliminarContactos();
            }
            if (opcion==3){
                listaContactos.editarContactos();
            }
            if (opcion==4){
                listaContactos.mostrarContactos();
            }
            if (opcion==5){
                System.out.println("Hasta pronto!");
                condicion = false;
            }

        }

    }
}
