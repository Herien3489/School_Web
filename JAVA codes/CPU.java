
import java.util.Scanner;
public class CPU {
    private int acumulador;

    //Definicion de un acumulador
    public CPU() {
        this.acumulador = 0;
    }
    //Instrucciones paraa cargar valores al acumulador
    public void cargar(int valor) {
        this.acumulador = valor;
        System.out.println(valor + "cargado en el acumulador");
    }
    //Instrucciones para sumar inputs al acumulador
    public void sumar(int valor) {
        this.acumulador += valor;
    }
    //Instrucciones para restar inputs al acumulador
    public void restar(int valor) {
        this.acumulador -= valor;
    }
    //Intrucciones para multiplicar inputs
    public void multiplicar(int valor) {
        this.acumulador *= valor;
    }
    //Instrucciones para dividir
    public void dividir(int valor) {
        if (valor != 0) {
            this.acumulador /= valor;
        } else {
            //No se puede dividir entre cero
            System.out.println("Error! Division entre cero");
        }
    }
    //Instrucciones para retornar el acumulador
    public int obtenerAcumulador() {
        return acumulador;
    }
    public static void main( String[] args ) {
        CPU cpu = new CPU();
        Scanner datos = new Scanner(System.in);

        System.out.println("CPU single core ilentium");
        System.out.println("Cargar numero entero");

        cpu.cargar(datos.nextInt());

        System.out.println("Numero a sumar");
        cpu.sumar(datos.nextInt());
        System.out.println("Acumulador despues de sumar: " + cpu.obtenerAcumulador());

        System.out.println("Numero a restar");
        cpu.restar(datos.nextInt());
        System.out.println("Acumulador despues de restar: " + cpu.obtenerAcumulador());

        System.out.println("Numero a multiplicar");
        cpu.multiplicar(datos.nextInt());
        System.out.println("Acumulador despues de multiplicar: " + cpu.obtenerAcumulador());

        System.out.println("Numero a dividir");
        cpu.dividir(datos.nextInt());
        System.out.println("Acumulador despues de dividir: " + cpu.obtenerAcumulador());

        System.out.println("Dividir entre cero");
        cpu.dividir(0);

        datos.close();
    }
}
