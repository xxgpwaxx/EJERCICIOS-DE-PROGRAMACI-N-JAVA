/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOLETIN1_VariablesyCondicionales;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class EJERCICIO20 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int h,m,s; // hora, minutos y segundos
        System.out.print("Introduzca hora: ");
        h=Entrada.nextInt();
        System.out.print("Introduzca minutos: ");
        m=Entrada.nextInt();
        System.out.print("Introduzca segundos: ");
        s=Entrada.nextInt();
        // suponemos que la hora introducida es correcta

        // incrementamos los segundos
        s ++;
        // si los segundos superan 59, los reiniciamos a 0 e incrementamos los minutos
        if (s >= 60)
        {
        s = 0;
        m ++;
        // si los minutos superan 59, los reiniciamos a 0 e incrementamos la hora
        if (m >= 60)
        {
        m = 0;
        h ++;
        // si la hora supera 23, la reiniciamos a 0
        if (h>=24)
        h=0;
        }
        }
        System.out.println ("Fecha: "+ h + ":"+ m + ":" + s);
    }
}
