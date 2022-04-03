package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5;
        double total = 0;
        int kg;

        Scanner sc = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo : ");
        kg = sc.nextInt();
        total += totalPrice(armut,kg);

        System.out.print("Elma Kaç Kilo : ");
        kg = sc.nextInt();
        total += totalPrice(elma,kg);

        System.out.print("Domates Kaç Kilo : ");
        kg = sc.nextInt();
        total += totalPrice(domates,kg);

        System.out.print("Muz Kaç Kilo : ");
        kg = sc.nextInt();
        total += totalPrice(muz,kg);

        System.out.print("Patlican Kaç Kilo : ");
        kg = sc.nextInt();
        total += totalPrice(patlican,kg);

        System.out.print("Toplam Tutar : " + total);

    }

    public static double totalPrice (double expense, int kg)
    {
        double total = expense*kg;
        return total;
    }
}
