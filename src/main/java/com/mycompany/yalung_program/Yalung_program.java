/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.yalung_program;
import java.util.Scanner;

/**
 *
 * @author CL2-PC
 */
public class Yalung_program {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello World!");
        System.out.println("Yalung Rhencel John Agustin");
        System.out.println("Enter a number: ");
        int x = input.nextInt();
        System.out.println("Enter a number: ");
        int y = input.nextInt();
        int sum, sub, multi, div;
        sum = x + y;
        sub = x - y;
        multi = y * x;
        div = y / x;
        System.out.println("Sum is: " + sum);
        System.out.println("Difference is: " + sub);
        System.out.println("Product is: " + multi);
        System.out.println("Quotient is: " + div);
    }
}
