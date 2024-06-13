/* Nombre: Eli Noe Herrera Loria 
 * Fecha: 07/02/2024
 * CODIGO 2
*/

import java.util.Scanner;

public class C02Edad {
    public static void main( String[] args){
        //Inicializacion de un objeto
        Scanner datosUsuario = new Scanner(System.in);
        //Instrucciones para el usuario
        System.out.println("Escribe tu nombre");
        //Leer input del usuario
        String nombre = datosUsuario.nextLine();
        //Instrucciones de edad
        System.out.println("Ingresa tu edad");
        //Leer el input de edad
        int edad = datosUsuario.nextInt();
        //Imprimimos el resultado
        System.out.println("Bienvenid@ " + nombre + "Tienes " + edad + "años");
        datosUsuario.close();
    }
}

