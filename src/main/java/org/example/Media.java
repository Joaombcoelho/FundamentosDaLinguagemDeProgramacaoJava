package org.example;

import java.util.Scanner;

public class Media {
   // public static void main(String[] args) {
       // double A = 5.0;
        //double B = 7.1;
       // double C = 8.0;

        //double MEDIA = (A * 2 + B * 3 + C * 5) / (2 + 3 + 5);

        //System.out.printf("MEDIA = %.1f%n", MEDIA);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B, media;

        A = sc.nextDouble();
        B = sc.nextDouble();

        media = (A * 3.5 + B * 7.5)/11;

        System.out.printf("MEDIA = %.5f", media );
        //System.out.println();
    }
}
