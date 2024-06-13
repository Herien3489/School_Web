/* Nombre: cesar alejandro lopezgomez
 * Fecha: 28.02.2024
 * Programa: DecimalHexadecimal
 *  */
import java.util.Scanner;
public class DecimalHexadecimal{
    public static void decimalAHexadecimal(){
	Scanner escanerDecimal = new Scanner(System.in);
	System.out.printf("Escribe el entero decimal a convertir");
	int decimal = escanerDecimal.nextInt();

	String hexadecimal = Integer.toHexString(decimal).toUpperCase();
	
	System.out.printf("Decimal %d == hexadecimal %s\n", decimal, hexadecimal);
	escanerDecimal.close();
    }
    public static void hexadecimalADecimal(){
	Scanner escanerHexadecimal = new Scanner(System.in);
	System.out.printf("Escribe el numero Hexadecimal a convertir: ");
	String hexadecimal = escanerHexadecimal.next();
	
	int decimal = Integer.parseInt(hexadecimal, 16);

	System.out.printf("Hexadecimal %s == Decimal %s\n", hexadecimal, decimal);
	escanerHexadecimal.close();
    }
    public static void main(String[] args){
	Scanner escaner = new Scanner(System.in);
	int opcion;
	System.out.println("Elige la conversión que desees");
	System.out.println("(1) Conversión a Hexadecimal");
	System.out.println("(2) Conversión a Decimal");
	System.out.println("");
	opcion = escaner.nextInt();
	switch(opcion) {
		case 1:
			decimalAHexadecimal();
			break;
		case 2:
			hexadecimalADecimal();
			break;
		default:
			System.out.println("Opcion invalida");
	}
	escaner.close();
    }
}