/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin1;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class EJERCICIO11 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int num;
        System.out.print("Introduzca un número entre 0 y 99.999: ");
        num=Entrada.nextInt();
        if(num<10){
            System.out.println("tiene 1 cifra");
        }else if(num<100){
            System.out.println("tiene 2 cifras");
        }else if(num<1000){
            System.out.println("tiene 3 cifras");
        }else if(num<10000){
            System.out.println("tiene 4 cifras");
        }else if(num<100000){
            System.out.println("tiene 5 cifras");
        }
    }
}
