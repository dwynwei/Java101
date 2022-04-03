package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double tutar, toplam = 0, kdvliToplam;
        double[] kdv = new double[] {0.08,0.18};

        Scanner sc = new Scanner(System.in);

        System.out.print("Lütfen Tutarı Giriniz : ");
        tutar = sc.nextInt();

        if(tutar < 1000 && tutar > 0){
            toplam = tutar*kdv[1];
            kdvliToplam = tutar + toplam;
            System.out.printf("Toplam(KDV Dahil) : %.2f%n",kdvliToplam);
        }else {
            toplam = tutar*kdv[0];
            kdvliToplam = tutar + toplam;
            System.out.printf("Toplam(KDV Dahil) : %.2f%n",kdvliToplam);
        }
    }
}
