package com.company;
import java.util.Scanner;

public class OperazioniAritmetiche {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter b:");
        int b=sc.nextInt();
        computeValues(a, b);

        evenOrNot(a);
    }

    private static void computeValues(int a, int b) {
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a+b);
        System.out.println(a-b);
    }
    private static void evenOrNot(int a) {
        int resto = a%2;
        if(resto==1) System.out.println("Dispari\n");
        else System.out.println("Pari\n");
    }
}
