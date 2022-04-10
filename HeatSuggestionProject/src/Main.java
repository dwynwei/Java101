import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int heat;
        Scanner sc = new Scanner(System.in);

        System.out.print("Sıcaklık Değerini Giriniz : ");
        heat = sc.nextInt();

        if(heat < 5){
            System.out.println("Kayağa Gidebilirsiniz...");
        }else if(heat >= 5 && heat <= 25){
            if(heat <= 15 && heat >= 10){
                System.out.println("Sinemaya Gidebilirisin...\nPikniğe Gidebilirsiniz...");
            }else if(heat < 10 && heat >= 5){
                System.out.println("Sinemaya Gidebilirsiniz...");
            }else if(heat > 15 && heat < 25){
                System.out.println("Pikniğe Gidebilirsiniz...");
            }
        }else
        {
            System.out.println("Yüzmeye Gidebilirsiniz...");
        }
    }
}
