import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num = 0, total = 0;
        Scanner sc = new Scanner(System.in);

        while (num%2==0){
            System.out.print("( Tek Sayı Girerseniz Çıkış Yapılır ) Bir Sayı Giriniz : ");
            num = sc.nextInt();
            if(num%4 == 0){
                total += num;
                System.out.printf("Summation : %d\n",total);
            }
        }
    }
}
