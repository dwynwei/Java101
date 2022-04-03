package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int r;
        double pi = 3.14;

        Scanner sc = new Scanner(System.in);

        System.out.print("Daire için çap giriniz : ");
        r = sc.nextInt();

        double area = pi*Math.pow(r,2); //r*r;
        double perimeter = 2*pi*r;

        System.out.println("Alan = " + area);
        System.out.println("Çevre = " + perimeter);
    }
}
