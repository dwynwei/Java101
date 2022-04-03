package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double kmExpense = 2.20, km, total, startPrice = 10;

        Scanner sc = new Scanner(System.in);
        System.out.print("Gitmek İstediğiniz mesafeyi KM cinsinden Giriniz : ");
        km = sc.nextDouble();

        total = km*kmExpense;
        total += startPrice;
        total = (total < 20) ? 20 : total;
        System.out.print("Toplam Tutar : " + total);

    }
}
