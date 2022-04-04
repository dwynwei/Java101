package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n1, n2, select;

        Scanner sc = new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz : ");
        n1 = sc.nextInt();

        System.out.print("2. Sayıyı Giriniz : ");
        n2 = sc.nextInt();

        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n");
        System.out.print("Seçim Yapınız : ");
        select = sc.nextInt();
        if(select < 1 && select > 4){
            System.out.print("Geçersiz Sayı Girdiniz !");
        }else{
            switch (select) {
                case 1 :
                    System.out.printf("%d ve %d ' nin Toplamı : " + (n1+n2), n1, n2);
                    break;

                case 2 :
                    System.out.printf("%d ve %d ' nin Toplamı : " + (n1-n2), n1, n2);
                    break;

                case 3 :
                    System.out.printf("%d ve %d ' nin Toplamı : " + (n1*n2), n1, n2);
                    break;

                case 4 :
                    if(n2==0){
                        System.out.println("2. Sayı Sıfır Olamaz");
                    }else{
                        System.out.printf("%d ve %d ' nin Toplamı : " + (n1/n2), n1, n2);
                        break;
                    }

            }
        }



    }
}
