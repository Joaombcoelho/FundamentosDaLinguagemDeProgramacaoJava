package org.example;
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B;

        A = sc.nextInt();
        B = sc.nextInt();
        var PROD = A * B;

                System.out.println("PROD = " +  PROD);
                sc.close();
    }
}