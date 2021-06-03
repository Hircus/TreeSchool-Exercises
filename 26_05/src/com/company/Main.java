package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a= sc.nextInt();
        System.out.print("Enter b:");
        int b= sc.nextInt();
        computeValues(a, b);

        evenOrNot(a);
    }

    private static void computeValues(int a, int b) {
        int molt = a*b;
        int div = a/b;
        int sum = a+b;
        int diff = a-b;
        System.out.println("La moltiplicazione: " + molt + "\nLa divisione: " +
                div + "\nL'addizione: " + sum + "\nLa sottrazione: " + diff);
    }

    private static void evenOrNot(int a) {
        if(a%2==1) System.out.println("\n\nDispari");
        else System.out.println("\n\nPari");
    }
}
