import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try{
            int math, physics, chem, music, turkish;
            double total = 0, cnt = 0;
            Scanner inp = new Scanner(System.in);


            System.out.print("Maths Enter Score :");
            math = inp.nextInt();
            if (!(math <= 0 || math >= 100)) {
                total += math;
                cnt++;
            }
            System.out.print("Physics Enter Score :");
            physics = inp.nextInt();
            if (!(physics<= 0 || physics >= 100)) {
                total += physics;
                cnt++;
            }
            System.out.print("Music Enter Score :");
            music = inp.nextInt();
            if (!(music <= 0 || music >= 100)) {
                total += music;
                cnt++;
            }
            System.out.print("Chemical Enter Score :");
            chem = inp.nextInt();
            if (!(chem <= 0 || chem >= 100)) {
                total += chem;
                cnt++;
            }
            System.out.print("Turkish Enter Score :");
            turkish = inp.nextInt();
            if (!(turkish <= 0 || turkish >= 100)) {
                total += turkish;
                cnt++;
            }

            if (total/cnt<55){
                System.out.println("Your failed the class");
            }else{
                System.out.println("Your Passed");
            }
        }catch (ArithmeticException ep){
            ep.printStackTrace();
        }

    }
}
