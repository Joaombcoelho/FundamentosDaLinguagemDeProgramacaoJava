package org.example;

import java.util.Scanner;

public class mjönir {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        if (!leitor.hasNextInt()) {
            leitor.close();
            return;
        }
        int C = leitor.nextInt();
        String nome;
        int N;

        for (int i = 0; i < C; i++) {
            if (!leitor.hasNext()) break;
            nome = leitor.next();
            if (!leitor.hasNextInt()) break;
            N = leitor.nextInt();

            if (nome.equals("Thor")) System.out.println("Y");
            else System.out.println("N");
        }
        leitor.close();
    }
}
