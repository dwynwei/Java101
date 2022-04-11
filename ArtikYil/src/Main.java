import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int year;
        Scanner sc = new Scanner(System.in);

        System.out.print("Lütfen Yıl Giriniz : ");
        year = sc.nextInt();

        if(year%4 == 0){
            System.out.printf("%d bir Artık Yıldır !",year);
        }else {
            System.out.printf("%d bir Artık Yıl Değildir !",year);
        }
    }
}
