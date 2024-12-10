/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aceptaelreto;

import java.util.Scanner;

/**
 *
 * @author Diurno
 */
public class AceptaElReto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        //Variables
        int numeroCasos = 0;
        int numeroVeces = 0;

        //Pedir datos
        numeroVeces = reader.nextInt();

        for (int i = 0; i < numeroVeces; i++) {
            numeroCasos = reader.nextInt();
            numeroCasos = numeroCasos / 100;
            System.out.println(numeroCasos);
        }
    }
}
