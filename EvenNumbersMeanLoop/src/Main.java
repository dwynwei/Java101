import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num = 0, count = 0, total = 0;
        double median;
        Scanner sc = new Scanner(System.in);

        System.out.print("Lütfen Bir Sayı Giriniz : ");
        num = sc.nextInt();

        for(int i = 0; i <= num; i++){
            if(i==0){
                i=1;
            }
            if(i%3==0 && i%4==0){
                total += i;
                count++;
                continue;
            }
        }

        median = total/count;

    }
}
