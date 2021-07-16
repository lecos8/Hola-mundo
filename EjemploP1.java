import java.util.Scanner;
public class EjemploP1{
    public static void main(String[] args){
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int Numero = Teclado.nextInt();
        System.out.println("El doble del numero ingresado es:  " + Numero*2);    
        System.out.println("El triple del numero ingresado es:  " + Numero*3);  
    }
}