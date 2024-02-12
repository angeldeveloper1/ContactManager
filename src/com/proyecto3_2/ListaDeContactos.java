package com.proyecto3_2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ListaDeContactos {

    private ArrayList<Contactos> listaContactos;
    private Scanner sc;

    public ListaDeContactos(Scanner sc) {
        listaContactos = new ArrayList<Contactos>();
        this.sc = sc;
    }

    public void agregarContactos() {
        System.out.println("Ingrese el Nombre de la persona");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el Apellido de la persona");
        String apellido = sc.nextLine();
        System.out.println("Ingrese el Genero de la persona");
        String genero = sc.nextLine();
        Contactos contactos = new Contactos(nombre, apellido, genero);
        listaContactos.add(contactos);
        System.out.println("Se ha agregado al contacto");
    }

    public void eliminarContactos() throws InputMismatchException{
        try {
            System.out.println("Ingrese la posicion del contacto que desea eliminar");
            int posicion = sc.nextInt();
            sc.nextLine();

            if (posicion >= 0 && posicion < listaContactos.size()) {
                Contactos contactos = listaContactos.get(posicion);
                listaContactos.remove(contactos);
                System.out.println("Se ha eliminado la persona del contacto");
            } else {
                System.out.println("No existe el contacto de esa posicion");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error, intente nuevamente ingresando la posicion del contacto (0,1,2,3,etc...)");
            sc.nextLine();
        }

    }

    public void editarContactos() throws InputMismatchException{
        try {
            System.out.println("Ingrese la posicion del contacto que desea editar");
            int posicion = sc.nextInt();
            sc.nextLine();

            if (posicion >= 0 && posicion < listaContactos.size()) {
                System.out.println("Que desea editar de este contacto");
                System.out.println("1. El nombre");
                System.out.println("2. El apellido");
                System.out.println("3. El genero");
                int opcion = sc.nextInt();
                sc.nextLine();
                if (opcion < 1 || opcion > 3) {
                    System.out.println("Opcion incorrecta");
                } else {
                    if (opcion == 1) {
                        System.out.println("Edita el nombre");
                        String nombre = sc.nextLine();
                        Contactos contactos = listaContactos.get(posicion);
                        contactos.setNombre(nombre);
                        System.out.println("Ha editado el nombre correctamente");
                    }
                    if (opcion == 2) {
                        System.out.println("Edita el apellido");
                        String apellido = sc.nextLine();
                        Contactos contactos = listaContactos.get(posicion);
                        contactos.setApellido(apellido);
                        System.out.println("Ha editado el apellido correctamente");
                    }
                    if (opcion == 3) {
                        System.out.println("Edita el genero");
                        String genero = sc.nextLine();
                        Contactos contactos = listaContactos.get(posicion);
                        contactos.setGenero(genero);
                        System.out.println("Ha editado el genero correctamente");
                    }
                }
            } else {
                System.out.println("No existe el contacto de esa posicion");
            }
        } catch (InputMismatchException e){
            System.out.println("Error, intente nuevamente ingresando la posicion del contacto (0,1,2,3,etc...)");
            sc.nextLine();
        }

    }

    public void mostrarContactos() {
        if (listaContactos.size() == 0) {
            System.out.println("No hay ningun contacto");
        } else {
            for (int i = 0; i < listaContactos.size(); i++) {
                System.out.println(i + ". " + listaContactos.get(i).toString());
            }
        }
    }

}
