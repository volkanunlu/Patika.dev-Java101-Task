import java.util.Scanner;

public class Main {


    //Klavyeden girilen sayıya kadar 3 ve 4'e tam bölünen sayıları ekrana yazdıran program.
    public static void main(String[]args) {
        int sayi;

        Scanner inp = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz:");
        sayi = inp.nextInt();

        for (int i = 0; i <= sayi; i++)
        {
            if ((i % 3 == 0) && (i % 4 == 0))
            {
                System.out.println("3 ve 4'e tam bölünen sayılar:\n" +i );
            }


        }
    }



}
