import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int month, day;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Please Enter Month in Number : ");
            month = sc.nextInt();
            System.out.print("Please Enter Day in Number : ");
            day = sc.nextInt();

            if((month==1&&day<=20)||(month==12&&day>=21)){
                System.out.print("Your Zodiac is Capricorn...");
            }
            else if((month==1&&day>=21)||(month==2&&day<=19)){
                System.out.print("Your Zodiac is Aquarius...");
            }
            else if((month==2&&day>=20)||(month==3&&day<=20)){
                System.out.print("Your Zodiac is Pisces...");
            }
            else if((month==3&&day>=21)||(month==4&&day<=20)){
                System.out.print("Your Zodiac is Aries...");
            }
            else if((month==4&&day>=21)||(month==5&&day<=20)){
                System.out.print("Your Zodiac is Taurus...");
            }
            else if((month==5&&day>=21)||(month==6&&day<=21)){
                System.out.print("Your Zodiac is Gemini...");
            }
            else if((month==6&&day>=22)||(month==7&&day<=22)){
                System.out.print("Your Zodiac is Cancer...");
            }
            else if((month==7&&day>=23)||(month==8&&day<=23)){
                System.out.print("Your Zodiac is Leo...");
            }
            else if((month==8&&day>=24) || (month==9&&day<=23)){
                System.out.print("Your Zodiac is Virgo...");
            }
            else if((month==9&&day>=24)||(month==10&&day<=23)){
                System.out.print("Your Zodiac is Libra...");
            }
            else if((month==10&&day>=24)|| (month==11&&day<=22)){
                System.out.print("Your Zodiac is Scorpio...");
            }
            else if((month==11&&day>=23)||(month==12&&day<=21)){
                System.out.print("Your Zodiac is Sagittarius...");
            }

        }catch (NumberFormatException e){
            e.printStackTrace();
        }

    }
}
