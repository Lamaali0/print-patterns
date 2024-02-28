/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compundinterest.java;

import java.util.Scanner;

public class printpatterns {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(" input number of rows");
        int rows = in.nextInt();
        for (int i = 1, k = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j +"");
            }
            System.out.println();
        }

        int i, j, k;

        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= i; ++j) {
                System.out.print(j +"");
            }
            for (k = rows - i; k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
