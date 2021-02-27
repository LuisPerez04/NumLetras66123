/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numletras66123;

import java.util.Scanner;

/**
 *
 * @author Atomi
 */
public class NumLetras66123 {

 //Pedir un número de 0 a 99 y mostrarlo en letras
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
 
        do {
            System.out.println("Escribe un número entero: ");
            String n = s.nextLine();
            System.out.println(Num_a_letras.cantidadConLetra(n));
        } while (true);
    }
}
    
