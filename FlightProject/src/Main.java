import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int km, age, rotation;
        double total, expense;
        Scanner sc = new Scanner(System.in);

        System.out.print("Lütfen Mesafeyi KM Cinsinden Giriniz : ");
        km = sc.nextInt();
        System.out.print("Lütfen Yaşınızı Giriniz : ");
        age = sc.nextInt();
        System.out.print("Lütfen Rotasyon Seçiniz\n(1) Gidiş\n(2) Gidiş-Dönüş\n : ");
        rotation = sc.nextInt();

        expense = km * 0.10;

        if(km <= 0 || age <= 0){
            if(rotation != 1 || rotation != 2){
                System.out.println("Hatalı Veri Girdiniz !");
            }
        }else{
            if(age < 12){
                if(rotation == 2){
                    double lessAgeDiscount = expense * 0.5 * 0.2;
                    System.out.printf("Yaş İndirimli Tutar %.2f TL",lessAgeDiscount);
                }else {
                    double lessAgeDiscount = expense * 0.5;
                    System.out.printf("Yaş İndirimli Tutar %.2f TL",lessAgeDiscount);
                }

            }else if(age >= 12 && age <=24){
                if(rotation == 2){
                    double midAgeDiscount = expense * 0.1 * 0.2;
                    System.out.printf("İndirimli Tutar %.2f TL",midAgeDiscount);
                }else {
                    double midAgeDiscount = expense * 0.1;
                    System.out.printf("İndirimli Tutar %.2f TL",midAgeDiscount);
                }

            }else if(age >= 65){
                if(rotation == 2){
                    double greatAgeDiscount = expense * 0.3 * 0.2;
                    System.out.printf("Yaşlı İndirimli Tutar %.2f TL",greatAgeDiscount);
                }else {
                    double greatAgeDiscount = expense * 0.3;
                    System.out.printf("Yaşlı İndirimli Tutar %.2f TL",greatAgeDiscount);
                }
            }else if(age > 24 && age < 65){
                if(rotation == 2){
                    double price = expense * 0.2;
                    System.out.printf("Gidiş Dönüş İndirimli Tutar %.2f TL",price);
                }else {
                    System.out.printf("Gidiş Dönüş İndirimli Tutar %.2f TL",expense);
                }
            }
        }

    }
}
