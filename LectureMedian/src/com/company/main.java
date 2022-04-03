package com.company;

import java.util.Scanner;
import java.util.Stack;

public class main {

    public static void main(String[] args){
        int fiz, mat, kim, tur, tar, muz;
        int total;
        double median;

        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Fizik Notunuzu Giriniz : ");
            fiz = sc.nextInt();

            System.out.print("Matematik Notunuzu Giriniz : ");
            mat = sc.nextInt();

            System.out.print("Kimya Notunuzu Giriniz : ");
            kim = sc.nextInt();

            System.out.print("Türkçe Notunuzu Giriniz : ");
            tur = sc.nextInt();

            System.out.print("Tarih Notunuzu Giriniz : ");
            tar = sc.nextInt();

            System.out.print("Müzik Notunuzu Giriniz : ");
            muz = sc.nextInt();

            total = fiz + mat + kim + tur + tar + muz;
            median = total / 6;

            if(median > 60 && median < 100){
                System.out.print("Sınıfı Geçti");
            }else if(median <=60){
                System.out.print("Sınıfta Kaldı");
            }else{
                System.out.print("Geçersiz Not Girişi");
            }
        }catch (NumberFormatException e){
            e.printStackTrace();
        }

    }

}

