/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOLETIN2_CondicionalesyBucles;
import java.util.Scanner;
//GASPAR PAUCAR WILBER ANDRIHU
/**
 *
 * @author Usuario
 */
public class EJERCICIO4 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int num, contador;
        // num guardará los números introducidos
        // y contador se incrementará para llevar la cuenta de los números introducidos

        System.out.print("Introduzca un número: ");
        num=Entrada.nextInt();
        
        contador=0; // al comienzo el número de números introducidos es 0

        while(num>0){ // mientras num sea positiva
            contador =contador+1; // contador toma el valor que tuviera en este momento más uno
            // en definitiva: contador se incrementa en uno
            System.out.print("Introduzca otro número: ");
            num=Entrada.nextInt();
        }
        
        System.out.println("Se han introducido: " +contador + " números");
        // sin tener en cuenta el último número negativo.
    }
}
