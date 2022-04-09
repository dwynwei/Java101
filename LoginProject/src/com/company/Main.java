package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String userName, currentPass, oldPass, errPass, newPass;

        Scanner sc = new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz : ");
        userName = sc.nextLine();

        System.out.print("Şifrenizi Oluşturunuz : ");
        currentPass = sc.nextLine();

        oldPass = currentPass;

        System.out.print("Giriş Yapmak İçin Şifrenizi Giriniz : ");
        currentPass = sc.nextLine();
        errPass = currentPass;

        if(!currentPass.equals(oldPass) || !errPass.equals(oldPass)){
            System.out.println("Şifrenizi Yanlış Girdiniz...");
            while(true){
                System.out.print("Lütfen Şifrenizi Tekrar Oluşturunuz : ");
                newPass = sc.nextLine();
                if(newPass.equals(oldPass) || newPass.equals(errPass)){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                }else{
                    System.out.println("Şifre oluşturuldu");
                    break;
                }
            }

        }

    }
}
