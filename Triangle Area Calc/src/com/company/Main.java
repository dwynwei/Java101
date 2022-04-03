package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a,b,c,u,alan;
        Scanner sc = new Scanner(System.in);

        System.out.print("Üçgenin Kenar ilk Kenar Uzunluğunu Giriniz : ");
        a = sc.nextInt();

        System.out.print("Üçgenin Kenar ikinci Kenar Uzunluğunu Giriniz : ");
        b = sc.nextInt();

        c = (int) Math.sqrt((a*a) + (b*b));


        u = (a+b+c)/2;

        alan = (int) Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.printf("Üçgenin Alanı : %d",alan);

    }
}
