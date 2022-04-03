package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double kg, height, bmi;

        Scanner sc = new Scanner(System.in);

        System.out.print("Kilogram Bilgisini Giriniz : ");
        kg = sc.nextDouble();

        System.out.print("Boy Bilgisini Giriniz (Metre Cinsinden) : ");
        height = sc.nextDouble();

        bmi = kg /(height*height);

        System.out.println("Boy Kütle Endeksiniz : " + bmi);
    }
}
