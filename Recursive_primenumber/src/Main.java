import java.util.Scanner;
public class Main {

    static void recursivenumber() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Kaç sorgu yapmak istiyorsunuz? :");
        int hak = inp.nextInt();


        while (hak > 0) {

            System.out.println("Lütfen bir sayı giriniz:");
            int sayi = inp.nextInt();
            int sayac = 0;

            for (int k = 2; k < sayi; k++) {
                if (sayi % k == 0)
                    sayac = 1;
                break;
            }
            if (sayac == 0) {
                System.out.println(sayi + " Bir asal sayıdır.");
            } else
                System.out.println(sayi + " Bir asal sayı değildir.");

            hak--;

        }

    return;
    }

        public static void main (String[]args){

            recursivenumber();
            /* 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89 ve 97 bazı asal sayılar.*/

        }
    }

