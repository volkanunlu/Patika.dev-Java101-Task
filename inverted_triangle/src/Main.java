import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        int sayi = inp.nextInt();

        int i;

        for (i = sayi; i > 0; i--) {
            for (int j = (sayi - i); j > 0; j--)
            {
                System.out.print(" ");    // Boşluk kısmı
            }


            for (int j = (2 * i + 1); j > 2; j--) //ters üçgen olacağı için döngüyü azaltarak ilerledik.
            {
                System.out.print("*");     //Ekrana yıldız bas.
            }
            System.out.println("");
        }
    }
}