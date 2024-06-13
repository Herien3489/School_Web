/*
 * Nombre: Eli Noe Herrera Loria
 * Programa: C01SALUDAR
 *      CODIGO DE LA MATERIA DE PROGRAMACION
 *      PIDE EL NOMBRE DEL USUARIO Y LO SALUDA 
 */

import java.util.Scanner;
public class C01Saludar {
    public static void main( String[] args){
        //Inicializacion de un objeto
        Scanner nombre = new Scanner(System.in);
        //Instrucciones para el usuario
        System.out.println("Escribe tu nombre");
        //Leer input del usuario
        String userNombre = nombre.nextLine();
        System.out.println("Bienvenid@ " + userNombre);
        nombre.close();
    }
}

